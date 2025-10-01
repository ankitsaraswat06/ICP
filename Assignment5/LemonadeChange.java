package Assignment5;

public class LemonadeChange {
    public static boolean lChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i=0; i<bills.length; i++) {
            if(bills[i]==5) five++;
            if(bills[i]==10) {
                if(five>0) {
                    five--;
                    ten++;
                } else return false;
            }
            if(bills[i]==20) {
                if(five>0 && ten>0) {
                    ten--;
                    five--;
                } else if(five>=3) {
                    five-=3;
                } else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lChange(bills));
    }
}
