# ⚡ LuzBarata

LuzBarata es una aplicación web desarrollada con **Java y Spring Boot** cuyo objetivo es ayudar a los usuarios a ahorrar en la factura de la electricidad mostrando las horas más económicas del día y permitiendo recibir alertas por correo electrónico.

Este proyecto constituye mi **principal proyecto de portfolio** mientras finalizo el ciclo de Desarrollo de Aplicaciones Web (DAW). Su objetivo no es únicamente ofrecer una funcionalidad útil, sino servir como proyecto de aprendizaje para aplicar buenas prácticas de desarrollo backend con Java y Spring Boot.

---

# 🚀 Estado del proyecto

Actualmente la aplicación permite:

- ✅ Landing page desarrollada con Thymeleaf.
- ✅ Suscripción mediante correo electrónico.
- ✅ Persistencia de suscriptores en MySQL.
- ✅ Arquitectura en capas (Controller → Service → Repository).
- ✅ Validación mediante DTO y Jakarta Validation.
- ✅ Prevención de emails duplicados.
- ✅ Confirmación de suscripción.

El proyecto continúa en desarrollo y seguirá creciendo durante los próximos meses.

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

```
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

### Responsabilidades

- **Controller** → recibe las peticiones HTTP.
- **DTO** → valida los datos recibidos desde los formularios.
- **Service** → contiene la lógica de negocio.
- **Repository** → acceso a la base de datos mediante Spring Data JPA.
- **Entity** → representación de las tablas de la base de datos.

---

# 🗄️ Base de datos

Actualmente la aplicación utiliza **MySQL** para almacenar los suscriptores.

La conexión se configura desde:

```
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
git clone https://github.com/TU_USUARIO/luzbarata.git
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

```
http://localhost:8080
```

---

# 🧩 Próximas funcionalidades

Estas son algunas de las funcionalidades previstas:

- Consulta automática de precios desde la API oficial de ESIOS.
- Mostrar precio actual.
- Mostrar la hora más barata y la más cara del día.
- Envío diario de alertas por correo.
- Recordatorio antes de la hora más barata.
- Panel de administración.
- Estadísticas de suscriptores.
- Pruebas unitarias e integración.
- Spring Security.
- Despliegue en Azure.

---

# 🎯 Objetivos de aprendizaje

Con este proyecto estoy profundizando en:

- Arquitectura en capas.
- Spring Boot.
- Spring MVC.
- Persistencia con Spring Data JPA.
- Hibernate.
- Validación con Jakarta Validation.
- Buenas prácticas de desarrollo backend.
- Git y GitHub.
- Testing.
- Despliegue de aplicaciones Java.

---

# 👩‍💻 Autor

**Silvia Gutiérrez Cardona**

Proyecto desarrollado como parte de mi formación en **Desarrollo de Aplicaciones Web (DAW)** con el objetivo de construir un portfolio profesional orientado al desarrollo backend con Java.