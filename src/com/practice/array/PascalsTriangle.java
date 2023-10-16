package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle triangle = new PascalsTriangle();
        int rowIndex = 3;
        triangle.solve(rowIndex);
        triangle.getRow(rowIndex);
    }

    List<Integer> solve(int index) {

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=index; i++){
            list.add(getNum(index,i));
        }

        return list;
    }

    int getNum(int row, int col) {
        if (row == 0 || col == 0 || row == col) {
            return 1;
        }
        System.out.print((getNum(row - 1, col - 1))+(getNum(row - 1, col)));
        return getNum(row - 1, col - 1) + getNum(row - 1, col);
    }

    //Optimised solution in Dynamic Programming way
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list =
                new ArrayList<>(rowIndex+1){
                    {
                        add(1);
                    }
                };
        for(int i=0; i<rowIndex;i++){
            for(int j=i;j>0;j--){
                list.set(j,list.get(j)+list.get(j-1));
            }
            list.add(1);
        }
        return list;
    }
}
