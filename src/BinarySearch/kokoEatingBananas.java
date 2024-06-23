package BinarySearch;
import java.util.*;
public class kokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int hour=8;
		int l=1;
		int n=piles.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max<piles[i]) {
				max=piles[i];
			}
		}
		int r = max;
		while(l<r) {
			int mid = l+(r-l)/2;
			if(eatAll(piles,mid,hour)) {
				r=mid;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println(l);
	}

	private static boolean eatAll(int[] piles, int mid, int hour) {
		int actualHour = 0;
		for(int i:piles) {
			actualHour +=i/mid;
			if(i%mid !=0) {
				actualHour++;
			}
			
		}
		return actualHour<=hour;
	}

}
