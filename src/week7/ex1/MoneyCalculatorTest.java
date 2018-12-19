package week7.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {

    private MoneyCalculator calculator = new MoneyCalculator();
    private List<Integer> values = Arrays.asList(1,2,3,4,5,5,6,7,1);



    @Test
    void calculateTotal() {
        int total = calculator.calculateTotal(values);
        Assertions.assertEquals(34,total);

    }
    @Test
    void calculateFalseTotal() {
        int total = calculator.calculateTotal(values);
        Assertions.assertNotEquals(32,total);

    }
}