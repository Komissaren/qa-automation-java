package com.tinkoff.edu.app;

public class LoanRequest {

    private final LoanTypeEnum type;
    private final int months;
    private final int amount;

    public LoanRequest(LoanTypeEnum type, int months, int amount) {
        this.type = type;
        this.months = months;
        this.amount = amount;
    }

    public int getMonths() {
        return months;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return String.format("Request {Type = %s, Amount = %s, LoanTerm = %s}", type, amount, months);
    }

}
