# LuzBarata

Aplicación web desarrollada con **Java, Spring Boot, Thymeleaf y MySQL** para ayudar a los usuarios a conocer el precio de la electricidad y recibir avisos sobre las horas más económicas del día.

## Características

- Consulta del precio diario de la electricidad.
- Suscripción mediante correo electrónico.
- Página de confirmación de suscripción.
- Persistencia de datos en MySQL.
- Interfaz web desarrollada con Thymeleaf.

## Tecnologías

- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## Estructura del proyecto

```
src
 ├── controller
 ├── templates
 ├── static
 └── resources
```

## Configuración

Es necesario configurar la conexión con MySQL en:

```
application.properties
```

Ejemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/luzbarata
spring.datasource.username=root
spring.datasource.password=******
```

## Estado del proyecto

🚧 Proyecto en desarrollo.

Próximas mejoras:

- Sistema de alertas por correo.
- Historial de precios.
- Gestión de usuarios.
- Despliegue en Azure.

## Autor

Silvia Gutiérrez Cardona