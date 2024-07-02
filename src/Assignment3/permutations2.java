package Assignment3;
import java.util.*;
public class permutations2 {

	public static void main(String[] args) {
		int[] arr = {1,1,2};
		System.out.println(answer(arr,new ArrayList<Integer> (),new ArrayList<ArrayList<Integer>> (),new boolean[arr.length]));
		
	}

	private static ArrayList<ArrayList<Integer>> answer(int[] arr, ArrayList<Integer> ll, ArrayList<ArrayList<Integer>> ans,
			boolean[] used) {
		
		if(ll.size()==arr.length) {
			ans.add(new ArrayList<>(ll));
		}
		for(int i=0;i<arr.length;i++) {
			if(used[i] || i>0 && arr[i]==arr[i-1] && !used[i-1])
				continue;
			used[i]=true;
			ll.add(arr[i]);
			answer(arr,ll,ans,used);
			used[i]=false;
			ll.remove(ll.size()-1);
		}
		return ans;
	}

}
