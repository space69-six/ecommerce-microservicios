package com.ecommerce.ms_notificaciones;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.time.LocalDateTime;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Notificacion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank private String destinatario;
    @NotBlank private String asunto;
    @NotBlank private String mensaje;
    private String estado = "ENVIADO";
    private LocalDateTime fecha = LocalDateTime.now();
}
