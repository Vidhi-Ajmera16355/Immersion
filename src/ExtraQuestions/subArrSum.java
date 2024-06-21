package ExtraQuestions;

import java.util.*;

public class subArrSum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        System.out.println(subArrSumK(arr, k));
    }

    private static int subArrSumK(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int preSum = 0;
        int count = 0;
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            count += mp.getOrDefault(remove, 0);
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
