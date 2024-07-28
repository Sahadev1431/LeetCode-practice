public class CapacityToShip_Leet1011 {
    public int shipWithinDays(int[] weights, int days) {
        // [1,2,3,4,5,6,7,8,9,10], days = 5

        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int day = findCap(weights,mid);

            if (day > days) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    private int findCap(int[]weights,int mid) {
        int day = 1;
        for (int i = 0; i < weights.length; i++) {
            int load = 0;
            if (load + weights[i] > mid) {
                day += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }
}
