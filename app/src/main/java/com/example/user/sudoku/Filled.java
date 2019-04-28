package com.example.user.sudoku;

import android.widget.Button;

public class Filled {
    private Button button;
    private int num;

    public Filled(Button button, int num) {
        this.button = button;
        this.num = num;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
