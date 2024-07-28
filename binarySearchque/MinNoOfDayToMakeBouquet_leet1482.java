public class MinNoOfDayToMakeBouquet_leet1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        // Early return if it's impossible to make m bouquets
        if (bloomDay.length < (long)m * k) return -1;

        // Find the minimum and maximum bloom days
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int low = min;
        int high = max;

        // Binary search to find the minimum day
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int bouquets = calculateBouquets(bloomDay, mid, k);

            if (bouquets < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private int calculateBouquets(int[] bloomDay, int day, int k) {
        int count = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets;
    }
}
