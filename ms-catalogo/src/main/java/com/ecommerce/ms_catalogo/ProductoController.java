package com.ecommerce.ms_catalogo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/catalogo") @RequiredArgsConstructor
public class ProductoController {
    private final ProductoService service;
    @GetMapping public List<Producto> listar() { return service.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Producto> buscar(@PathVariable Long id) { return ResponseEntity.ok(service.buscarPorId(id)); }
    @PostMapping public ResponseEntity<Producto> crear(@Valid @RequestBody Producto p) { return ResponseEntity.ok(service.guardar(p)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) { service.eliminar(id); return ResponseEntity.noContent().build(); }
    @GetMapping("/categoria/{cat}") public List<Producto> porCategoria(@PathVariable String cat) { return service.porCategoria(cat); }
}
