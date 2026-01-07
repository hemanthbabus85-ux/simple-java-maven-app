package com.mycompany.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object event, Context context) {
        context.getLogger().log("Hello from Jenkins deployed Java Lambda");
        return "Lambda executed successfully";
    }
}
