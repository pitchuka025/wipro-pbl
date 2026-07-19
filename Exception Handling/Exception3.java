import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Exception3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int student = 1; student <= 2; student++) {
                System.out.println("Enter the name of student " + student);
                String name = sc.nextLine();

                int sum = 0;
                for (int subject = 1; subject <= 3; subject++) {
                    System.out.println("Enter marks in subject " + subject + " for " + name);
                    String input = sc.nextLine();

                    int marks;
                    try {
                        marks = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        NumberFormatException nfe =
                                new NumberFormatException("Please enter an integer value.");
                        nfe.initCause(e);
                        throw nfe;
                    }

                    if (marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (marks > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100.");
                    }

                    sum += marks;
                }

                double average = sum / 3.0;
                System.out.println("Average marks of " + name + " = " + average);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
