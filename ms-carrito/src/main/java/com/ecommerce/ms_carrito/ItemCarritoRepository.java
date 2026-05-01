package com.ecommerce.ms_carrito;
import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface ItemCarritoRepository extends JpaRepository<ItemCarrito, Long> {
    List<ItemCarrito> findByUsuarioId(Long usuarioId);
    void deleteByUsuarioId(Long usuarioId);
}
