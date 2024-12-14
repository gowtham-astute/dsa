package org.dsa.basic.array;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {

    public static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    al.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    al.add(matrix[i][j]);
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int matrix[][] = {{45, 48, 54}, {21, 89, 87}, {70, 78, 15}};
        System.out.println(PrintMatrixInSnakePattern.snakePattern(matrix));
    }
}
