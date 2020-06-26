package ctci;

class FindUnique {

    boolean uniqueCharacters(String str) {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';

            // if that bit is already set in checker,
            // return false
            if ((checker & (1 << bitAtIndex)) > 0)
                return false;

            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
        }

        // no duplicates encountered, return true
        return true;
    }

    public boolean isUnique(String string) {
        boolean[] ints = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            if (ints[string.charAt(i)]) {
                return false;
            } else {
                ints[string.charAt(i)] = true;
            }

        }
        return true;
    }
}

public class IsUnique {
    public static void main(String[] args) {
        FindUnique findUnique = new FindUnique();
        System.out.println(findUnique.isUnique("sakeths"));
    }
}
