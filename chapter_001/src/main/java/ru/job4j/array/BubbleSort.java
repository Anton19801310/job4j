package ru.job4j.array;

/**
* Package for bubbleSort task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class BubbleSort {

    public int[] sort(int[] array) {

        for (int i = array.length - 1; i > 0;  i --) {
            for (int j = 0; j < i; j ++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }
}