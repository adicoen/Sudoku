package com.example.user.sudoku;

//TODO figure out what to put here. int result = Integer.parseInt(number);
public class GameLogic {
    public boolean isExist(Square square, Square[][] board, int chosenValue) {
        if (square.isGiven())
            return true;
        int x = square.getLocation().getX();
        int y = square.getLocation().getY();
        int boxX = x / 3;
        boxX = boxX * 3;
        int boxY = y / 3;
        boxY = boxY * 3;
        for (int i = 0; i < 9; i++) {
            if (chosenValue == board[x][i].getValue())
                return true;
            if (chosenValue == board[i][y].getValue())
                return true;
        }
        for (int j = 0; j < 3; j++)
            for (int k = 0; k < 3; k++)
                if (chosenValue == board[k + boxY][j + boxX].getValue())
                    return true;
        return false;
    }

    public void AssignValue(int value, Square square, Square[][] board) {
        square.setValue(value);
        board[square.getLocation().getX()][square.getLocation().getY()].setValue(value);
    }
}