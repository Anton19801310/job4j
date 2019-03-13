package ru.job4j.array;

import java.util.Arrays;

/**
* Package for arrayThree task.
*
* @author Anton Lyalin 
* @version $Id$45
* @since 0.1
*/

public class ArrayThree {
    public int[] mergeArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
                int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length){
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length){
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }


}
