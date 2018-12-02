package ru.job4j.loop;

/**
* Package for max task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Counter {
	/**
     * Method add.
     * @param start, finish.
     * @return sum.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for ( ; start <= finish; start ++){
            if (start % 2 == 0){
                sum = +sum;
            }
        }
        return sum;

    }

}