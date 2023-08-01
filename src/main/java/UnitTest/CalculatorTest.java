package UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void sum2plus3(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(2,3));
    }

}