package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;

/**
 * Loan calc test
 */
public class LoanCalcTest {
    public static void main(String[] args) {
        int requestId = LoanCalcController.createRequest();
        System.out.println(requestId + "must be 1");
    }
}

