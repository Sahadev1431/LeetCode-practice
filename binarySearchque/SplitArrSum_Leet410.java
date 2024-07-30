import java.util.Collections;

public class SplitArrSum_Leet410 {
    public int splitArray(int[] nums, int k) {
        if (k > nums.length) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possibleSum(nums, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int possibleSum(int[]arr,int exceptedSum) {
        int val = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= exceptedSum) {
                sum += arr[i];
            } else {
                val ++;
                sum = arr[i];
            }
        }
        return val;
    }
}
