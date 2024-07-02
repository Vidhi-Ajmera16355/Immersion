package Classes;
import java.util.*;
public class mergeSort {

	public static void main(String[] args) {
		int[] arr = {9,7,6,5,10,11,8};
		int x=8;
		int pos=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<x) {
				int temp = arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
		System.out.println(Arrays.toString(arr));
		swap(arr,pos,arr.length-1);
		System.out.println(Arrays.toString(arr));
		System.out.println(placeAtRightIdx(arr,0,arr.length-1));
	}
	private static void swap(int[]arr,int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static int placeAtRightIdx(int[] arr,int s,int e) {
		int ele = arr[e];
		int pos = 0;
		for(int i=s;i<e;i++) {
			if(arr[i]<ele) {
				swap(arr,i,pos);
				pos++;
			}
		}
		swap(arr,pos,e);
		return pos;
	}
}