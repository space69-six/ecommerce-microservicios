package com.ecommerce.ms_usuarios;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/usuarios") @RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService service;
    @GetMapping public List<Usuario> listar() { return service.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Usuario> buscar(@PathVariable Long id) { return ResponseEntity.ok(service.buscar(id)); }
    @PostMapping public ResponseEntity<Usuario> crear(@Valid @RequestBody Usuario u) { return ResponseEntity.ok(service.guardar(u)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) { service.eliminar(id); return ResponseEntity.noContent().build(); }
}
