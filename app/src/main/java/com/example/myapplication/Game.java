package com.example.myapplication;

import static com.example.myapplication.Variants.var1;

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
                board[i][j] = var1[i][j];
            }
        }
    }

    public ArrayList<ArrayList<Integer>> Game1() {
        ArrayList <ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Game g = MainActivity.g;
        for (int i = 0; i < g.height; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            Integer k = 0;
            Boolean flag = false;
            for (int j = 0; j < g.width; j++) {
                if (this.board[i][j]==0){
                    if(flag){
                        flag = false;
                        line.add(k);
                        k = 0;
                    }
                }
                if (this.board[i][j]==1){
                    if(flag){
                        k++;
                    }
                    else{
                        flag = true;
                        k = 1;
                    }
                }


            }
            if (flag) {
                line.add(k);
            }
            result.add(line);
        }
        return result;
    }
}
