package BinarySearch;
import java.util.*;
public class kthMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,11};
		int k = 5;
//		System.out.println(find(arr,k));
		int ans = binarySearch(arr,k);
		System.out.println(ans);
	}

	
	
	private static int binarySearch(int[] arr, int k) {
		int n = arr.length;
		int l=0;
		int r=arr.length-1;
		int mid=-1;
		while(l<=r) {
			mid = l+(r-l)/2;
			int missingTillMid = arr[mid]-(mid+1);
			if(missingTillMid<k) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return l+k;
	}



	private static int find(int[] arr, int k) {
		// TODO Auto-generated method stub
		int num=1;
		int n = arr.length;
		int i=0;
		while(i<n && k>0) {
			if(arr[i]==num) {//not missing
				i++;
			}
			else {
				k--;
			}
			num++;
		}
//		1 2 3 k=2 ans=4,5..
		while(k-->0) {
			num++;
			
		}
		return num-1;
	}

}
