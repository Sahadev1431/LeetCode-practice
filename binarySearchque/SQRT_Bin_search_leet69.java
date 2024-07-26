public class SQRT_Bin_search_leet69 {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);

        int low = 0;
        int high = x;
        int ans = -1;

        while (low < high) {
            int mid = (low + high) / 2;

            if ((mid * mid) > x) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
