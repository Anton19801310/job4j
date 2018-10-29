package ru.job4j.calculator;

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
public class CalculatorTest {
/**
* Test add.
*/
@Test
public void whenAddOnePlusOneThenTwo() {

    Calculator calc = new Calculator();
    calc.add(1D, 1D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));
}

/**
 * Test subtract.
 */
@Test
public void whenSubtractTwoMinusOneThenOne() {

    Calculator calc = new Calculator();
    calc.subtract(2D, 1D);
    double result = calc.getResult();
    double expected = 1D;
    assertThat(result, is(expected));
}

/**
 * Test div.
 */
@Test
public void whenDivFourDivisionTwoThenTwo() {

    Calculator calc = new Calculator();
    calc.subtract(4D, 2D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));
}

/**
 * Test multiple.
 */
@Test
public void whenMultipleTwoMultiplyTwoThenFour() {

    Calculator calc = new Calculator();
    calc.subtract(2D, 2D);
    double result = calc.getResult();
    double expected = 4D;
    assertThat(result, is(expected));
}
}