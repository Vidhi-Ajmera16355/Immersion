package BinarySearch;
import java.util.*;
public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,8,10};
		int target = 8;
		int l=0;
		int r=arr.length;
		int mid=0;
		while(l<=r) {
			mid = l+(r-l)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
			}
			else if(arr[mid]<target) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println(mid);
		}

}
