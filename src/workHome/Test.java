package workHome;

import workHome.Utils;

public class Test {
    public static void main(String[] args) {
        String s = "Ile Roman ładny dyndał na moreli?";

        System.out.println(Utils.wordCounter(s));
        CharacterCounter charCouns = new CharacterCounter(s);

        System.out.println(charCouns.sumAllChar());
        System.out.println(charCouns.sumAllChar() - charCouns.getSpace());

        System.out.println(Utils.isPalindrome(s));


    }

}