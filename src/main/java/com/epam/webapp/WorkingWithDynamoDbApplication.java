package com.epam.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;

@SpringBootApplication
public class WorkingWithDynamoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkingWithDynamoDbApplication.class, args);
    }

}
