public class KokoEatingBananas_leet875 {
    public int minEatingSpeed(int[] piles, int h) {
        // piles = [30,11,23,4,20], h = 5
        int low = 1,high = findMax(piles);

        while (low <= high) {
            int mid = (low + high) / 2;
            int hours = calculateHours(piles, mid);

            if (hours >= h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int findMax(int[]piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    static int calculateHours(int[]piles,int hourly) {
        int totalHour = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHour += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalHour;
    }
}
