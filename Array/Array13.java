public class Array13 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            try {
                nums[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter 4 integer numbers");
                return;
            }
        }

        System.out.println("The given array is :");
        System.out.println(" " + nums[0] + " " + nums[1] + " ");
        System.out.println(" " + nums[2] + " " + nums[3] + " ");
        System.out.println("The reverse of the array is :");
        System.out.println(" " + nums[3] + " " + nums[2] + " ");
        System.out.println(" " + nums[1] + " " + nums[0] + " ");
    }
}
