package Assignment2;

public class ThirsMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,5,6,2,9,-1,0};
		System.out.println(thirdMax(arr));
	}
	public static int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                tmax=smax;
                smax=max;
                max=nums[i];
            }
            else if(max>nums[i] && smax<nums[i]){
                tmax=smax;
                smax=nums[i];
            }
            else if(smax>nums[i] && tmax<nums[i]){
                tmax=nums[i];
            }
        }
        return tmax!=Long.MIN_VALUE ? (int) tmax : (int) max;
    }

}
