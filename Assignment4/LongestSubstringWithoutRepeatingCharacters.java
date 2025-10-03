package Assignment4;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longest(String s) {
        int[] freq = new int[255];
        int si = 0;
        int ei = 0;
        int ans = 0;
        while(ei<s.length()) {
            while(freq[s.charAt(ei)] > 0) {
                freq[s.charAt(si)]--;
                si++;
            }
            freq[s.charAt(ei)]++;
            
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
    public static void main(String args[]) {
        String s = "abcabcbb";
        System.out.println(longest(s));
    }
}
