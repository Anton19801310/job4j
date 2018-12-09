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
public class FactorialTest {
    /**
     * Test factorial.
     */
    @Test
    public void whenEvenNumberFactorialFiveThenOneHundredTwenty () {
        Factorial fact = new Factorial();
        int result = fact.calc(5);
        double expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenEvenNumberFactorialZeroThenOne() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        double expected = 1;
        assertThat(result, is(expected));
    }

}


