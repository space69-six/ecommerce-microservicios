package com.ecommerce.ms_carrito;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/carrito") @RequiredArgsConstructor
public class CarritoController {
    private final CarritoService service;
    @GetMapping("/{usuarioId}") public List<ItemCarrito> obtener(@PathVariable Long usuarioId) { return service.obtenerCarrito(usuarioId); }
    @PostMapping public ResponseEntity<ItemCarrito> agregar(@Valid @RequestBody ItemCarrito item) { return ResponseEntity.ok(service.agregar(item)); }
    @DeleteMapping("/{usuarioId}") public ResponseEntity<Void> vaciar(@PathVariable Long usuarioId) { service.vaciar(usuarioId); return ResponseEntity.noContent().build(); }
}
