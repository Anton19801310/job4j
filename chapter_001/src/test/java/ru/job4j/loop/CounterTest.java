package ru.job4j.loop;

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
public class CounterTest {
/**
* Test counter.
*/
@Test
public void whenSumEvenNumbersFromOneToTenThenThirty() {
    Sum summa = new Sum();
    summa.subtract(2D, 4D, 6D, 8D, 10D);
    int result = sum.getResult();
    assertThat(result, is(30));

}