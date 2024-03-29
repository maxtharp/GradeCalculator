package cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeCalculator {
    @Test
    public void testA(){
        Calculator calculator = new Calculator();
        char grade = calculator.calculate("AAAAA".toCharArray());
        Assertions.assertEquals(grade, 'A');
    }

    @Test
    public void testB(){
        Calculator calculator = new Calculator();
        char grade = calculator.calculate("AABAA".toCharArray());
        Assertions.assertEquals(grade, 'B');
    }

    @Test
    public void testC(){
        Calculator calculator = new Calculator();
        char grade = calculator.calculate("CCCCB".toCharArray());
        Assertions.assertEquals(grade, 'C');
    }

    @Test
    public void testD(){
        Calculator calculator = new Calculator();
        char grade = calculator.calculate("ADBDD".toCharArray());
        Assertions.assertEquals(grade, 'D');
    }

    @Test
    public void testF(){
        Calculator calculator = new Calculator();
        char grade = calculator.calculate("FFFFA".toCharArray());
        Assertions.assertEquals(grade, 'F');
    }

}
