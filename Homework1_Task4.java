public class Homework1_Task4 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        reverseWords(sb, sb.length());
        return cleanSpaces(sb, sb.length());
    }

    public static void reverseWords(StringBuilder sb, int n) {
        int i = 0;
        int j = 0;
        while (i < n) {
            while (i < j || i < n && sb.charAt(i) == ' ') {
                ++i;
            }
            while (j < i || j < n && sb.charAt(j) != ' ') {
                ++j;
            }
            reverse(sb, i, j - 1);
        }
    }

    public static String cleanSpaces(StringBuilder sb, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            while (j < n && sb.charAt(j) == ' ') {
                ++j;
            }
            while (j < n && sb.charAt(j) != ' ') {
                sb.setCharAt(i++, sb.charAt(j++));
            }
            while (j < n && sb.charAt(j) == ' ') {
                ++j;
            }
            if (j < n) {
                sb.setCharAt(i++, ' ');
            }
        }
        return sb.substring(0, i).toString();
    }


    public static void reverse(StringBuilder sb, int l, int r) {
        while (l < r) {
            final char temp = sb.charAt(l);
            sb.setCharAt(l++, sb.charAt(r));
            sb.setCharAt(r--, temp);
        }
    }
}

//    public static String reverseName(String name) {
//
//        name = name.trim();
//
//        StringBuilder reversedNameBuilder = new StringBuilder();
//        StringBuilder subNameBuilder = new StringBuilder();
//
//        for (int i = 0; i < name.length(); i++) {
//
//            char currentChar = name.charAt(i);
//
//            if (currentChar != ' ') {
//                subNameBuilder.append(currentChar);
//            } else {
//                reversedNameBuilder.insert(0, currentChar + subNameBuilder.toString());
//                subNameBuilder.setLength(0);
//            }
//
//        }
//
//        return reversedNameBuilder.insert(0, subNameBuilder.toString()).toString();
//
//    }
//
//    private static void printTest(String S) {
//
//        System.out.printf("Reverse name for %s: %s\n", S, reverseName(S));
//    }
//}
