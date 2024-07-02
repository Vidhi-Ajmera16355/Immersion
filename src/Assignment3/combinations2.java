package Assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinations2{

	public static void main(String[] args) {
		int[] arr = {10,1,2,7,6,1,5};
		int target=8;
		Arrays.sort(arr);
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
			if(i!=lp && arr[i]==arr[i-1]) continue;
			list.add(arr[i]);
			track(arr,target-arr[i],list,ll,i+1); //increment
			list.remove(list.size()-1);
		}
		return ll;
}
}