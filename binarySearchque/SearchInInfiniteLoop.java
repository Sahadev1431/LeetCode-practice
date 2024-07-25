// // ******** MY SOLUTION *********

// public class SearchInInfiniteLoop {
//     public static void main(String[] args) {
//         int [] arr = {2,4,5,6,8,9,10,12,15,18,20,24,26,30,35,38,39,45,46,49,55,59,69,78,80,86,89,92,95,98,100};

        
//         // for(int i = 0;i<arr.length;i++)
//         // {
//         //     int ind =InfiniteSearch(arr,arr[i]);
//         //     System.out.println(ind);
//         // }
//         int ind =InfiniteSearch(arr,100);
//             System.out.println(ind);
        
//     }

//     public static int InfiniteSearch(int[] arr,int target)
//     {
//         int start = 0;
//         int end = 1;
//         int temp = 0;
//         int mid = 0;
//         while(start<=end)
//         {
//             mid = start + (end - start) / 2;
//             if(target<arr[mid])
//             {
//                 end = mid -1;
//             }
//             else if(target > arr[mid])
//             {
//                 start = mid + 1;
//             }
//             else
//             {
//                 return mid;
//             }
//             temp = end;
//             end = end + (end -start +1)*2;
//             start = temp+1; 
//         }
//         return mid-1;
//     }
// }




// kunal kushwaha but not working for 100 last element

class SearchInInfiniteLoop{
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,8,9,10,12,15,18,20,24,26,30,35,38,39,45,46,49,55,59,69,78,80,86,89,92,95,98,100};
        System.out.println(ans(arr, 98));
    }


    static int ans(int[]arr,int target)
    {
        int start = 0;
        int end = 1;
        while(target > arr[end])
        {
            int newStart = end +1;
            end = end + (end - start +1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int [] arr,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start) /2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}








