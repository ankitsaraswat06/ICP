package Assignment7;

import java.util.Arrays;

public class HouseRobber {
    public static int rec(int[] nums, int idx, int[] dp) {
        if(idx>=nums.length) return 0;
        if(idx==nums.length) return nums[idx];
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx] + rec(nums, idx+2, dp);
        int nonpick = rec(nums, idx+1, dp);
        return dp[idx] = Math.max(pick, nonpick);
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int[] dp =new int[nums.length+1];
        Arrays.fill(dp, -1);
        System.out.println(rec(nums, 0, dp));
    }
}
