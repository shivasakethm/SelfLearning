package ctci;

class URLifySpacesFill {
    String fillURL(String string) {
        char[] char_set = string.toCharArray();
        char[] result_set = new char[string.length()];
        int i = 0;
        int j = 0;
        for (char c : char_set) {
            if (j >= string.length()) {
                break;
            }
            if (c != ' ') {
                result_set[j] = char_set[i];
                i++;
                j++;
            } else {
                result_set[j] = '%';
                result_set[j + 1] = '2';
                result_set[j + 2] = '0';
                j = j + 3;
                i++;
            }
        }
        return String.valueOf(result_set);
    }

    String bookSolution(String string, int length) {
        char[] char_set = string.toCharArray();
        int traverse = length - 1;
        for (int i = string.length() - 1; i > 0; i--) {
            if (char_set[traverse] == ' ') {
                char_set[i] = '0';
                char_set[i - 1] = '2';
                char_set[i - 2] = '%';
                i = i - 2;
                traverse--;
            } else {
                char_set[i] = char_set[traverse];
                traverse--;
            }
        }
        System.out.println(char_set);
        return "";
    }
}

public class URLify {
    public static void main(String[] args) {
        URLifySpacesFill urLifySpacesFill = new URLifySpacesFill();
        String result = urLifySpacesFill.fillURL("Mr John Smith    ");
        String result1 = urLifySpacesFill.bookSolution("Mr John Smith    ", 13);
        System.out.println(result);
    }
}
