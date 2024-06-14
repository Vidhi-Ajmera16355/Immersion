package Classes;

public class firstMissingPositive {
	public static void main(String[] args) {
		int[] nums = {1,2,0};
	        boolean isOnePresent = false;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<=0 || nums[i]>nums.length){
	                nums[i]=1;
	            }
	            else if(nums[i]==1){
	                isOnePresent = true;
	            } 
	        }
	        if(!isOnePresent) System.out.println(1);
	        for(int i=0;i<nums.length;i++){
	            int idx = Math.abs(nums[i])-1; 
	            if(nums[idx]>0) {
	                nums[idx]*=-1;
	            }
	        }
	        int ans = 0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>0){
	                ans=i+1;
	                break;
	            }
	        }
	        System.out.println(ans==0 ? nums.length+1:ans);
	    }
	}