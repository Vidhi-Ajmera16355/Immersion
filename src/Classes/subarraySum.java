package Classes;
import java.util.*;
public class subarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,7,5};
	    int n = 5;
	    int s = 12;
	    subarraySum(arr,n,s);
	}
	static void subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ll = new ArrayList<>();
        int sum=0;
        int l=0;
        int r=n-1;
        while(l<r){
            sum = sum + arr[l];
            if(sum>s){
                r--;
            }
            else if(sum<s) {
                l++;
            }
            else {
                System.out.println(l + " " + r);
            }
        }
        }
}
