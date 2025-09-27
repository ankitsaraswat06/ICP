package Assignment2;

public class ValidPerfectSquare {
    public static boolean check(int num) {
        // binary search lagake finding 
        if(num==1) return true;
        int lo = 1;
        int hi = num;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            long sq = (long) mid*mid; // used because overflow may occur on mid*mid
            if(sq==num) {
                return true;
            } else if(sq<num) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int num = 16;
        System.out.println(check(num));
    }
}
