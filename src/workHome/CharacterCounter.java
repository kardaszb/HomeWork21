package workHome;

public class CharacterCounter {
    private int letter = 0;
    private int space = 0;
    private int num = 0;
    private int other = 0;

    public CharacterCounter(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(chars[i])) {
                this.letter++;
            } else if (Character.isDigit(chars[i])) {
                this.num++;
            } else if (Character.isSpaceChar(chars[i])) {
                this.space++;
            } else {
                this.other++;
            }
        }
    }

    public int getLetter() {
        return letter;
    }

    public void setLetter(int letter) {
        this.letter = letter;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "CharacterCounter{" +
                "letter=" + letter +
                ", space=" + space +
                ", num=" + num +
                ", other=" + other +
                '}';
    }

    public int sumAllChar() {
        return getNum() + getLetter() + getSpace() + getOther();
    }
}
