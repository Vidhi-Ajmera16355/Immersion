package Classes;
import java.util.*;
public class subsetCount {
static int c=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int target=3;
		print(arr,0,target,"");
		System.out.println();
		System.out.println(c);
	}
	
	private static void print(int[] arr,int idx, int target,String ans) {
		if(target==0 && idx==arr.length-1) {
			System.out.print(ans+" ");
			c++;
		}
		if(target<0 || idx>arr.length-1) return;
		print(arr,idx+1,target-arr[idx],ans+arr[idx]);
		print(arr,idx+1,target,ans);
	}
	

}
