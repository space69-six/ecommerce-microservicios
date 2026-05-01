package com.ecommerce.ms_inventario;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class InventarioService {
    private final InventarioRepository repo;
    public List<Inventario> listar() { return repo.findAll(); }
    public Inventario guardar(Inventario i) { return repo.save(i); }
    public Inventario buscarPorProducto(Long productoId) { return repo.findByProductoId(productoId).orElseThrow(() -> new RuntimeException("Inventario no encontrado")); }
}
