package Classes;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,6,8,7,5};
		for(int i=1;i<arr.length;i++) {
			int p=i;
			while(p>0 && arr[p]<arr[p-1]) {
				swap(arr,p,p-1);
				p--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[]arr,int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
