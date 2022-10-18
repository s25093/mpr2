package pl.pjatk.tdd.strings;

public class StringUtils {

    public static int sumOfDigitsInNumber(int number){
        String strNum = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            sum += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        return sum;
    }

    public static boolean isPalindrome(String text){
        StringBuilder mirror = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            mirror.append(text.charAt(i));
        }
        return mirror.toString().equals(text);
    }
}
