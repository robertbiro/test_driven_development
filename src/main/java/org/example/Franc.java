package org.example;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        //without side effect
        return Money.franc (amount * multiplier);
    }

}
