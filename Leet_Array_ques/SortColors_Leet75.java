public class SortColors_Leet75 {
    public void sortColors(int[] nums) {
        // [2,0,2,1,1,0]
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] < 1) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
