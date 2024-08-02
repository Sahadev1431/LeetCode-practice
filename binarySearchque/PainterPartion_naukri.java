import java.util.ArrayList;

public class PainterPartion_naukri {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        int high = 0;
        int low = 0;
        for (int i = 0; i < boards.size(); i++) {
            high += boards.get(i);
            low = Math.max(low, boards.get(i));
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possibleInTime(boards,mid,k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private static boolean possibleInTime(ArrayList<Integer>boards,int exceptedTime,int painters) {
        //  2
        // 10 20 30 40
        int i = 0;
        int currentTime = 0;
        while (i < boards.size()) {
            currentTime += boards.get(i);

            if (currentTime > exceptedTime) {
                currentTime = boards.get(i);
                painters--;
            }

            if (painters == 0) return false;
            i++;
        }
        return true;
    }
}
