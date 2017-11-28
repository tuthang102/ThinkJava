public class Recurse {
    public static char first(String s) {
        return s.charAt(0);
    }

    public static String rest(String s) {
        return s.substring(1);
    }

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        int len = length(s);
        for (int i = 0; i < len; i++) {
            System.out.println(first(s));
            s = rest(s);
        }
    }

    public static void printBackward(String s) {
        int len = length(s);
        for (int j = len; j > 0; j--) {
            String a = s;
            for (int i = 0; i < j -1; i++) {
                a = rest(a);
            }
            System.out.println(first(a));
        }
    }

    public static String reverseString(String s) {
        int len = length(s);
        String result = "";
        for (int j =len; j >0; j--) {
            String a = s;
            for (int i = 0; i < j -1; i++) {
                a = rest(a);
            }
            result = result + first(a);
        }
        return result;
    }

    public static boolean isPalindrome(String s) {
        String rev_s = reverseString(s).toLowerCase();
        s = s.toLowerCase();
        if (s.equals(rev_s)) {
            return true;
        }
        else {
        return false;
        }
    }

    public static boolean isAbecedarian(String s) {
        int len = length(s);
        for (int i=0; i < len - 1; i++) {
            if (s.compareTo(rest(s)) > 0) {
                return false;
            }
            s = rest(s);
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "Archangel";
        System.out.println(first(name) + "\t" + rest(name) +
        "\t" + middle(name) + "\t" + length(name) );
        System.out.println("Print a string:");
        printString(name);
        System.out.println("Print a string in backward direction:");
        printBackward(name);
        System.out.println("Reserve a string:");
        System.out.println(reverseString(name));
        System.out.println("Check if a name is a parlindrome");
        System.out.println(isPalindrome("Hannah"));
        System.out.println("Check if a word is a abecedarian");
        System.out.println(isAbecedarian("abcd"));
    }
}
