package ru.job4j.array;

/**
* Package for bubbleSort task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Matrix {

    public int[][] multiple(int size) {

        int[][] table = new int[size][size];
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}