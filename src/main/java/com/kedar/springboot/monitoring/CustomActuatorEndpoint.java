package com.kedar.springboot.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// can be accessed via localhost:8080/actuator/custom
@Endpoint(id = "custom")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    public Object returnCustomStuff(){
        Map<String, String> values = new HashMap<>();
        values.put("key", "value");
        return values;
    }
}
