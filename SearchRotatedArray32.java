public class SearchRotatedArray32 {

    public static void main(String[] args) {
        
    }
    public static int search(int[] nums, int target) {
        int pivet = findPeak(nums);

        if(pivet == -1)
        {
            return binSearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivet] == target)
        {
            return pivet;
        }
        if(target >=nums[0])
        {
            return binSearch(nums, target, 0, pivet-1);
        } else {
            return binSearch(nums, target, pivet+1, nums.length-1);
        }
    }
    public static int findPeak(int[]nums)
    {
        int start = 0;
        int end = nums.length -1;

        while(start<= end)
        {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(mid<=start)
            {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int binSearch(int []arr,int target,int start,int end)
    {
        
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if (target > arr[mid])
            {
                start = mid+1;
            }
            else    //target == mid
            {
                return mid;
            }
        }
        return -1;
    }
}