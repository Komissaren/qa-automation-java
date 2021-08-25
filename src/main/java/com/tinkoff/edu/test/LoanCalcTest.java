package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import com.tinkoff.edu.app.LoanResponse;
import com.tinkoff.edu.app.LoanTypeEnum;


/**
 * Loan calc test
 */
public class LoanCalcTest {

    /**
     * Main class
     *
     * @param args main arguments
     */
    public static void main(String... args) {
        LoanRequest request = new LoanRequest(LoanTypeEnum.PERSON, 36, 15_000);
        LoanResponse response = new LoanCalcController().createRequest(request);
        System.out.println(request);
        System.out.println(response);
        System.out.printf("In this case we have requestId = %s and expected requestId = 1%n",
                response.getRequestId());
    }

}


