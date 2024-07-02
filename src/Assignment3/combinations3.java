package Assignment3;
import java.util.*;
public class combinations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=15;
		System.out.println(generate(1,9,new ArrayList(),new ArrayList<List<Integer>>(),k,n));
	}

	private static ArrayList<List<Integer>> generate(int st, int end, ArrayList current, ArrayList<List<Integer>> subsets, int k, int n) {
		if(n==0 && current.size()==k){
            subsets.add(new ArrayList(current));
            return subsets;
        }
		if(subsets.size()==1){
			return subsets;
		}
        for(int i=st;i<=end;i++){
            current.add(i);
            generate(i+1,end,current,subsets,k,n-i);
            current.remove(current.size()-1);
        }
        return subsets;
	}

}
