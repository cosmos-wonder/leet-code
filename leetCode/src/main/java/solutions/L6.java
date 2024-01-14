package leetCode.src.main.java.solutions;

/**
 * @author: weibin.wang
 * @date: 11/1/24
 */
public class L6 {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < numRows; i++) {
            int start = i;
            while (start < n) {
                int step1 = start;
                int step2 = 2 * (numRows - 1) - start;

                sb.append(s.charAt(step1));

                if (step2 < n && step2 != step1) {
                    sb.append(step2);
                }
                start =  2 * (numRows - 1);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        L6 solution = new L6();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(s, numRows);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }

}
