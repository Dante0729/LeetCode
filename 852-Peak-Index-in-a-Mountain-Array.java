class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
		if(arr==null ||arr.length ==0 ) return 0; 
        
        int n = arr.length;
		
        int start = 1;
        int end = n-1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] < arr[mid-1]) end = mid - 1;
            else if(arr[mid] < arr[mid+1]) start = mid + 1;
        }
        return -1; 
    }
}