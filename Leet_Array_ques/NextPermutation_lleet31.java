import java.util.Arrays;
import java.util.Collections;

public class NextPermutation_lleet31 {
    public void nextPermutation(int[] nums) {
        // [1,2,3]
        //[1,3,2]

        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                ind  = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(nums, 0);
            return;
        }

        for (int i = nums.length - 1; i > ind; i++) {
            if (nums[i] > nums[ind]) {
                swap(nums,i,ind);
            }
        }

        reverse(nums, ind +1);

    }
    static void swap(int[]nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
