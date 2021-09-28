package com.kedar.springboot.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override public Health health() {
        Random randomNumber = new Random();
        if(randomNumber.nextInt()%2 == 1){
            return Health.down().withDetail("Status","odd").build();
        }else
            return Health.up().withDetail("Status","even").build();
    }
    // will show up as a custom section under health components
}
