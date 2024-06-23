import java.util.*;

public class minimizeMaximize {

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 6};
        int n = nums.length;

        int result = minimizeArrayValue(nums);
        System.out.println("Minimum value to make all elements less than or equal to " + result);
    }

    public static boolean isValid(int[] nums, long midMax, int n) {
        int[] arr = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > midMax)
                return false;

            int buffer = (int) (midMax - arr[i]);
            arr[i + 1] -= buffer;
        }

        return arr[n - 1] <= midMax;
    }

    public static int minimizeArrayValue(int[] nums) {
        int n = nums.length;

        int maxL = 0;
        int maxR = Arrays.stream(nums).max().getAsInt();

        int result = 0;

        while (maxL <= maxR) {
            long midMax = maxL + (maxR - maxL) / 2;

            if (isValid(nums, midMax, n)) {
                result = (int) midMax;
                maxR = (int) (midMax - 1);
            } else {
                maxL = (int) (midMax + 1);
            }
        }

        return result;
    }
}
