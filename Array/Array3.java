public class Array3 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 34, 56, 7};
        int target = 56; // change this value to search for a different number

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
