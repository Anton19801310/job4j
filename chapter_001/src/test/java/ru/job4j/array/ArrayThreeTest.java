package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Anton Lyalin
* @version $Id$
* @since 0.1
*/
public class ArrayThreeTest {
/**
* Test array.
*/
@Test
public void whenTwoArraysToOneArray() {
    ArrayThree three = new ArrayThree();
    int[] a = new int[] {1, 3};
    int[] b = new int[] {2, 4};
    int[] result = three.mergeArrays(a, b);
    int[] expectArray = new int[] {1, 2, 3, 4};
    assertThat(result, is(expectArray));
}


}