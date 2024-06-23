package BinarySearch;
import java.util.*;
public class maxValAtGivenIdxxx { 
	    public static void main(String[] args) {
	        int n = 4;
	        int idx = 2;
	        int maxSum = 6;
	        int left = 1;
	        int right = maxSum;
	        int result = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            int leftCount = Math.min(idx, mid - 1);
	            int leftSum = getSumByFormula(leftCount, mid);
	            leftSum += Math.max(0, idx - (mid - 1));

	            int rightCount = Math.min(n - idx - 1, mid - 1);
	            int rightSum = getSumByFormula(rightCount, mid);
	            rightSum += Math.max(0, n - idx - 1 - (mid - 1));

	            if (leftSum + rightSum + mid <= maxSum) {
	                result = Math.max(result, mid);
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        System.out.println(result);
	    }

	    static int getSumByFormula(int count, int val) {
	        return (count * val) - (count * (count + 1) / 2);
	    }
	}
