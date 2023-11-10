package org.example;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
    //without side effect
        return new Dollar(amount * multiplier);

    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == ((Dollar) object).amount;
    }
}
