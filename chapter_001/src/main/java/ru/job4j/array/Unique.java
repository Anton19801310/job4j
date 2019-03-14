package ru.job4j.array;

/**
* Package for unique task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

import java.util.Arrays;

/**
 * Проверить. Что два массива состоят из одинаковых символов.
 */
public class Unique {
    public boolean unique(int[] value1, int[] value2) {
        Arrays.sort(value1);
        Arrays.sort(value2);
        boolean rs = false;
        for (int index = 0; index < value1.length - 1 && index < value2.length -1; index++) {
            if (value1[index] == value2[index]) {
                rs = true;
                break;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        Unique process = new Unique();
        boolean rs  = process.unique(
                new int[] {5, 2, 5},
                new int[] {5, 2, 5}
        );
        System.out.println(rs);
    }
}