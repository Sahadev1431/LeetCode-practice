public class MissingNum_Leet268 {
    public int missingNumber(int[] nums) {
        // int i = 0;
        // int sum = 0;
        // int arrSum = 0;
        // while (i < nums.length) {
        //     sum +=i;
        //     arrSum += nums[i];
        //     i++;
        // }
        // sum += i;
        // return sum - arrSum;

        int sum = ((nums.length+1) * (nums.length)) / 2;
        int arSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arSum += nums[i];
        }
        return sum = arSum;
    }

    public static void main(String[] args) {
        int[]nums = {3,0,1};
        int sum = ((nums.length+1) * (nums.length)) / 2;
        System.out.println(sum);
        
    }
}
