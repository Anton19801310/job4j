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
        Calculator calc = new Calculator();
        calc.add(2D, 4D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}