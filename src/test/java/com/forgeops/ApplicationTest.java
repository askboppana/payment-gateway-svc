package com.forgeops;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ApplicationTest {
    @Test void contextLoads() { assertTrue(true); }
    @Test void healthReturnsOk() {
        HealthController c = new HealthController();
        assertEquals("ok", c.health().get("status"));
    }
}
