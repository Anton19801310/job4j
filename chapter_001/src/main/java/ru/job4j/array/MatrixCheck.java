package ru.job4j.array;

/**
* Package for matrixCheck task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i ++) {
            for (int j = 0; j < data.length - 1; j ++)
            if((data[i][j] != data[i + 1][j + 1]) &&
                    (data[data.length - 1][data.length - 1] !=
                    data[data.length - 1 - i][data.length - 1 - j])) {
                result = false;
                break;
            }


        }
        return result;
    }
}