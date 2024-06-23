package BinarySearch;
import java.util.*;
public class minTimeCmpltTrip {

	public static void main(String[] args) {
		int[] arr = {2,1,3};
		int totalTrips=5;
		int n = arr.length;
		int l=1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		int r = min*totalTrips;
		while(l<r) {
			int mid = l+(r-l)/2;
			if(possible(arr,mid,totalTrips)) {
				r=mid;
			}
			else {
				l=mid+1;			
			}
		}
		System.out.println(l);
	}

	private static boolean possible(int[] arr, int givenTime, int totalTrips) {
		int actualTrips=0;
		for(int i:arr) {
			actualTrips +=givenTime/i;
		}
		
		return actualTrips >= totalTrips;
	}

}
