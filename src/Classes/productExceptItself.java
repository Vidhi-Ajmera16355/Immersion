package Classes;

public class productExceptItself {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productExceptSelf(arr);
		
	}
    public static void productExceptSelf(int[] nums) {
        int st = 0;
        int end=0;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length]; 
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }
        for(int i=0;i<nums.length;i++) {
        	System.out.print(ans[i]+" ");
        }
    }
}