package cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeCalculator {
    @Test
    public void testA(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        char grade = gradeCalculator.calculate();
        Assertions.assertEquals(grade, 'A');
    }

    @Test
    public void testB(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        char grade = gradeCalculator.calculate();
        Assertions.assertEquals(grade, 'B');
    }

    @Test
    public void testC(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        char grade = gradeCalculator.calculate();
        Assertions.assertEquals(grade, 'C');
    }

    @Test
    public void testD(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        char grade = gradeCalculator.calculate();
        Assertions.assertEquals(grade, 'D');
    }

    @Test
    public void testF(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        char grade = gradeCalculator.calculate();
        Assertions.assertEquals(grade, 'F');
    }

}
