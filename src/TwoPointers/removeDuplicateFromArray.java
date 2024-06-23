package TwoPointers;
import java.util.*;

public class removeDuplicateFromArray {
	
//  non-decreasing elements!!
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
//		i-> unique j-> bring unique give them to i
		int i=0;
		int j=i+1;
		int n=nums.length;
		while(j<n) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
			j++;
		}
		System.out.println(i+1);
	}
}