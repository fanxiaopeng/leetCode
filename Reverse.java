/**
 * 7. 颠倒整数
 *
 * 给定一个范围为 32 位 int 的整数，将其颠倒。
 *
 * 例 1:
 * 输入: 123
 * 输出:  321
 *
 * 例 2:
 * 输入: -123
 * 输出: -321
 *
 * 例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能处理 32 位 int 范围内的整数。根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。
 **/


class Reverse {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        List<Integer> arr = new ArrayList<Integer>();
        boolean flag = x > 0;
        int absolute = x;
        if (!flag) {
            absolute = -x;
        }
        while (absolute > 0) {
            int a = absolute % 10;
            arr.add(a);
            absolute = absolute / 10;
        }

        int result = 0;
        int length = arr.size();
        for (int j = 0; j < length; j++) {
            int element = arr.get(j);
            if (result > 214748364 || result == 214748364 && element > 7) {
                return 0;
            }
            result = result * 10 + element;
        }

        if (!flag) {
            if (result > 2147483647) {
                return 0;
            }
            return -result;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
