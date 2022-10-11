package pl.pjatk.unit_tests;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void baseOf2RaisedTo3Equals8() {
        int expected = 8;
        int result = Calculator.power(2, 3);
        assertEquals(expected, result);
    }

    @Test
    public void baseOfMinus8RaisedTo2EqualsMinus64(){
        int expected = 64;
        int result = Calculator.power(-8,2);
        assertEquals(expected, result);
    }

    @Test
    public void baseOfMinus3RaisedTo3EqualsMinus27() {
        int expected = -27;
        int result = Calculator.power(-3, 3);
        assertEquals(expected, result);
    }

    @Test
    public void divisible21by7(){
        boolean expected = true;
        boolean result = Calculator.divisible(21,7);
        assertEquals(expected,result);
    }

    @Test
    public void divisible49By5(){
        boolean expected = false;
        boolean result = Calculator.divisible(49,5);
        assertEquals(expected, result);
    }

    @Test
    public void NWDOf16And4Is4() {
        int expected = 4;
        int result = Calculator.NWD(16,4);
        assertEquals(expected, result);
    }

    @Test
    public void NWDOf21And9Is3() {
        int expected = 3;
        int result = Calculator.NWD(21,9);
        assertEquals(expected, result);
    }

    Calculator calc = new Calculator();

    @Test
    public void multiply9By5Is45() {
        int expected = 45;
        int result = calc.multiply(9,5);
        assertEquals(expected, result);
    }

    @Test
    public void multiplyMinus5By5IsMinus25() {
        int expected = -25;
        int result = calc.multiply(-5, 5);
        assertEquals(expected, result);
    }

    @Test
    public void multiply5ByMinus5IsMinus25() {
        int expected = -25;
        int result = calc.multiply(5, -5);
        assertEquals(expected, result);
    }

    @Test
    public void multiplyMinus5ByMinus5Is25() {
        int expected = 25;
        int result = calc.multiply(-5, -5);
        assertEquals(expected, result);
    }

}
