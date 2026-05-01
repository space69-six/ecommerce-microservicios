package com.ecommerce.ms_notificaciones;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class NotificacionService {
    private final NotificacionRepository repo;
    public Notificacion enviar(Notificacion n) { return repo.save(n); }
    public List<Notificacion> listar() { return repo.findAll(); }
}
