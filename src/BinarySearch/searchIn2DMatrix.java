package BinarySearch;
import java.util.*;
public class searchIn2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,3,5,7},{10,11,16,20},{23,30,34,60}
						};
		int target = 3;
		System.out.println(searchMatrix(matrix,target));
		
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end=m*n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(matrix[mid/n][mid%n]>target) end=mid-1;
            else if(matrix[mid/n][mid%n]<target) st=mid+1;
            else return true;
        }
        return false;
    }
}
