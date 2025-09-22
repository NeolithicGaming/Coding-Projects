import java.util.Scanner;

public class TA4P2Novilunio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] StudentArr = new String[3][3];
        int [][] StudentGrade = new int [3][2];
        double averagegrade;      

        for (int x = 0; x < 3; x++) 
        {
            System.out.print("Enter the name of the student: " + (x + 1) + ": ");
            StudentArr[x][0] = input.nextLine();

            System.out.print("Enter the 1st grade of " + StudentArr[x][0] + ": ");
            StudentGrade[x][0] = input.nextInt();
            StudentArr[x][1] = Integer.toString(StudentGrade[x][0]);

            System.out.print("Enter the 2nd grade of " + StudentArr[x][0] + ": ");
            StudentGrade[x][1] = input.nextInt();
            StudentArr[x][2] = Integer.toString(StudentGrade[x][1]); 
            input.nextLine();
        }

        System.out.println("\nStudent Information:");
        for (int x = 0; x < 3; x++) 
        {
        double average = (StudentGrade[x][0] + StudentGrade[x][1]) / 2;
        System.out.println("Name: " + StudentArr[x][0]);
        System.out.println("Grade 1: " + StudentGrade[x][0]);
        System.out.println("Grade 2: " + StudentGrade[x][1]);
        System.out.println("Average: " + average);
        System.out.println();
        }
    }
}
