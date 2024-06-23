package BinarySearch;
import java.util.*;
public class cntInRotatedArr {

	public static void main(String[] args) {
		int[] arr = {5,1,2,3,4};
		//how many times rotated!
		int res=-1;
		int n=arr.length;
		int l=0,r=n-1;
		while(l<r) {
			int mid = l+(r-l)/2;
			if(arr[mid]<arr[r]) {
				r=mid;
			}
			else
			{
				l=mid+1;
			}
		}
		System.out.println(r);
		
	}

}
