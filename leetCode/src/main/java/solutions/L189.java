package leetCode.src.main.java.solutions;

/**
 * @author: weibin.wang
 * @date: 6/1/24
 */
public class L189 {
    public void rotate(int[] nums, int k) {
        int step = k % nums.length;
        int[] tmpNums = new int[step];
        for (int i = 0; i < step; i++) {
            tmpNums[i] = nums[nums.length - step + i];
        }
        for (int i = 0; i < nums.length - step; i++) {
            nums[nums.length - 1 - i] = nums[nums.length - 1 - step - i];
        }
        for (int i = 0; i < step; i++) {
            nums[i] = tmpNums[i];
        }
    }

    public void rotate1(int[] nums, int k) {
        int step = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, step - 1);
        reverse(nums, step, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            ++start;
            --end;
        }
    }
}
