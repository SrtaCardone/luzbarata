# ⚡ LuzBarata

> 🚧 **Estado:** Proyecto en desarrollo.
>
> LuzBarata está evolucionando progresivamente como mi principal proyecto de portfolio. Su objetivo es ayudar a los usuarios a ahorrar en la factura de la electricidad y, al mismo tiempo, servirme para profundizar en el desarrollo backend con Java y Spring Boot aplicando buenas prácticas de arquitectura y desarrollo.

---

## 📖 Descripción

LuzBarata es una aplicación web desarrollada con **Java y Spring Boot** cuyo objetivo es ayudar a los usuarios a conocer las horas más económicas del precio de la electricidad y recibir alertas para aprovecharlas.

Este proyecto nace a partir de una primera versión funcional desarrollada con **Google Apps Script**, que actualmente estoy reconstruyendo desde cero con una arquitectura profesional basada en Spring Boot como parte de mi formación en **Desarrollo de Aplicaciones Web (DAW)**.

Mi objetivo no es únicamente desarrollar una aplicación útil, sino construir un proyecto que refleje mi forma de trabajar y mi evolución como desarrolladora Java.

---

# 🚀 Estado actual

Actualmente la aplicación permite:

- ✅ Landing page desarrollada con Thymeleaf.
- ✅ Suscripción mediante correo electrónico.
- ✅ Persistencia de suscriptores en MySQL.
- ✅ Arquitectura en capas (Controller → Service → Repository).
- ✅ Validación mediante DTO y Jakarta Validation.
- ✅ Prevención de emails duplicados.
- ✅ Confirmación de suscripción.

---

# 🛠️ Tecnologías

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- MySQL
- Maven
- Git
- GitHub

---

# 📂 Arquitectura

Actualmente el proyecto sigue una arquitectura en capas:

```text
src
└── main
    ├── java
    │   └── com.luzbarata.luzbarata
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── repository
    │       └── service
    │
    └── resources
        ├── static
        ├── templates
        └── application.properties
```

## Responsabilidades

**Controller**

- Recibe las peticiones HTTP.
- Se comunica con la vista.
- Delega la lógica de negocio al servicio.

**DTO**

- Representa los datos recibidos desde los formularios.
- Aplica las validaciones mediante Jakarta Validation.

**Service**

- Contiene la lógica de negocio.
- Coordina el acceso a los datos.

**Repository**

- Acceso a la base de datos mediante Spring Data JPA.

**Entity**

- Representa el modelo persistente almacenado en MySQL.

---

# 🗄️ Base de datos

Actualmente la aplicación utiliza **MySQL** para almacenar los suscriptores.

La conexión se configura desde:

```text
src/main/resources/application.properties
```

Ejemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/luzbarata
spring.datasource.username=root
spring.datasource.password=*****
```

---

# ▶️ Ejecución

Clonar el repositorio:

```bash
git clone https://github.com/SrtaCardone/luzbarata.git
```

Entrar en el proyecto:

```bash
cd luzbarata
```

Ejecutar:

```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en:

```text
http://localhost:8080
```

---

# 🗺️ Roadmap

## Funcionalidades implementadas

- [x] Landing page
- [x] Persistencia con MySQL
- [x] Arquitectura Controller → Service → Repository
- [x] Validación mediante DTO
- [x] Validación de emails duplicados

## Próximas funcionalidades

- [ ] Integración con la API oficial de ESIOS.
- [ ] Mostrar el precio actual de la electricidad.
- [ ] Mostrar la hora más barata y la más cara del día.
- [ ] Envío diario de alertas por correo.
- [ ] Recordatorio antes de la hora más barata.
- [ ] Panel de administración.
- [ ] Estadísticas.
- [ ] Pruebas unitarias.
- [ ] Pruebas de integración.
- [ ] Spring Security.
- [ ] Despliegue en Azure.

---

# 🎯 Objetivos de aprendizaje

Con este proyecto estoy profundizando en:

- Arquitectura en capas.
- Desarrollo backend con Spring Boot.
- Spring MVC.
- Persistencia con Spring Data JPA e Hibernate.
- Validación con Jakarta Validation.
- Buenas prácticas de desarrollo.
- Testing.
- Git y GitHub.
- Despliegue de aplicaciones Java.

---

# 👩‍💻 Autor

**Silvia Gutiérrez Cardona**

Proyecto desarrollado como parte de mi formación en **Desarrollo de Aplicaciones Web (DAW)** con el objetivo de construir un portfolio profesional orientado al desarrollo backend con Java.