# E-commerce Microservicios - DSY1103

Sistema de comercio electrónico basado en arquitectura de microservicios con Spring Boot.

## Arquitectura

| Microservicio | Puerto | Descripcion |
|---|---|---|
| ms-eureka-server | 8761 | Registro y descubrimiento de servicios |
| ms-gateway | 8080 | Punto de entrada unico al sistema |
| ms-auth | 8081 | Autenticacion, registro y seguridad BCrypt |
| ms-usuarios | 8082 | Gestion de perfiles de usuario |
| ms-catalogo | 8083 | Productos y categorias |
| ms-inventario | 8084 | Stock y control de inventario |
| ms-carrito | 8085 | Carrito de compras |
| ms-pedidos | 8086 | Gestion de ordenes |
| ms-pagos | 8087 | Procesamiento de transacciones |
| ms-notificaciones | 8088 | Envio de notificaciones |

## Tecnologias

- Java 21
- Spring Boot 3.2
- Spring Cloud (Eureka, Gateway)
- Spring Security + BCrypt
- Spring Data JPA + H2
- Bean Validation (JSR 380)
- Maven

## Como ejecutar

1. Iniciar ms-eureka-server (puerto 8761)
2. Iniciar ms-gateway (puerto 8080)
3. Iniciar los demas microservicios en cualquier orden

## Endpoints principales

### Auth
- POST /api/auth/registro - Registrar usuario
- POST /api/auth/login - Iniciar sesion

### Catalogo
- GET /api/catalogo - Listar productos
- POST /api/catalogo - Crear producto
- GET /api/catalogo/{id} - Buscar producto
- GET /api/catalogo/categoria/{cat} - Filtrar por categoria

### Carrito
- GET /api/carrito/{usuarioId} - Ver carrito
- POST /api/carrito - Agregar item
- DELETE /api/carrito/{usuarioId} - Vaciar carrito

### Pedidos
- POST /api/pedidos - Crear pedido
- GET /api/pedidos/usuario/{id} - Pedidos por usuario

### Pagos
- POST /api/pagos - Procesar pago
- GET /api/pagos/pedido/{id} - Consultar pago

## Estructura del proyecto

Cada microservicio sigue la estructura CSR:
- Entity - Modelo de datos
- Repository - Acceso a datos con JPA
- Service - Logica de negocio
- Controller - Endpoints REST

## Autor

Martin Alejandro Vasquez Hurtado - DSY1103
