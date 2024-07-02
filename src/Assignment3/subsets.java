package Assignment3;
import java.util.*;
public class subsets {

	public static void main(String[] args) {
		int[] arr = {1,2,2};
		System.out.println(print(arr,new ArrayList<>(),new ArrayList<List<Integer>>(),0));
	}

	private static ArrayList<List<Integer>> print(int[] arr, ArrayList<Integer> ll,ArrayList<List<Integer>> ans,int idx) {
		ans.add(new ArrayList(ll));
		for(int i=idx;i<arr.length;i++) {
			ll.add(arr[i]);
			print(arr,ll,ans,i+1);
			ll.remove(ll.size()-1);
		}
		return ans;
	}

}
