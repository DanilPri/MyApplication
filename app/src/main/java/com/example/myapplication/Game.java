package com.example.myapplication;

public class Game {

    int width = 10;
    int height = 10;

    int[][] board;

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        board = new int[height][width];
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                board[i][j] = Variants.var1[i][j];
            }
        }
    }
}
