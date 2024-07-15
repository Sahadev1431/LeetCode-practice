
public class ceilingNum {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,15,16,18};

        System.out.println("Seling is "+ceilingOfNum(arr, 19));
    }

    static int ceilingOfNum(int arr[],int target)
    {
        if(target > arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length -1 ;
        int mid = 0;

        while(start<=end)
        {
            mid = start +(end-start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
