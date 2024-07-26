public class SingleEleInArr_leet540 {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];   
        if (nums[1] != nums[0]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else {
                if (nums[mid] == nums[mid - 1] && (mid % 2 == 0)) {
                    high = mid - 1;
                } else if (nums[mid] == nums[mid + 1] && (mid % 2 != 0)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;


        // same approch by striver

        // if (nums.length == 1) return nums[0];   
        // if (nums[1] != nums[0]) return nums[0];
        // if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];

        // int low = 0;
        // int high = nums.length - 1;

        // while (low <= high) {
        //     int mid = (low + high) / 2;
            
        //     if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
        //         return nums[mid];
        //     } else {
        //         if ((nums[mid] == nums[mid - 1] && (mid % 2 == 0)) || (nums[mid] == nums[mid + 1] && (mid % 2 != 0))) {
        //             high = mid - 1;
        //         } else {
        //             low = mid + 1;
        //         }
        //     }
        // }
        // return -1;
    }
}
