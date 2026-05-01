package com.ecommerce.ms_carrito;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class ItemCarrito {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotNull private Long usuarioId;
    @NotNull private Long productoId;
    @NotNull @Positive private Integer cantidad;
    @NotNull @Positive private Double precioUnitario;
}
