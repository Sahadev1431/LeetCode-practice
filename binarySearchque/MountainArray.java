public class MountainArray {
    public static void main(String[] args) {
     
        int [] ar = {5,1,3};
        System.out.println(Mountain(ar));
    }

    static int Mountain(int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start<end)
        {
            int mid = start + (end -start) /2;
            if(arr[mid] > arr[mid+1])
            {
                //decresing part of an array
                end = mid;
            }
            else if(arr[mid] < arr[mid+1]&& arr[mid] < arr[mid-1])
            {
                if(arr[mid-1]>arr[mid+1])
                {
                    return mid-1;
                }
                else
                {
                    return mid+1;
                }
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
