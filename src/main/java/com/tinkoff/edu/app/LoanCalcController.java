package com.tinkoff.edu.app;

//Validates and logs request

public class LoanCalcController {

    LoanCalcService service = new LoanCalcService();

    public LoanResponse createRequest(LoanRequest request) {
        return service.createRequest(request);
    }

}
