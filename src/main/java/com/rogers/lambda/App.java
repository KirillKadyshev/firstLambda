package com.rogers.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Object,String> {

    @Override
    public String handleRequest(Object input, Context context) {
        return "Hello Rogers Team!!!";
    }
}
