package ctci;

public class StringCompression {
//    static String stringcompress(String string){
//        StringBuilder stringBuilder = new StringBuilder();
//        if(string.length() == 0){
//            return "";
//        }
//        int index = 1;
//        char previous = string.charAt(0);
//        int count = 1;
//        while (index < string.length()){
//            char current = string.charAt(index);
//            if(previous == current){
//                count++;
//                index++;
//            }
//            else {
//                stringBuilder.append(previous);
//                stringBuilder.append(count);
//                previous = current;
//                count = 1;
//                index++;
//            }
//        }
//
//        stringBuilder.append(previous);
//        stringBuilder.append(count);
//        return stringBuilder.toString();
//    }

    public static String compress(String str) {
        int finalLength = countCompression(str);
        if (finalLength >= str.length()) return str;

        StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }

    public static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                System.out.println(countConsecutive);
                countConsecutive = 0;
                System.out.println(compressedLength);
            }
        }
        return compressedLength;
    }

    public static void main(String[] args) {
        String result = compress("abbcc");
        System.out.println(result);
    }
}
