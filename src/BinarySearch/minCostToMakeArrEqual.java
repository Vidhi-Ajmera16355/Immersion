package BinarySearch;
import java.util.*;
public class minCostToMakeArrEqual {

	public static void main(String[] args) {
		int[] nums = {1,3,5,2};
		int [] cost = {2,3,1,14};
		int n=nums.length;
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			min=nums[i];
		}
		int l=min;
		int r=max;
		while(l<=r) {
			int mid=l+(r-l)/2;
			int cost1 = find(nums,cost,mid);
			int cost2 = find(nums,cost,mid+1);
			ans = Math.min(cost2, cost1);
			if(cost2>cost1) r=mid-1;
			else l=mid+1;
		}
		System.out.println(ans);
	}

	private static int find(int[] nums, int[] cost, int target){
		int res=0;
		for(int i=0;i<nums.length;i++) {
			res+=Math.abs(nums[i]-target)*cost[i];
		}
		return res;
	}

}
