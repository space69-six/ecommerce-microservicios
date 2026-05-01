package com.ecommerce.ms_inventario;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Inventario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotNull private Long productoId;
    @NotNull @PositiveOrZero private Integer cantidad;
    private Integer cantidadMinima = 5;
}
