package cs222;

public class ConvertToLetters {
    private final char[] letterGrades;

    public ConvertToLetters() {
        Input input = new Input();
        this.letterGrades = input.getGrades();
    }

    public char[] getLetterGrades(){
        assignmentGrade(letterGrades[0]);
        achievementGrade(letterGrades[1]);
        midSemesterGrade(letterGrades[2]);
        finalProjectGrade(letterGrades[3]);
        finalExamGrade(letterGrades[4]);

        return letterGrades;
    }

    private void assignmentGrade(char assignmentCount){
        if (assignmentCount == '7') {
            letterGrades[0] = 'A';
        }
        else if (assignmentCount == '6') {
            letterGrades[0] = 'B';
        }
        else if (assignmentCount == '5') {
            letterGrades[0] = 'C';
        }
        else if (assignmentCount == '4') {
            letterGrades[0] = 'D';
        }
        else{
            letterGrades[0] = 'F';
        }
    }
    private void achievementGrade(char achievementCount){
        if (achievementCount == '5') {
            letterGrades[1] = 'A';
        }
        else if (achievementCount == '4') {
            letterGrades[1] = 'B';
        }
        else if (achievementCount == '3') {
            letterGrades[1] = 'C';
        }
        else if (achievementCount == '2') {
            letterGrades[1] = 'D';
        }
        else{
            letterGrades[1] = 'F';
        }
    }
    private void midSemesterGrade(char midSemesterCompletion){
        if (midSemesterCompletion == 'Y'){
            letterGrades[2] = 'A';
        }
        else {
            letterGrades[2] = 'D';
        }
    }
    private void finalProjectGrade(char finalProject){
        if (finalProject == 'A'){
            letterGrades[3] = 'A';
        }
        else if (finalProject == 'B'){
            letterGrades[3] = 'B';
        }
        else if (finalProject == 'C'){
            letterGrades[3] = 'C';
        }
        else if (finalProject == 'D'){
            letterGrades[3] = 'D';
        }
        else {
            letterGrades[3] = 'F';
        }
    }
    private void finalExamGrade(char finalExam){
        if(finalExam == 'Y'){
            letterGrades[4] = 'A';
        }
        else if(finalExam == 'M'){
            letterGrades[4] = 'C';
        }
        else {
            letterGrades[4] = 'D';
        }
    }
}
