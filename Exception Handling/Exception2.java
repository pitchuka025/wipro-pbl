public class Exception2 {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Please provide exactly 5 integers.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            double average = sum / 5.0;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
