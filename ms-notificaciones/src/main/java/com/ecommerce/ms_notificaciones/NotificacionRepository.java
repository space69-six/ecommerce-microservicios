package com.ecommerce.ms_notificaciones;
import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    List<Notificacion> findByDestinatario(String destinatario);
}
