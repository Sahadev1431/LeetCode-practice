public class REmoveDupSortedArr_leet26 {

    static int removeDup(int[]nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                nums[count+1] = nums[i];
                count++;
            }
        }
        return count+1;
    }
}