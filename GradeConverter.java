package lab;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numerical grade: ");
        int numericalGrade = scanner.nextInt();

        char letterGrade = convertToLetterGrade(numericalGrade);

        System.out.println("Corresponding letter grade: " + letterGrade);

        scanner.close();
    }

    public static char convertToLetterGrade(int numericalGrade) {
        char letterGrade;
        if (numericalGrade >= 90 && numericalGrade <= 100) {
            letterGrade = 'A';
        } else if (numericalGrade >= 80 && numericalGrade < 90) {
            letterGrade = 'B';
        } else if (numericalGrade >= 70 && numericalGrade < 80) {
            letterGrade = 'C';
        } else if (numericalGrade >= 60 && numericalGrade < 70) {
            letterGrade = 'D';
        } else if (numericalGrade >= 50 && numericalGrade < 60) {
            letterGrade = 'E';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
