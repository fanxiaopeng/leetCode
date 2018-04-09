/**
 * 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 示例1:
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *
 * 示例2:
 * 输入: 3
 * 输出: False
 **/


class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        boolean result = false;
        int halfValue = (int) Math.sqrt(c) + 1;
        for (int i = 0; i <= halfValue; i++) {
            double c2 = Math.sqrt(c - i * i);
            int c3 = (int) c2;
            if ((c2 - c3) == 0) {
                result = true;
                break;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.judgeSquareSum(25));
    }
}
