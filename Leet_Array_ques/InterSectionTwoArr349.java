import java.util.*;
public class InterSectionTwoArr349 {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int[]arr = new int[set.size()];

        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) arr[i] = nums2[i];
        }

    }

    public static void main(String[] args) {
    }
    
}
