package leetCode.src.main.java.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: weibin.wang
 * @date: 6/1/24
 */
public class L169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(nums[i])) {
                record.put(nums[i], record.get(nums[i]) + 1);
            } else {
                record.put(nums[i], 1);
            }
        }
        int res = -1, frequence = -1;
        for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
            if (entry.getValue() > frequence) {
                res = entry.getKey();
                frequence = entry.getValue();
            }
        }
        return res;
    }

    public int majorityElement1(int[] nums) {
        int candidate = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
