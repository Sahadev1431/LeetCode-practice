public class CountArrRotation_Naukri {
    public static int findKRotation(int []arr){
        // [3, 4, 5, 1, 2]

        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int ind = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ind = low;
                    ans = arr[low];
                }
                low = mid +1;
            } else {
                if (arr[mid] < ans) {
                    ind = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return ind;
    }
}
