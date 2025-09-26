public class findFirstAndLastPositionInSortedArray{
    public static int[] searchRange(int[] nums, int target) {
        // TC-O(logn) Sc-O(1)
        int[] arr = new int[2];
        int f = 0;
        int start = 0;
        int end = nums.length-1; 
        while(start<=end)  {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                arr[0] = mid;
                end = mid-1;
                f=1;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if(f==0) {
            arr[0] = -1;
        }
        start =0;
        end = nums.length-1;
        int k =0;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                arr[1] = mid;
                start = mid+1;
                k= 1;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if(k==0) {
            arr[1] = -1;
        }
        return arr; 
    }
    public static void main(String[] args) {
         int[] nums = {5,7,7,8,8,10};
         int target = 8;
         int ans[] = searchRange(nums, target);
            System.out.println(ans[0] +" " + ans[1]);
    }
}