package BinarySearch;
import java.util.*;
public class PosOfElementInArr {
// Optimal Approach -> Binary Search O(logn)
	public static void main(String[] args) {
		int[] arr = {0,2,2,2,2,2};
		int target=2;
		int left_most = findLeft(arr,target);
		int right_most = findRight(arr,target);
		System.out.println(left_most);
		System.out.println(right_most);
	}

private static int findRight(int[] arr, int target) {
	int l=0;
	int r=arr.length-1;
	int right_most = -1;
	while(l<=r) {
		int mid = l+(r-l)/2;
		if(arr[mid]==target) {
			right_most = mid;
			l=mid+1;
		}
		else if(arr[mid]<target) {
			l=mid+1;
		}
		else {
			r=mid-1;
		}
	}
	return right_most; 
	}

private static int findLeft(int[] arr, int target) {
int l=0;
int r=arr.length-1;
int left_most = -1;
while(l<=r) {
	int mid = l+(r-l)/2;
	if(arr[mid]==target) {
		left_most = mid;
		r=mid-1;
	}
	else if(arr[mid]<target) {
		l=mid+1;
	}
	else {
		r=mid-1;
	}
}
return left_most; 
}

}
