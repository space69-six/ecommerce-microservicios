package com.ecommerce.ms_pedidos;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.time.LocalDateTime;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Pedido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotNull private Long usuarioId;
    @NotNull @Positive private Double total;
    private String estado = "PENDIENTE";
    private LocalDateTime fecha = LocalDateTime.now();
}
