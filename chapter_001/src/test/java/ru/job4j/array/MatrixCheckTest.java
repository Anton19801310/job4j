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
public class MatrixCheckTest {
/**
* Test array.
*/
@Test
public void whenDataMonoByTrueThenTrue() {
    MatrixCheck check = new MatrixCheck();
    boolean[][] input = new boolean[][]{
            {true, true, true},
            {false, true, true},
            {true, false, true}
    };
    boolean result = check.mono(input);
    assertThat(result, is(true));
}

@Test
public void whenDataNotMonoByTrueThenFalse() {
    MatrixCheck check = new MatrixCheck();
    boolean[][] input = new boolean[][] {
            {true, true, false},
            {false, false, true},
            {true, false, true}
    };
    boolean result = check.mono(input);
    assertThat(result, is(false));
}
}