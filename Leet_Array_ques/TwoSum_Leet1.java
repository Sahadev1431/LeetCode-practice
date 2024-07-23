import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_Leet1 {
    public int[] twoSum(int[] nums, int target) {
        // [2,7,11,15]   t = 9

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i,map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};


    }
}
