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
    static int[][] transpose(int[][] a) {
        int[][] b = new int[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];


            }
        }
        return b;
    }

    public ArrayList<ArrayList<Integer>> scan(int [][] board) {
        ArrayList <ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        Game g = MainActivity.g;
        for (int i = 0; i < board.length; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            Integer k = 0;
            Boolean flag = false;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==0){
                    if(flag){
                        flag = false;
                        line.add(k);
                        k = 0;
                    }
                }
                if (board[i][j]==1){
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
