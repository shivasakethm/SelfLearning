package ctci;

public class StringRotation {

    static boolean rotation(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }
        if (first.equals(second)) {
            return true;
        }
        for (int i = 1; i < first.length(); i++) {
            String string = "";
            String string1 = string.concat(second.substring(i)).concat(second.substring(0, i));
            if (first.equals(string1)) {
                System.out.println(first + " " + second + " " + string1);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = rotation("saketh", "ethsai");
        String first = "waterbottle";
        String second = "erbottlewar";
        String third = second.concat(second);
        System.out.println(third.indexOf(first));
        System.out.println(result);
    }
}
