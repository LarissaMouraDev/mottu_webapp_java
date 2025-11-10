package br.com.mottu.mottu_challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {
    
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "✅ ONLINE");
        response.put("application", "Mottu Challenge - Sprint 4 FIAP");
        response.put("student", "Larissa Moura");
        response.put("rm", "RM557648");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("message", "Pipeline CI/CD Funcionando!");
        response.put("github", "https://github.com/LarissaMouraDev/mottu_webapp_java");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Mottu Challenge");
        return ResponseEntity.ok(response);
    }
}