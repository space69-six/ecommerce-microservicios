package com.ecommerce.ms_pedidos;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/pedidos") @RequiredArgsConstructor
public class PedidoController {
    private final PedidoService service;
    @GetMapping public List<Pedido> listar() { return service.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Pedido> buscar(@PathVariable Long id) { return ResponseEntity.ok(service.buscar(id)); }
    @PostMapping public ResponseEntity<Pedido> crear(@Valid @RequestBody Pedido p) { return ResponseEntity.ok(service.crear(p)); }
    @GetMapping("/usuario/{id}") public List<Pedido> porUsuario(@PathVariable Long id) { return service.porUsuario(id); }
}
