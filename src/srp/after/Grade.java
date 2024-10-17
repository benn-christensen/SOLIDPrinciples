package srp.after;

public enum Grade {
    MINUSTHREE(-3), ZERO(0), TWO(2), FOUR(4), SEVEN(7), TEN(10), TWELVE(12);

    private final int value;

    Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
