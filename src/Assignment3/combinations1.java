package Assignment3;
import java.util.*;
public class combinations1 {

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target=7;
		List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        System.out.println(track(arr,target, ll,list,0));
        
}

private static List<List<Integer>> track(int[] arr, int target, List<Integer> list, List<List<Integer>> ll, int lp) {
		if(target==0) {
			ll.add(new ArrayList<Integer>(list));
			// ll.add(list);
			return ll;
		}
		if(target<0) return null;
		for(int i=lp;i<arr.length;i++) {
			list.add(arr[i]);
			track(arr,target-arr[i],list,ll,i);
			list.remove(list.size()-1);
		}
		return ll;
}
}