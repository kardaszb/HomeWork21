package workHome;

public final class Utils {
    private Utils() {
    }

    public static int checkInputFields(String input1, String input2, String input3) {
        int a = 0;
        int b = 0;
        int c = 0;
        if (input1.length() == 0) {
        } else a = 1;
        if (input2.length() == 0) {
        } else b = 1;
        if (input3.length() == 0) {
        } else c = 1;
        return a + b + c;
    }
}
