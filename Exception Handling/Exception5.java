class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Exception5 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide name and age as command-line arguments.");
            }

            String name = args[0];
            int age;

            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new AgeException("Age must be a valid integer.");
            }

            if (age < 18 || age >= 60) {
                throw new AgeException("Age should be between 18 and 59.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
