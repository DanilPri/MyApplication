package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<ArrayList<Integer>> Game1() {
        ArrayList <ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int x1 = 0;
        Game g = MainActivity.g;
        for (int i = 0; i < g.height; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            for (int j = 0; j < g.width; j++) {
                if (j==0);
                x1++;

            }
            result.add(line);
        }
        return result;
    }
}
