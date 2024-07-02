package Classes;
import java.util.*;
public class QuickSortAlgo {

	public static void main(String[] args) {
		int[] arr = {9,7,6,5,10,11,8};
//		System.out.println(placeAtRightIdx(arr,0,arr.length-1));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
private static void quickSort(int[] arr,int s,int e) {
	if(s>=e) {
		return;
	}
	int idx = placeAtRightIdx(arr,s,e);
	quickSort(arr,s,idx-1);
	quickSort(arr,idx+1,e);
}
private static void swap(int[]arr,int i, int j) {
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
static int placeAtRightIdx(int[] arr,int s,int e) {
	int ele = arr[e];
	int pos = s;
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
