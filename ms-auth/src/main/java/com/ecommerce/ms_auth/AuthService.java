package com.ecommerce.ms_auth;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class AuthService {
    private final UsuarioRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public Usuario registrar(Usuario u) {
        u.setPassword(encoder.encode(u.getPassword()));
        return repo.save(u);
    }
    public AuthResponse login(LoginRequest req) {
        Usuario u = repo.findByEmail(req.getEmail()).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        if (!encoder.matches(req.getPassword(), u.getPassword())) throw new RuntimeException("Password incorrecto");
        String token = "JWT-" + u.getEmail() + "-" + u.getRol() + "-" + System.currentTimeMillis();
        return new AuthResponse(token, u.getEmail(), u.getRol());
    }
}
