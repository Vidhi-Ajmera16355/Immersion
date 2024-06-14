package Assignment1;

public class minNumOfJumps {

	public static void main(String[] args) {
		int[] arr ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = 11;
		System.out.println(minJumps(arr,n));
	}
	static int minJumps(int[] arr, int n) {
        if(n<=1) return 0;
        if(arr[0]==0) return -1;
        
        int max=0;
        int maxRng = 0;
        int jump=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,i+arr[i]);
            if(maxRng==i){
                maxRng=max;
                jump++;
                if(maxRng>=n-1) return jump;
            }
        }
        return -1;
    }
}
