package com.trustbanc.additionservice.endpoints;

import com.trustbanc.additionservice.dto.AddNumbersRequest;
import com.trustbanc.additionservice.dto.AddNumbersResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AdditionServiceEndpoint {
    private static final String NAMESPACE_URI = "http://spengergasse.at/hae17487/soapdemo/schema";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addNumbersRequest")
    @ResponsePayload
    public AddNumbersResponse addNumbers(@RequestPayload AddNumbersRequest request) {
        AddNumbersResponse response = new AddNumbersResponse();
        response.setResult(request.getNumber1() + request.getNumber2());
        return response;
    }
}
