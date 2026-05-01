package com.ecommerce.ms_carrito;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class CarritoService {
    private final ItemCarritoRepository repo;
    public List<ItemCarrito> obtenerCarrito(Long usuarioId) { return repo.findByUsuarioId(usuarioId); }
    public ItemCarrito agregar(ItemCarrito item) { return repo.save(item); }
    public void vaciar(Long usuarioId) { repo.deleteByUsuarioId(usuarioId); }
}
