package com.ecommerce.ms_usuarios;
import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import java.util.List;
@Service @RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repo;
    public List<Usuario> listar() { return repo.findAll(); }
    public Usuario guardar(Usuario u) { return repo.save(u); }
    public Usuario buscar(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado")); }
    public void eliminar(Long id) { repo.deleteById(id); }
}
