public class FindLowerBound_Naukri {
    public static int lowerBound(int []arr, int n, int x) {
        // 1 2 2 3 3 5        2
        // N = 5, arr[] = {3,5,8,15,19}, x = 9
        int start = 0;
        int end = n-1;
        int ind = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= x) {
                ind = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ind;
    }
}
