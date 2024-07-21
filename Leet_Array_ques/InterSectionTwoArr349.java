import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSectionTwoArr349 {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[1] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                // if (!list.contains(nums1[i])) {
                //     list.add(nums1[i]);
                //     i++;j++;
                // } 
                list.add(nums1[i]);
                i++;
                j++;
                
            }
        }
        int[]ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        
    }
}
