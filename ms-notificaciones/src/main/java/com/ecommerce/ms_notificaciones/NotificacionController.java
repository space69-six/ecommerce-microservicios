package com.ecommerce.ms_notificaciones;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/notificaciones") @RequiredArgsConstructor
public class NotificacionController {
    private final NotificacionService service;
    @PostMapping public ResponseEntity<Notificacion> enviar(@Valid @RequestBody Notificacion n) { return ResponseEntity.ok(service.enviar(n)); }
    @GetMapping public List<Notificacion> listar() { return service.listar(); }
}
