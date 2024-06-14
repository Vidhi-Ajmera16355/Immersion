package Assignment2;

public class checkArraySorted {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(check(arr));
	}
	public static boolean check(int[] nums) {
		int c=0;
        if(nums[0]<nums[nums.length-1]) c++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++;
                if(c>1) return false;
            }
        }
        return true;
    }
}
