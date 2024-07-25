import java.util.ArrayList;

public class FirstAndLastOccurence_Naukri {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = findFirst(arr, n, k);
        int last = findLast(arr, n, k);
        return new int[] { first, last };
    }

    static int findFirst(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = arr.size() - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (k < arr.get(mid)) {
                high = mid - 1;
            } else if (k > arr.get(mid)) {
                low = mid + 1;
            } else {
                first = mid;
                high = mid - 1;
            }
        }
        return first;
    }

    static int findLast(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = arr.size() - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (k < arr.get(mid)) {
                high = mid - 1;
            } else if (k > arr.get(mid)) {
                low = mid + 1;
            } else {
                last = mid;
                low = mid + 1;
            }
        }
        return last;
    }
}