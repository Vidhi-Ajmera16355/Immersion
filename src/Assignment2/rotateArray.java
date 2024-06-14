package Assignment2;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,5};
		int  n = 5, d = 2;
		rotateArr(arr,d,n);
		System.out.println(Arrays.toString(arr));
	}
	static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        // System.out.println(Arrays.toString(arr)); 
    }
    static void rotate(int[] a , int st , int end){
        while(st<end){
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
    }
}
