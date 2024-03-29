package cs222;

public class Main {

    public static void main(String[] args) {
        ConvertToLetters gradeCalculator = new ConvertToLetters();
        Calculator calculator = new Calculator();
        char[] inputGrades = gradeCalculator.getLetterGrades();

        System.out.println("You earned a(n) " + calculator.calculate(inputGrades) +
                " in CS222.");
    }
}

