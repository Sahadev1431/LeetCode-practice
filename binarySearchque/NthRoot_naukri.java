public class NthRoot_naukri {
    public static int NthRoot(int n, int m) {
        // 4 69 
        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            long val = 1;
            for (int i = 0; i < n; i++) {
                val *= mid;
                if (val > m) break;
            }
            if (val == m) {
                return mid;
            } else if (val > m) {
                high = mid - 1;
            } else {
                low =  mid + 1;
            }
        }
        return -1;
    }
}
