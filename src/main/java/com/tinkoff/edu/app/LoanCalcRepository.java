package com.tinkoff.edu.app;

// Storage data

public class LoanCalcRepository {
    private static int requestId;

    /**
     * TODO persist request
     *
     * @return request Id
     */
    public static int save() {
        ++requestId;
        return requestId;
    }
}
