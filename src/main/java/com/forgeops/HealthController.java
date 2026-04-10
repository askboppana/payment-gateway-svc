package com.forgeops;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
public class HealthController {
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "ok", "service", "payment-gateway-svc", "version", "1.0.0");
    }
}
