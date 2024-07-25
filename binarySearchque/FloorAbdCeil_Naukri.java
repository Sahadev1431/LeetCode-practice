public class FloorAbdCeil_Naukri {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;
        int floor = -1;
        int ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == x) {
                floor = a[mid];
                ceil = a[mid];
                return new int[] {floor,ceil};
            } else if (a[mid] > x) {
                ceil = a[mid];
                high = mid - 1;
            } else {
                floor = a[mid];
                low = mid + 1;
            }
        }
        return new int[] {floor,ceil};
      }
}
