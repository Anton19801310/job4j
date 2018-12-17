package ru.job4j.array;

/**
* Package for square task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        int j = 0;
        for (int i = 1; i <= bound; ++ i) {
            rst [j] = i * i;
            j ++;
        }
        return rst;
    }
}