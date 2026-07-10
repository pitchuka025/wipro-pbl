import java.util.Scanner;

public class Logical1{
    public static void main(String[] args) {
        int number;
        double marks;
        char grade;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("\nStudent Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("\nCountdown:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        sc.close();
    }
}