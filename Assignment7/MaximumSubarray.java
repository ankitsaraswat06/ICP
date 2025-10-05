package Assignment7;

public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            cs+=nums[i];
            ms = Math.max(cs, ms);
            if(cs<0) cs = 0;
        }
        System.out.println(ms);
    }
}
