package Classes;
import java.util.*;
public class cyclicSort {
//list is an interface
	public static void main(String[] args) {
		int[] arr = {6,1,5,4,2,3};
		int x=arr[0];
		for(int i=0;i<arr.length;i++){
			while(arr[i]!=i+1) {
				int idx=arr[i]-1;
				swap(arr,i,idx);
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
