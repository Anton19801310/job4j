package ru.job4j.array;

/**
* Package for turn task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Turn {

    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i ++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}