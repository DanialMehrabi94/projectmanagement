package com.smartagilify.projectmanagement;

import com.smartagilify.projectmanagement.enumerations.ServerProperties;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.MessageFormat;

@RequiredArgsConstructor
@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ProjectManagementApplication.class);
    private final ServerProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

    public void run(String... args) {
        final String env = MessageFormat.format("using environment: [{0}]", properties.getEnvironment());
        logger.info(env);
    }
}
