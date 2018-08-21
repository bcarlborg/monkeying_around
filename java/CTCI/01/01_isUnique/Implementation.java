import java.util.Arrays;

class Implementation {

    public static boolean isUnique(String str) {
        if (str.length() > 128) return false;

        boolean[] unique_char = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (unique_char[str.charAt(i)]) return false;

            unique_char[str.charAt(i)] = true;
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
