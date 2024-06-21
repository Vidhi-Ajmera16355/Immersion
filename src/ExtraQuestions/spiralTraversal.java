package ExtraQuestions;
import java.util.*;
public class spiralTraversal {

	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
		List<Integer> ans = spiral(mat);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}

	private static List<Integer> spiral(int[][] mat) {
		List<Integer> ans = new ArrayList<>();
		int n = mat.length;
		int m = mat[0].length;
		int top = 0;
		int bottom = n-1;
		int left=0;
		int right=m-1;
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				ans.add(mat[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				ans.add(mat[i][right]);
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					ans.add(mat[bottom][i]);
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					ans.add(mat[i][left]);
				}
				left++;
			}
		}
		return ans;
	}

}
