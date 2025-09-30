package Assignment4;

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int flip =0;
        int si =0;
        int ei =0;
        int ans =0;
        while(ei<nums.length){
            if(nums[ei]==0) flip++;
            while(flip>k) {
                if(nums[si]==0) flip--;
                si++;
            }
            ans = Math.max(ei-si+1, ans);
            ei++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
