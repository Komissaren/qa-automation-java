package com.tinkoff.edu.app;

//Processing loan

public class LoanCalcService {

    LoanCalcRepository repository = new LoanCalcRepository();

    public LoanResponse createRequest(LoanRequest request) {
        LoanResponse response = repository.save(request);
        LoanCalcLogger.log(String.format("Request was saved with ID: %s", response.getRequestId()));
        return response;
    }

}
