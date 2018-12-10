package ru.job4j.loop;

/**
* Package for factorial task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Factorial {
	/**
     * Method calc.
     * @param
     * @return факториал числа n.
     */
    public int calc(int n) {
        int result = 1;
        for (int a = 1; a <= n ; a ++) {
            result = result * a;
            }
        return result;
        }
}

