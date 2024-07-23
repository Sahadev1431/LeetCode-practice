import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // // [3,2,3]
        // for (int i = 0; i < nums.length; i++) {
        //     int value = map.getOrDefault(nums[i], 0);
        //     map.put(nums[i], value+1);
        // }
        // for (Map.Entry<Integer,Integer> it : map.entrySet()) {
        //     if (it.getValue() > (nums.length / 2)) {
        //         return it.getKey();
        //     }
        // }
        // return -1;

        int count = 0;
        int el = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (nums[i] != el) {
                count--;
            } else {
                count++;
            }
        }
        return el;
    }
}
