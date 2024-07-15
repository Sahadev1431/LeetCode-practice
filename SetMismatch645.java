package cycleSort;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        // int[]arr = {1,2,2,4};
        int[]arr = {1,1};
        int[]res = mimatch(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mimatch(int[]arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        int[] res = new int[2];
        int ind = 0;
        for (int index = 0; index < arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                res[ind] = arr[index];
                res[ind+1] = index+1;
            }
        }
        return res;
    }
    static void swap(int []arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[ second];
        arr[second] = temp;
    }
}