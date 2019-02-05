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
            if((data[i][i] != data[i + 1][i + 1]) ||
                    (data[0][data.length - 1] !=
                    data[i][data.length - 1 - i])) {
                result = false;
                break;
            }


        }
        return result;
    }
}