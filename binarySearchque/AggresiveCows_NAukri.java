import java.util.*;;

public class AggresiveCows_NAukri {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);

        if (k <= 2) return (stalls[stalls.length - 1] - stalls[0]);

        int low = 1;
        int high = stalls[stalls.length - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possibleToPlaceCow(stalls,mid,k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean possibleToPlaceCow(int[]stalls,int dist,int k) {
        int cowCount = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                cowCount += 1;
                last = stalls[i];

                if (cowCount == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
