package Daily_ICP_Work.Recursion;

public class numberOfOnes {
    public static int find(int n) {
        if(n==0) return 0;
        if(n%2==1) return 1+find(n/2);
        return find(n/2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(find(n));
    }
}
