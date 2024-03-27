package cs222;

public class GradeCalculator {
    private final char[] finalGrades = new char[5];
    private final Input input = new Input();
    private final char[] gradeValues = input.getGrades();

    public char[] getFinalGrades(){
        assignmentGrade(gradeValues[0]);
        achievementGrade(gradeValues[1]);
        midSemesterGrade(gradeValues[2]);
        finalProjectGrade(gradeValues[3]);
        finalExamGrade(gradeValues[4]);

        return finalGrades;
    }

    private void assignmentGrade(char assignmentCount){
        if (assignmentCount == '7') {
            finalGrades[0] = 'A';
        }
        else if (assignmentCount == '6') {
            finalGrades[0] = 'B';
        }
        else if (assignmentCount == '5') {
            finalGrades[0] = 'C';
        }
        else if (assignmentCount == '4') {
            finalGrades[0] = 'D';
        }
        else{
            finalGrades[0] = 'F';
        }
    }
    private void achievementGrade(char achievementCount){
        if (achievementCount == '5') {
            finalGrades[1] = 'A';
        }
        else if (achievementCount == '4') {
            finalGrades[1] = 'B';
        }
        else if (achievementCount == '3') {
            finalGrades[1] = 'C';
        }
        else if (achievementCount == '2') {
            finalGrades[1] = 'D';
        }
        else{
            finalGrades[1] = 'F';
        }
    }
    private void midSemesterGrade(char midSemesterCompletion){
        if (midSemesterCompletion == 'Y'){
            finalGrades[2] = 'A';
        }
        else {
            finalGrades[2] = 'D';
        }
    }
    private void finalProjectGrade(char finalProject){
        if (finalProject == 'A'){
            finalGrades[3] = 'A';
        }
        else if (finalProject == 'B'){
            finalGrades[3] = 'B';
        }
        else if (finalProject == 'C'){
            finalGrades[3] = 'C';
        }
        else if (finalProject == 'D'){
            finalGrades[3] = 'D';
        }
        else {
            finalGrades[3] = 'F';
        }
    }
    private void finalExamGrade(char finalExam){
        if(finalExam == 'Y'){
            finalGrades[4] = 'A';
        }
        else if(finalExam == 'M'){
            finalGrades[4] = 'C';
        }
        else {
            finalGrades[4] = 'D';
        }
    }
}
