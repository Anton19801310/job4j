package ru.job4j.array;

import java.util.Arrays;

/**
* Package for arrayThree task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class ArrayThree {

        public static int[] mergeArrays(int[] a, int[] b) {

        int[] result = new int [a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
        }


}
