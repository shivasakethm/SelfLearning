package ctci;

class OneAwayCheck {
    boolean passToTheFunction(String first, String second) {
        if (first.length() == second.length()) {
            return oneAwayCheckReplace(first, second);
        }
        if (first.length() == second.length() + 1) {
            return oneAwayCheckAddorEdit(first, second);
        }
        if (first.length() == second.length() - 1) {
            return oneAwayCheckAddorEdit(second, first);
        }
        return false;
    }

    boolean oneAwayCheckReplace(String first, String second) {
        int i = 0;
        int count = 0;
        while (i < first.length()) {
            if (first.charAt(i) != second.charAt(i)) {
                count++;
                i++;
            } else {
                i++;
            }
        }
        return count <= 1;
    }

    boolean oneAwayCheckAddorEdit(String first, String second) {
        int traversefirst = 0;
        int traversesecond = 0;
        int count = 0;
        while (traversefirst < first.length() && traversesecond < second.length()) {
            if (first.charAt(traversefirst) != second.charAt(traversesecond)) {
                count++;
                traversefirst++;
            } else {
                traversefirst++;
                traversesecond++;
            }
        }
        return count <= 1;
    }
}

public class OneAway {

    public static void main(String[] args) {

        OneAwayCheck oneAwayCheck = new OneAwayCheck();
        boolean result = oneAwayCheck.passToTheFunction("saketh", "sakettz");
        System.out.println(result);
    }
}


//Instead of using count we can use a boolean variable and see if it changes the state twice then return false.
//Instead of using two separate codes for replace and edit we can combine them.traverse through using both pointers.
// See if equal or not at that index. If it is not equal check for the string length and move accordingly.