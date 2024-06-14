package Classes;
import java.util.*;
public class NumberDisappeared {

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(find(arr));
	}
	public static List<Integer> find(int[] arr){
		List<Integer> ll = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int idx = Math.abs(arr[i])-1;
			if(arr[idx]<0) {
				
			}
			else {
				arr[idx]*=-1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) ll.add(i+1);
		}
		return ll;
	}

}
