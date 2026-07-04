public class Acceptgender {
    public static void main(String[] args) {        if (args.length < 2) {
            System.out.println("Usage: java Acceptgender <Male|Female> <age>");
            return;
        }

        String gender = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number.");
            return;
        }

        if (age < 1 || age > 100) {
            System.out.println("Age must be between 1 and 100.");
            return;
        }

        double interest;
        if (gender.equalsIgnoreCase("Female")) {
            if (age <= 58) {
                interest = 8.2;
            } else {
                interest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age <= 58) {
                interest = 8.4;
            } else {
                interest = 10.5;
            }
        } else {
            System.out.println("Gender must be 'Male' or 'Female'.");
            return;
        }

        System.out.println("Interest percentage: " + interest + "%");
    }
}