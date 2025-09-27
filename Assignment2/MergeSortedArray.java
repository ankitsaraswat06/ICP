package Assignment2;

public class MergeSortedArray {
    public static void merge(int[] n1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int idx = 0;
        int nums1[] = new int[m+n];
        for(int k=0; k<m+n; k++) nums1[k]= n1[k];
        while(i<m && j<n) {
            if(nums1[i] < nums2[j]) {
                n1[idx++] = nums1[i];
                i++;
            } else if(nums1[i] > nums2[j]) {
                n1[idx++] = nums2[j];
                j++;
            }  else {
                n1[idx++] = nums1[i];
                n1[idx++] = nums2[j];
                i++;
                j++;
            }
        }
        while(i<m) {
            n1[idx++] = nums1[i];
            i++;
        }
        while(j<n) {
            n1[idx++] = nums2[j];
            j++;
        }
    }
    public static void main(String args[]) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
