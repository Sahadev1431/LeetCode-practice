public class RotateArrByKPlace_Leet189 {
    public void rotate(int[] nums, int k) {
        // [1,2,3,4,5,6,7] k=3
        rev(nums, 0, nums.length-k-1);
        rev(nums, nums.length-k, nums.length-1);
        rev(nums, 0, nums.length-1);

    }

    static void rev(int[]arr,int start,int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end++;
        }
    }
}
