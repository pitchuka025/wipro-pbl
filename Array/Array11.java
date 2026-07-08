public class Array11 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 1, 4};
        System.out.println(only14(numbers));
    }

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
