package com.ecommerce.ms_inventario;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/inventario") @RequiredArgsConstructor
public class InventarioController {
    private final InventarioService service;
    @GetMapping public List<Inventario> listar() { return service.listar(); }
    @GetMapping("/producto/{id}") public ResponseEntity<Inventario> buscar(@PathVariable Long id) { return ResponseEntity.ok(service.buscarPorProducto(id)); }
    @PostMapping public ResponseEntity<Inventario> crear(@Valid @RequestBody Inventario i) { return ResponseEntity.ok(service.guardar(i)); }
}
