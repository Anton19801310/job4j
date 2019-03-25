package ru.job4j.array;

/**
* Package for unique task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Проверить. Что два массива состоят из одинаковых символов.
 */
public class Unique {
    public boolean unique(int[] array1, int[] array2) {
        boolean rs = true;
        Map<int[], Integer> map1 = new HashMap();
        for (int i = 0; i < array1.length; i++) {
            map1.put(array1, i);
        }
        Map<int[], Integer> map2 = new HashMap();
        for (int i = 0; i < array2.length; i++) {
            map2.put(array1, i);
        }
        if (!map1.equals(map2)) {
            rs = false;
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