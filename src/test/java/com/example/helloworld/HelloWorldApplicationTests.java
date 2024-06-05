package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloWorldApplicationTests {

    @Test
    void contextLoads() {
        // Test if the context loads successfully
    }

    @Test
    void helloEndpointReturnsCorrectMessage() {
        HelloWorldApplication.HelloWorldController controller = new HelloWorldApplication.HelloWorldController();
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello, World!");
    }
}
