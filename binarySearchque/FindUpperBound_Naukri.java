public class FindUpperBound_Naukri {
    public static int upperBound(int []arr, int x, int n){
        int low = 0;
        int high = n - 1;
        int ind = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ind = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ind;
    }
}
