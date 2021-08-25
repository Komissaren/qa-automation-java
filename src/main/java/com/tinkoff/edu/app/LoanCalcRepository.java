package com.tinkoff.edu.app;

// Storage data

public class LoanCalcRepository {

    private int requestId;

    /**
     * persist request
     *
     * @return request Id
     */
    public LoanResponse save(LoanRequest request) {
        if ((request.getAmount() < 100_000) && (request.getMonths() > 3)) {
            return new LoanResponse(++requestId, ResponseTypeEnum.APPROVED);
        } else {
            return new LoanResponse(++requestId, ResponseTypeEnum.DECLINED);
        }
    }

}
