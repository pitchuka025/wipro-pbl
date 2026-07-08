public class Array14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            try {
                nums[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter 9 integer numbers");
                return;
            }
        }

        System.out.println("The given array is :");
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " ");
        System.out.println(nums[3] + " " + nums[4] + " " + nums[5] + " ");
        System.out.println(nums[6] + " " + nums[7] + " " + nums[8] + " ");

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
