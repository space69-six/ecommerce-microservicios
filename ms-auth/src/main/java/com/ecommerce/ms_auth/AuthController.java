package com.ecommerce.ms_auth;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/auth") @RequiredArgsConstructor
public class AuthController {
    private final AuthService service;
    @PostMapping("/registro") public ResponseEntity<Usuario> registrar(@Valid @RequestBody Usuario u) { return ResponseEntity.ok(service.registrar(u)); }
    @PostMapping("/login") public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest req) { return ResponseEntity.ok(service.login(req)); }
}
