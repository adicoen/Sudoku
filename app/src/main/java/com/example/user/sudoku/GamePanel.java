package com.example.user.sudoku;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {

    // Now we will set our game screen width and height
    // display size are in pixels
    public static int WIDTH;
    public static int HEIGHT;
    // canvas of the game, canvas will help us to draw bitmap images on screen
    public static Canvas canvas;
    /**
     * @ surfaceholder this is for holding the current surface
     */
    SurfaceHolder surfaceHolder;
    GameLogic gameLogic;
    // add reference to music
    MediaPlayer mediaPlayer;

    //TODO , 5-2, add reference to sounds
    // sounds
    SoundPool hitSound;
    int hitSoundID;
    SoundPool getHomeSound;
    int getHomeSoundID;


    // our images
    FullBoard fullBoard;
    // TODO , lesson 5, add references to new images


    // score of the sword man
    int score;


    /**
     * constructor of Main Class, that is going to help us calling objects and methods!
     *
     * @param context the context that is passed to GamePanel
     * @param WIDTH   the width of the android device screen in pixels
     * @param HEIGHT  the height of the android device screen in pixels
     */
    public GamePanel(Context context, int WIDTH, int HEIGHT) {
        super(context);

        // create Game Login object
        gameLogic = new GameLogic(this);

        // set the max screen parameters of the android device size

        // TODO 7,
        setWIDTH(WIDTH);
        setHEIGHT(HEIGHT);
        /*
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        */

        // music, this is for long music files
        mediaPlayer = MediaPlayer.create(context, R.raw.arcademusicloop);

        // TODO 5-2,  create object of sounds
        hitSound = new SoundPool(99, AudioManager.STREAM_MUSIC, 0);
        hitSoundID = hitSound.load(context, R.raw.hit, 1);

        getHomeSound = new SoundPool(99, AudioManager.STREAM_MUSIC, 0);
        getHomeSoundID = getHomeSound.load(context, R.raw.gethome, 1);

        //add the callback to the surfaceholder to intercept events
        getHolder().addCallback(this);

    }//end of content view constructor

    // getter for the screen size, for other classes use
    public static int getWIDTH() {
        return WIDTH;
    }

    /**
     * @param WIDTH set screen width para
     */
    public static void setWIDTH(int WIDTH) {
        GamePanel.WIDTH = WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    /**
     * @param HEIGHT set screen height
     */
    public static void setHEIGHT(int HEIGHT) {
        GamePanel.HEIGHT = HEIGHT;
    }

    @Override
    /**
     This is called immediately after the surface is created
     */
    public void surfaceCreated(SurfaceHolder holder) {

        // to point to the surface we are using, for example for the canvas
        surfaceHolder = this.getHolder();

        // crete sword man
        fullBoard = new FullBoard(BitmapFactory.decodeResource(getResources(), R.drawable.fullboard),
                96, 96);
        // set coordinates x, y
        // TODO lesson 5, update new x,y here
        fullBoard.setX(WIDTH / 2 + 200);
        fullBoard.setY(HEIGHT / 2 + 200);


        // update and draw the sword man
        this.update();
        this.draw(canvas);

    } // end of surfaceCreated

    /**
     * This is called immediately after any structural changes (format or size)
     * have been made to the surface.
     *
     * @param holder
     * @param format
     * @param width
     * @param height
     */
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * This is called immediately before a surface is being destroyed.
     *
     * @param holder this holds the current surface
     */
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    /**
     * //onTouchEvent method to know if we touch or not the screen
     *
     * @param event this is for any touch event on the screen
     * @return this return if the touch event is handled
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        // here we put our code for touch events

        // lets move our sword man to new location  on screen
        int xPosition = (int) event.getX();
        int yPosition = (int) event.getY();

        // set the x, and y coordinates of sword man
        fullBoard.setX(xPosition);
        fullBoard.setY(yPosition);

        this.update();
        this.draw(canvas);

        return super.onTouchEvent(event);
    }

    /**
     * in content view (Game panel we must constantly update our image)
     * Gamepanel cooperates with our thread
     * So our game run a new game loop every second....
     */
    public void update() {
        // set playing music
        mediaPlayer.setVolume(0.1f, 0.1f);
        mediaPlayer.start();

        // TODO, Lesson 5, Fix from from lesson 4, move it here
        fullBoard.update();
        // TODO , lesson 5, add to update methods

        // TODO , lesson 7, game logic and algorithm
        // perform game logic
        gameLogic.check_Logic();


    }//end update


    // TODO, lesson 7, add getters and setters

    /**
     * GamePanel draw method , SurfaceView override method
     *
     * @param canvas the canvas we are using for drawing any
     *               it holds the graphics info, that are in BitMap
     *               BitMap - holds our bit map image(s)
     */
    @Override
    public void draw(Canvas canvas) {

        //we lock/point canvas to our content view
        canvas = surfaceHolder.lockCanvas();

        // call the super class
        super.draw(canvas);

        // This is the color ( background color) of our canvas
        canvas.drawColor(Color.GRAY);

        fullBoard.draw(canvas);
        // TODO , lesson 5, add to draw methods
        drawText(canvas);

        // unlock from content view, and post the draw - draw it !!!
        surfaceHolder.unlockCanvasAndPost(canvas);

    }//end draw

    /**
     * @param canvas this is our canvas for drawing on it
     */
    public void drawText(Canvas canvas) {

        // create a new painter for our drawing on the canvas
        // like text color, circle, rectangle, and more
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(30);

        // set text to Bold
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
        // write score
        canvas.drawText("Score: " + score, 30, 30, paint);

        // write text,
        canvas.drawText("This is Sword's house", 100, 240, paint);

        // TODO , lesson 5, remove the circles and the rectangle draw.


    }// end drawText

    /**
     * @return return the sound of hit
     */
    public SoundPool getHitSound() {
        return hitSound;
    }


    /**
     * @return return hit sound ID
     */
    public int getHitSoundID() {
        return hitSoundID;
    }

    /**
     * @return return get home sound
     */
    public SoundPool getGetHomeSound() {
        return getHomeSound;
    }

    /**
     * @return return home sound ID
     */
    public int getGetHomeSoundID() {
        return getHomeSoundID;
    }


    /**
     * @return return Sword man object
     */
    public FullBoard getFullBoard() {
        return fullBoard;
    }


    /**
     *
     * @return return iceMonster object
     */


    /**
     * @return return score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score set score
     */
    public void setScore(int score) {
        this.score = score;
    }
}//end of class