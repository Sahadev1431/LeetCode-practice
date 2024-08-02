// import java.util.Arrays;

public class SingleNum_Leet136 {
    public int singleNumber(int[] nums) {
        // [2,2,1]
        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //         if (count == 2) break;
        //     }
        //     if (count == 1) return nums[i];
        // }
        // return -1;
        int n = nums.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}
