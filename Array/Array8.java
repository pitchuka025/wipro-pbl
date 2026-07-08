public class Array8 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean skip = false;

        for (int num : numbers) {
            if (skip) {
                if (num == 7) {
                    skip = false;
                }
                continue;
            }

            if (num == 6) {
                skip = true;
                continue;
            }

            sum += num;
        }

        System.out.println(sum);
    }
}
