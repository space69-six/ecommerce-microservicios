package com.ecommerce.ms_auth;
import lombok.*;
@Data @NoArgsConstructor @AllArgsConstructor
public class AuthResponse {
    private String token;
    private String email;
    private String rol;
}
