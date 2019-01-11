package week8.exercises.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


class NumberFilterTest {

    NumberFilter numberFilter = new NumberFilter();

    @Test
    void getEven() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> result = numberFilter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2,4,6);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void getOdd() {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> result = numberFilter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1,3,5,7);
        Assertions.assertEquals(expected, result);
    }
}