package leetCode.src.main.java.solutions;

/**
 * @author: weibin.wang
 * @date: 7/1/24
 */
public class L45 {
    public int jump(int[] nums) {
        int res = 0;
        int currentPos = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            //At each step, determine the farthest position you can reach with the current jump and update the farthest variable accordingly.
            farthest = Math.max(farthest, i + nums[i]);

            //means you need to make another jump
            if (currentPos == i) {

                //Update currentEnd to the farthest position reached and increment the jumps count
                res++;
                currentPos = farthest;

                //Break the loop if currentEnd is greater than or equal to the last index.
                if (farthest >= nums.length - 1) {
                    break;
                }
            }
        }
        return res;

    }
}
