package ru.job4j.max;

/**
* Package for max task.
*
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Max {
	/**
     * Method max.
     * @param first, second.
     * @return max.
     */
    public int max(int first, int second) {
        return (first > second ? first : second);
    }
    /**
     * Method max.
     * @param first, second, third.
     * @return temp1.
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        int temp1 = this.max(temp, third);

        return temp1;
    }
}