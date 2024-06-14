package ExtraQuestions;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		rotateArr(a,2,a.length);
		System.out.println(Arrays.toString(a));
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
