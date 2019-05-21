package com.example.user.sudoku;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {

    public static int WIDTH;
    public static int HEIGHT;
    public static Canvas canvas;


    SurfaceHolder surfaceHolder;
    GameLogic gameLogic;

    MediaPlayer mediaPlayer;

    SoundPool hitSound;
    int hitSoundID;
    SoundPool getHomeSound;
    int getHomeSoundID;

    FullBoard fullBoard;
    HalfBoard halfBoard;
    EmptyBoard emptyBoard;


    public GamePanel(Context context, int WIDTH, int HEIGHT) {
        super(context);

        gameLogic = new GameLogic(this);


        setWIDTH(WIDTH);
        setHEIGHT(HEIGHT);

        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;


        /*mediaPlayer = MediaPlayer.create(context, R.raw.arcademusicloop);

        hitSound = new SoundPool(99, AudioManager.STREAM_MUSIC, 0);
        hitSoundID = hitSound.load(context, R.raw.hit, 1);

        getHomeSound = new SoundPool(99, AudioManager.STREAM_MUSIC, 0);
        getHomeSoundID = getHomeSound.load(context, R.raw.gethome, 1);*/
        getHolder().addCallback(this);

    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static void setWIDTH(int WIDTH) {
        GamePanel.WIDTH = WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }


    public static void setHEIGHT(int HEIGHT) {
        GamePanel.HEIGHT = HEIGHT;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        surfaceHolder = this.getHolder();
        fullBoard = new FullBoard(BitmapFactory.decodeResource(getResources(), R.drawable.o9csk),
                359, 359, WIDTH / 2 + 200, HEIGHT / 2 + 200);


        halfBoard = new HalfBoard(BitmapFactory.decodeResource(getResources(), R.drawable.o9csk),
                359, 359, 2 * WIDTH, 2 * HEIGHT);

        emptyBoard = new EmptyBoard(BitmapFactory.decodeResource(getResources(), R.drawable.o9cskb),
                359, 359, 2 * WIDTH, 2 * HEIGHT);

        this.update();
        this.draw(canvas);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        int xPosition = (int) event.getX();
        int yPosition = (int) event.getY();

        if (Math.sqrt(Math.pow((WIDTH / 2 + 200) - xPosition, 2) + Math.pow((HEIGHT / 2 + 200) - yPosition, 2)) <= 255) {
            if (emptyBoard.getX() == WIDTH / 2 + 200) {
                emptyBoard.setX(2 * WIDTH);
                emptyBoard.setY(2 * HEIGHT);
                halfBoard.setX(WIDTH / 2 + 200);
                halfBoard.setY(HEIGHT / 2 + 200);
            } else if (halfBoard.getX() == WIDTH / 2 + 200) {
                halfBoard.setX(2 * WIDTH);
                halfBoard.setY(2 * HEIGHT);
                fullBoard.setX(WIDTH / 2 + 200);
                fullBoard.setY(HEIGHT / 2 + 200);
            } else {
                fullBoard.setX(2 * WIDTH);
                fullBoard.setY(2 * HEIGHT);
                emptyBoard.setX(WIDTH / 2 + 200);
                emptyBoard.setY(HEIGHT / 2 + 200);
            }
        }

        this.update();
        this.draw(canvas);

        return super.onTouchEvent(event);
    }

    public void update() {
        mediaPlayer.setVolume(0.1f, 0.1f);
        mediaPlayer.start();

        fullBoard.update();
        halfBoard.update();
        emptyBoard.update();
        gameLogic.check_Logic();


    }


    public void drawText(Canvas canvas) {

        Paint paint = new Paint();
    }

    public SoundPool getHitSound() {
        return hitSound;
    }


    public int getHitSoundID() {
        return hitSoundID;
    }

    public SoundPool getGetHomeSound() {
        return getHomeSound;
    }


    public int getGetHomeSoundID() {
        return getHomeSoundID;
    }


    public FullBoard getFullBoard() {
        return fullBoard;
    }


}