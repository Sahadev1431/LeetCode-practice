public class KthMissingPosNumber1539 {
    public int findKthPositive(int[] arr, int k) {
        // [2,3,4,7,11], k = 5
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }
}
