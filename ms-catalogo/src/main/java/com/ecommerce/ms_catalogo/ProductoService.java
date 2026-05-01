package com.ecommerce.ms_catalogo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service @RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository repo;
    public List<Producto> listar() { return repo.findAll(); }
    public Producto guardar(Producto p) { return repo.save(p); }
    public Producto buscarPorId(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado")); }
    public void eliminar(Long id) { repo.deleteById(id); }
    public List<Producto> porCategoria(String cat) { return repo.findByCategoria(cat); }
}
