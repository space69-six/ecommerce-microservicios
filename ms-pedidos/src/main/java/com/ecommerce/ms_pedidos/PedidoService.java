package com.ecommerce.ms_pedidos;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repo;
    public List<Pedido> listar() { return repo.findAll(); }
    public Pedido crear(Pedido p) { return repo.save(p); }
    public Pedido buscar(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Pedido no encontrado")); }
    public List<Pedido> porUsuario(Long usuarioId) { return repo.findByUsuarioId(usuarioId); }
}
