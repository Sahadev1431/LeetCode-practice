public class SmallestDivOfThreshold1283 {
    // [1,2,5,9]
    public int smallestDivisor(int[] nums, int threshold) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ceil = findCeil(nums,mid);

            if (ceil <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private int findCeil(int[]nums,int mid) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil(nums[i] / mid);
        }
        return sum;
    }
}
