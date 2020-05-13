package by.training.task1.file;

import lombok.Getter;

import java.math.BigDecimal;

public class Card {
    @Getter
    private String nameOwner;
    @Getter
    private BigDecimal balance;


    Card(String nameOwner, BigDecimal balance) {
        this.nameOwner = nameOwner;
        this.balance = balance;
    }

    Card(String nameOwner) {
        this(nameOwner, BigDecimal.valueOf(0));
    }

    public BigDecimal addToBalance(BigDecimal value) {
        balance = balance.add(value);
        return balance;
    }

    public BigDecimal withdrawFromBalance(BigDecimal value) {
        balance = balance.subtract(value);
        return balance;
    }

    public BigDecimal getBalanceWithExchangeRate(BigDecimal exchangeRate) {
        balance = balance.multiply(exchangeRate);
        return balance;
    }

}