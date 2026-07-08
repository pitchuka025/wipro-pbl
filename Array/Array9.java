import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 10, 2};
        int[] result = withoutTen(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        return result;
    }
}
