package org.example;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
    //without side effect
        return Money.dollar(amount * multiplier);
    }

}
