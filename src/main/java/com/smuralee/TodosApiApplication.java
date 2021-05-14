package com.smuralee;

import com.smuralee.config.CrossAccountClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.codeguruprofilerjavaagent.Profiler;

@SpringBootApplication
public class TodosApiApplication {

    public static void main(String[] args) {
        final String roleArn = System.getenv("CODEGURU_ROLE");
        Profiler.builder()
                .profilingGroupName("todos")
                .awsCredentialsProvider(CrossAccountClient.getCredentials(roleArn, "todos-profiling"))
                .withHeapSummary(true)
                .build()
                .start();
        SpringApplication.run(TodosApiApplication.class, args);
    }

}
