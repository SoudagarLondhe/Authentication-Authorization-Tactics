package com.example.authz.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/public/ping")
    public Map<String, String> publicPing() {
        return Map.of("message", "public OK");
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user/data")
    public Map<String, String> userData() {
        return Map.of("message", "user OK", "visibility", "USER+");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/secret")
    public Map<String, String> adminSecret() {
        return Map.of("message", "admin OK", "visibility", "ADMIN-only");
    }
}
