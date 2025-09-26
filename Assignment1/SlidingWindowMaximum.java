package Assignment1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static  int[] maxSlidingWindow(int[] nums, int k) {
        // BRUTE FORCE--> Method giving TLE

        // List<Integer> ll = new ArrayList<>();
        // for(int i=0; i<=nums.length-k; i++) {
        //     int max = nums[i];
        //     for(int j=i; j<=i+k-1; j++) {
        //         max = Math.max(max, nums[j]);
        //     }
        //     ll.add(max);
        // }
        // int[] ans = new int[ll.size()];
        // for(int i=0; i<ans.length; i++) {
        //     ans[i] = ll.get(i);
        // }
        // return ans;  

        // using a dequeue

        int n = nums.length;
        int[] ans= new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;

    }
    public static void main(String a[]) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
