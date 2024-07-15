package cycleSort;

import java.util.Arrays;

public class MissingNumber2Google {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        int[]res = missingNum2(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] missingNum2(int[]arr)
    {// 1 to n
        int i = 0;
        while (i<arr.length)
        {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        int[]res = new int[arr.length];
        for (int index = 0;index < arr.length;index++)
        {
            if (arr[index] != index+1)
            {
                res[index] = index+1;
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
