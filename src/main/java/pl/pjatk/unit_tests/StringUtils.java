package pl.pjatk.unit_tests;

public class StringUtils {

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String reverseString(String input) {
//        return new StringBuilder(input).reverse().toString();
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }
        return reverse.toString();
    }

    public static String multiplyString(String input, int multiplier) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= multiplier; i++) {
            result.append(input);
            if (i != multiplier) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String removeSmallChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(input.charAt(i));
            }
            if (Character.isSpaceChar(input.charAt(i))) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeBigChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                result.append(input.charAt(i));
            }
            if (Character.isSpaceChar(input.charAt(i))) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeAllButLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
