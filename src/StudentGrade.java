public class StudentGrade {
    public static void main(String[] args) {
        findGrades("huma",99);
        findGrades("ferhan", 55);


    }

    public static char findGrades(String name, int score) {
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'a';

        } else if (score > 80 && score < 90) {
            grade = 'b';
        } else if (score > 70 && score < 80) {
            grade = 'c';

        } else {
            grade = 'f';
        }
        System.out.println("Student grade " + grade );
        return grade;


    }



}
