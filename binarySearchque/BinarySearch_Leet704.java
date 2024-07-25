public class BinarySearch_Leet704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int recurBin(int[]arr,int target) {
        return recurBinHelp(arr, target,0,arr.length-1);
    }
    static int recurBinHelp(int [] arr,int target,int low,int high) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (target < arr[mid]) return recurBinHelp(arr, target, low, mid-1);
        else return recurBinHelp(arr, target, low + 1, high);
    }
}
