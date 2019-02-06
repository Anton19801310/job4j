package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Anton Lyalin
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
       String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
       String[] expect = {"Привет", "Мир", "Супер"};
       ArrayDuplicate rem = new ArrayDuplicate();
       String[] result = rem.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));

    }
}
