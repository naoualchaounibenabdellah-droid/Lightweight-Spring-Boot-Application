package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;import java.util.Map;
@RestControllerpublic class HelloController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello from Spring Boot API!",
                "timestamp", LocalDateTime.now().toString()
        );
    }
}
