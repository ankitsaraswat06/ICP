package Assignment5;

import java.util.Arrays;

public class BoatsToSave {
    public static int boat(int[] people, int limit) {
        
        int boats = 0;
        int left = 0;
        int right = people.length-1;
        while(left<=right) {
            if(people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }
    public static void main(String[] args) {
        
        int[] people = {1,2};
        int limit = 3;
        Arrays.sort(people);
        System.out.println(boat(people, limit));

    }
}
