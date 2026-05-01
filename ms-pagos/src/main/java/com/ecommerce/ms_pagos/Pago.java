package com.ecommerce.ms_pagos;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.time.LocalDateTime;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Pago {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotNull private Long pedidoId;
    @NotNull @Positive private Double monto;
    private String estado = "PROCESANDO";
    private String metodoPago;
    private LocalDateTime fecha = LocalDateTime.now();
}
