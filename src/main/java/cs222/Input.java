package cs222;

import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    public char[] gradeValues = new char[5];

    public char[] getGrades() {
        System.out.println("How many assignments did you meet specifications for?");
        gradeValues[0] = read();

        System.out.println("How many achievements did you meet specifications for?");
        gradeValues[1] = read();

        System.out.println("Did you meet specifications for the mid-semester self assessment? (Y/N)");
        gradeValues[2] = toUpperCase(read());

        System.out.println("What grade did you receive for iteration 3 of the final project?");
        gradeValues[3] = checkFullA(toUpperCase(read()));

        System.out.println("Did you meet specifications for the final exam? Did you meet the minimum? (Y/M/N)");
        gradeValues[4] = toUpperCase(read());

        return gradeValues;
    }

    private char read() {
        String grade = scanner.next();
        return grade.charAt(0);
    }

    private char checkFullA(char finalProjectGrade) {
        String response;
        if (finalProjectGrade == 'A') {
            System.out.println("Did you receive a D or better on all previous iterations? (Y/N)");
            response = scanner.next();
            if (response.equalsIgnoreCase("N")) {
                finalProjectGrade = 'B';
            }
        }
        return finalProjectGrade;
    }
}
