package com.tinkoff.edu.app;

public class LoanResponse {

    private final int requestId;
    private final ResponseTypeEnum responseType;

    public LoanResponse(int requestId, ResponseTypeEnum responseType) {
        this.requestId = requestId;
        this.responseType = responseType;
    }

    public int getRequestId() {
        return requestId;
    }

    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    @Override
    public String toString() {
        return String.format("Response { RequestId = %s, ResponseType = %s}", requestId, responseType);
    }

}
