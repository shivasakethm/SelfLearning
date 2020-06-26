package Recursion;

public class CodeBat {

    static boolean array6(int[] nums, int index) {
        if (index >= nums.length)
            return false;

        return nums[index] == 6 || array6(nums, index + 1);
    }

    static boolean array220(int[] nums, int index) {
        if (nums.length <= 1) {
            return false;
        }
        if (index >= nums.length) {
            return false;
        }
        if (nums[index + 1] == 10 * nums[index]) {
            return true;
        }
        return false || array220(nums, index + 1);
    }

    static String parenBit(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return str;

        if (str.charAt(0) == '(') {
            System.out.println(str);
            return parenBit(str.substring(0, str.length() - 1));
        }
        if (str.charAt(str.length() - 1) == ')') {
            System.out.println(str);
            return parenBit(str.substring(1));
        }

        return parenBit(str.substring(1, str.length() - 1));
    }

    static boolean nestParen(String str) {
        if (str.length() < 1) {
            return false;
        }
        if (str.length() == 1 && str.charAt(0) == ')') {
            return true;
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return true && nestParen(str.substring(1, str.length() - 1));
        }
        return false;

    }

    static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length() - 1).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n <= 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(sub.length()), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }

    public static int strDist(String str, String sub) {
        if (str.length() == 1) {
            if (str.equals(sub)) {
                return 1;
            }
        }
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (str.substring(0, sub.length()).equals(sub) && !str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        if (!str.substring(0, sub.length()).equals(sub) && str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(1, str.length() - 1), sub);
    }

    public static void main(String[] args) {

    }


}
