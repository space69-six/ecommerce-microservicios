package com.ecommerce.ms_catalogo;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;
    @NotNull @Positive(message = "El precio debe ser positivo")
    private Double precio;
    private String categoria;
}
