public class FindElementInMountain {
    public static void main(String[] args) {
        int[] MountainArray = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(5,MountainArray));
    }

    public static int findInMountainArray(int target, int[] MountainArray) {
        int peak = SearchPeakArray(MountainArray);
        int firstTry = orderAgnosticBinarySearch(MountainArray, target, 0, peak);
        if(firstTry != -1)
        {
            return firstTry;
        }
        return orderAgnosticBinarySearch(MountainArray, target, peak+1, MountainArray.length-1);
    }

    static int orderAgnosticBinarySearch(int[]MountainArray,int target,int start,int end)
    {
        if(MountainArray[start]<MountainArray[end])
        {
            while(start <=end)
            {
                int mid = start +(end - start) / 2;
                if(target < MountainArray[mid])
                {
                    end = mid - 1;
                }
                else if (target > MountainArray[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        else
        {
            while(start <=end)
            {
                // int[] MountainArray = {16,14,12,10,8,6,4,2};   
                int mid = start +(end - start) / 2;
                if(target > MountainArray[mid])
                {
                    end = mid - 1;
                }
                else if (target < MountainArray[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        return -1;
    }
    static int SearchPeakArray(int [] MountainArray)
    {
        int start = 0;
        int end = MountainArray.length-1;
        while(start<end)
        {
            int mid = start + (end - start) / 2;
            if(MountainArray[mid]>MountainArray[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
            return start;
        }
        return -1;
    }
}
