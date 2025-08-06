import java.util.Scanner;

public class StudentScoresFilter {
    
    public static int countStudentsAbove60(int[][] scores) {
        int count = 0;
        for (int[] studentScores : scores) {
            for (int score : studentScores) {
                if (score > 60) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int[][] studentScores = new int[numStudents][numSubjects];
        
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter scores for Student " + (i + 1) + " separated by space: ");
                boolean validInput = true;
                for (int j = 0; j < numSubjects; j++) {
                    if (scanner.hasNextInt()) {
                        studentScores[i][j] = scanner.nextInt();
                    } else {
                        validInput = false;
                        scanner.next();
                        break;
                    }
                }
                if (validInput) break;
                System.out.println("Error: Please enter exactly " + numSubjects + " scores!");
            }
        }
        
        int result = countStudentsAbove60(studentScores);
        System.out.println("Number of students who scored more than 60 in at least one subject: " + result);
        
        scanner.close();
    }
}

