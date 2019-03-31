package com.example.user.sudoku;

import android.graphics.Bitmap;

public class Square {

    private int value;
    private boolean given;
    private Location location;

    public Square(Bitmap res, int width, int height, int value) {
        this.value = value;
        this.given = given;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isGiven() {
        return given;
    }

    public void setGiven(boolean given) {
        this.given = given;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}