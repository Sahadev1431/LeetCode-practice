package cycleSort;

import java.util.Arrays;

public class DuplicateNum287 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1,7};
        int[]res = duplicateNum(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] duplicateNum(int[]arr)
    {
        int i = 0;
        while ( i < arr.length)
        {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        
        int count = 0;
        for (int index = 0 ;index < arr.length;index++)
        {
            if (arr[index] != index+1)
            {
                count++;
            }
        }
        int [] res = new int[count];
        int ind = 0;
        for (int index = 0 ;index < arr.length;index++)
        {
            if (arr[index] != index+1)
            {
                res[ind] = arr[index];
                ind++;
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