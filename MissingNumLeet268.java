package cycleSort;

class MissingNumLeet268 {
    public static void main(String[] args) {
        int[]nums = {4,0,2,1};
        System.out.println(missingNum(nums));
    }
    static int missingNum(int[]nums)
    {
        //here nums are 0 to n
        int i = 0;
        while (i < nums.length)
        {
            if(nums[i] < nums.length && nums[i] != nums[nums[i]])
            {
                    swap(nums,i,nums[i]);
            }

            // int correctIndex=  nums[i];
            // if(nums[i] < nums.length &&  nums[i] != nums[correctIndex])
            // {
            //     swap(nums,i,correctIndex);
            // }                            // this and above both are are same
            else
            {
                i++;
            }
        }
        for (int index = 0 ;index<nums.length;index++)
            {
                if(nums[index] != index)
                {
                    return index;
                }
            }
        return nums.length;
    }
    static void swap(int[]nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}