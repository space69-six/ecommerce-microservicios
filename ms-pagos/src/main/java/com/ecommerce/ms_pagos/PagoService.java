package com.ecommerce.ms_pagos;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class PagoService {
    private final PagoRepository repo;
    public Pago procesar(Pago p) { p.setEstado("APROBADO"); return repo.save(p); }
    public List<Pago> listar() { return repo.findAll(); }
    public Pago buscarPorPedido(Long pedidoId) { return repo.findByPedidoId(pedidoId).orElseThrow(() -> new RuntimeException("Pago no encontrado")); }
}
