package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static boolean isZero(int[] freq) {
        for(int k: freq) {
            if(k!=0) return false;
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        for(int i=0; i<p.length(); i++) {
            freq[p.charAt(i)-'a']++;
        }
        List<Integer> ans = new ArrayList<>();
        int ei=0;
        int si = 0;
        while(ei<s.length()) {
            freq[s.charAt(ei)-'a']--;
            while(ei-si+1 == p.length() && si<s.length()) {
                if(isZero(freq)) {
                    ans.add(si);
                }
                freq[s.charAt(si)-'a']++;
                si++;
            }
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
