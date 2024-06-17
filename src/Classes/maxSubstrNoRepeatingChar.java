package Classes;
import java.util.*;
public class maxSubstrNoRepeatingChar {

	public static void main(String[] args) {
		String s = "abcdaabcdef";
		System.out.println(maxSubstring(s));
	}
static int maxSubstring(String s) {
	int st=0;
	int end=0;
	int maxWin=0;
	int[] freq = new int[256];
	while(end<s.length()) {
		int idx = s.charAt(end);
		freq[idx]++; //growth
		while(freq[idx]>1) {
			int r_idx = s.charAt(st);
			freq[r_idx]--;
			st++;
		}
//		TASK
		int currWin=end-st+1;
		maxWin = Math.max(maxWin, currWin);
		end++;
	}
	return maxWin;
}
}
