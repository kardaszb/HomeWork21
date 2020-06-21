package workHome;

import java.util.regex.Pattern;

public final class Utils {
    private Utils() {
    }

    public static int wordCounter(String text) {
        Pattern pattern = Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS);
        return pattern.split(text).length;
    }

    public static boolean isPalindrome(String text) {
        String optima = Pattern.compile("\\W",Pattern.UNICODE_CHARACTER_CLASS)
                .matcher(text)
                .replaceAll("")
                .toLowerCase();

        StringBuilder reverse = new StringBuilder(optima).reverse();
        return (reverse.toString()).equals(optima);
    }


}
