package Classes;

public class traverseTree {

	public static void main(String[] args) {
		int[] a = {7,8,17,10,5,6};
		recurse(0,a);
		System.out.println();
		Leftrecurse(0,a);
	}
	static void recurse(int i,int[] a) {
		if(i>=a.length || a[1]==-1) return;
		System.out.print(a[i]+" ");
		recurse(2*i+1,a);
		recurse(2*i+2,a);
	}
	static void Leftrecurse(int i,int[] a) {
		if(i>=a.length || a[1]==-1) return;
		recurse(2*i+1,a);
		System.out.print(a[i]+" ");
		recurse(2*i+2,a);
	}
}
