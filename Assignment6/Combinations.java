package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void rec(int n, int k, List<Integer> ll, List<List<Integer>> ans) {
        if(n==0) {
            if(ll.size()==k) ans.add(new ArrayList<>(ll));
            return; 
        }
        // pick
        ll.add(n);
        rec(n-1, k, ll, ans);
        ll.remove(ll.size()-1);
        //not pick
        rec(n-1, k, ll, ans);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        rec(n, k, ll, ans);

        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(combine(4, 2));
        
    }
}
