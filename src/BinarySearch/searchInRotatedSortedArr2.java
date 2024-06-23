package BinarySearch;

public class searchInRotatedSortedArr2 {

	public static void main(String[] args) {
		int[] arr = {2,5,6,0,0,1,2};
		int target=2;
		int n = arr.length;
		int pIdx = findPivot(arr);
		int idx=binarySearch(0,pIdx-1,arr,target);
		if(idx!=-1) {
			System.out.println(idx);
		}
		idx = binarySearch(pIdx,n-1,arr,target);
		System.out.println(idx);
	}
	private static int binarySearch(int l, int r, int[] arr, int target) {
		int idx=-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid]==target) {
				idx=mid;
				break;
			}
			else if(arr[mid]<target) l = mid+1;
			else r=mid-1;
		}
		return idx;
	}

	private static int findPivot(int[] arr) {
		int n = arr.length;
		int l=0;
		int r=n-1;
		while(l<r) {
			while(l<r && arr[l]==arr[l+1]) l++;
			while(l<r && arr[r]==arr[r-1]) r--;
			int mid = l+(r-l)/2;
			if(arr[mid]>arr[r]) {
				l=mid+1;
			}
			else {
				r=mid;
			}
		}
		return r;
	}

}
