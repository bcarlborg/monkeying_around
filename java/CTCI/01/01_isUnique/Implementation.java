import java.util.Arrays;
import java.util.HashMap;

class Implementation {

    public static boolean isUnique(String str) {
        // return isUniqueBookImplementation(str);
        // return isUniqueHashMapImplementation(str);
        return isUniqueBruteForce(str);
    }

    public static boolean isUniqueBookImplementation(String str) {

        if (str.length() > 128) return false;

        boolean[] unique_char = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (unique_char[str.charAt(i)]) return false;

            unique_char[str.charAt(i)] = true;
        }

        return true;
    }


    public static boolean isUniqueHashMapImplementation(String str) {

        if (str.length() > 128) return false;

        // Make new Hashmap
        HashMap<Character, Boolean> unique_char = new HashMap<Character, Boolean>(128);

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (unique_char.containsKey(curr)) {
                if (unique_char.get(curr)) {
                    return false;
                }
            }
            unique_char.put(curr, true);
        }

        return true;
    }

    public static boolean isUniqueBruteForce(String str) {

        if (str.length() > 128) return false;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j) {
                    if (str.charAt(i) == str.charAt(j)) return false;
                }
            }
        }

        return true;
    }


    public static void main(String args[]) {
        Implementation imp = new Implementation();

        String input = "abcd";
        System.out.println("Testing: " + input);
        System.out.println(imp.isUnique(input));

        input = "aaaa";
        System.out.println("Testing: " + input);
        System.out.println(imp.isUnique(input));
    }
}
