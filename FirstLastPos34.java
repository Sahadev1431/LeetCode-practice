class FirstLastPos34{
    public static void main(String[] args) {
        // int [] nums = {5,7,7,8,8,10};
        // int target = 8;
        // System.out.println(searchRange(nums, target));

        int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;
    int[] result = searchRange(nums, target);
    System.out.println("First and last positions of " + target + ":");
    for (int num : result) {
        System.out.print(num + " ");
    }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] newArr = {-1,-1};

        int firInd = search(nums, target, true);
        int lastInd = search(nums, target, false);

        newArr[0] = firInd;
        newArr[1] = lastInd;

        return newArr;
    }

    public static int search(int [] nums,int target,boolean findFirstInd){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start<=end)
        {
            int mid = start +(end - start) /2;

            if(target<nums[mid])
            {
                end = mid -1;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            else
            {
                ans = mid;
                if(findFirstInd)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
                
            }
        }
        return ans;
    }
}