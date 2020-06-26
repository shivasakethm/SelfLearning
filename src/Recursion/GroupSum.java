package Recursion;

public class GroupSum {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupSum(start + 1, nums, target - nums[start]))
            return true;

        return groupSum(start + 1, nums, target);

    }

    public static void main(String[] args) {

//        int[] ints = new int[]{2,4,8};
//        System.out.println(groupSum(0, ints, 10));
//        System.out.println("apple".compareTo("banana"));
//        System.out.println("saketh" instanceof String);

        String m = "Hello World";
        String n = m.substring(6, 12) + m.substring(12, 6);
        System.out.println(n);

    }

    static Exception print(int i) {
        if (i > 0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}
