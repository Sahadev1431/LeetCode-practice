import java.util.ArrayList;
// import java.util.*;

public class AllocateBooks_Naukri {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // arr.sort(null);
        if (m > n) return -1;

        int max = Integer.MIN_VALUE;
        int high = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            high += arr.get(i);
        }
        if (m == 1) return high;

        
        int low = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possibleNoOfStudent(arr, mid) > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int possibleNoOfStudent(ArrayList<Integer>arr,int pages) {
        int stu = 1;
        int pagesStu = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (pagesStu + arr.get(i) <= pages) {
                pagesStu += arr.get(i);
            } else {
                stu += 1;
                pagesStu = arr.get(i);
            }
        }
        return stu;
    }
}
