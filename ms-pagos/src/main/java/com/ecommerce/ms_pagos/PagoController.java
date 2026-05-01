package com.ecommerce.ms_pagos;
import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/pagos") @RequiredArgsConstructor
public class PagoController {
    private final PagoService service;
    @PostMapping public ResponseEntity<Pago> procesar(@Valid @RequestBody Pago p) { return ResponseEntity.ok(service.procesar(p)); }
    @GetMapping public List<Pago> listar() { return service.listar(); }
    @GetMapping("/pedido/{id}") public ResponseEntity<Pago> buscar(@PathVariable Long id) { return ResponseEntity.ok(service.buscarPorPedido(id)); }
}
