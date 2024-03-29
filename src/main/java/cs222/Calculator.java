package cs222;

import java.util.Arrays;

public class Calculator {
    public char calculate(char[] grades){
        if (Arrays.toString(grades).contains("F")){
            return 'F';
        }
        else if (Arrays.toString(grades).contains("D")){
            return 'D';
        }
        else if (Arrays.toString(grades).contains("C")) {
            return 'C';
        }
        else if (Arrays.toString(grades).contains("B")) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
