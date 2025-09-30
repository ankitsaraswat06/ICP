package Assignment4;

public class PermutationString {
    public static boolean isSame(int[] arr1, int[] arr2) {
        for(int i=0; i<26; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i)-'a']++;
        }
        int ei=0;
        int si =0;
        int[] freq2 = new int[26];
        while(ei<s2.length()) {
            while(ei-si+1>s1.length()) {
                if(isSame(freq1, freq2)) return true;
                freq2[s2.charAt(si)-'a']--;
                si++;
            }
            freq2[s2.charAt(ei)-'a']++;
            ei++;
        }
        if(isSame(freq1, freq2)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
