import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = middleWay(a, b);
        System.out.println(Arrays.toString(result));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}
