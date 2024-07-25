public class floorNum {
    public static void main(String[] args)
    {
        int arr[] = {2,4,7,8,12,15,18,20};
        int target = 1;

        System.out.println(floor(arr,target));
    }

    static int floor(int []arr,int target)
    {
        if(target < arr[0])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        while(start<=end)
        {
            mid = start + (end - start)/2;

            if(target < arr[mid])
            {
                end = mid -1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
