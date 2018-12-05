package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Anton Lyalin
* @version $Id$
* @since 0.1
*/
public class CounterTest {
    /**
     * Test counter.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        double expected = 30;
        assertThat(result, is(expected));
    }
}