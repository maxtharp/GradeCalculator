package cs222;

import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    public char[] grades = new char[4];

    public char[] getGrades() {
        System.out.println("How many assignments did you meet specifications for?");
        grades[0] = read();

        System.out.println("How many achievements did you meet specifications for?");
        grades[1] = read();

        System.out.println("Did you meet specifications for the mid-semester self assessment?");
        grades[2] = read();

        System.out.println("What grade did you receive for iteration 3 of the final project?");
        grades[3] = checkFullA(toUpperCase(read()));

        System.out.println("What grade did you receive on the final exam?");
        grades[4] = read();

        return grades;
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
