package com.tinkoff.edu.app;

//Processing loan

public class LoanCalcService {
    public static int createRequest() {
        int requestId = LoanCalcRepository.save();
        LoanCalcLogger.log(requestId);
        return requestId;
    }
}
