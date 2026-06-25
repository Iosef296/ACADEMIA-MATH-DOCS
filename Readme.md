# ACADEMIA VIRTUAL DE MATEMATICAS
Documentacion del Sistema de gestion educativa para academia universitaria de matematicas.

## Descripcion
Plataforma integral para la ensenanza y aprendizaje de matematicas a nivel universitario, con soporte de IA, ejercicios parametrizados, gamificacion y clases en vivo.

---

## Tecnologias
- Java / Spring Boot
- Maven
- PlantUML
- Arquitectura de Microservicios
- Docker
- PostgreSQL
- Redis

---

## Modelado
- Modelo C4
- UML
- Casos de uso
- Diagramas de secuencia
- Diagramas de actividad

---

## Estructura del Proyecto
2-MODELO_UML/
└── Especificaciones/
├── HU-ADM-administracion.puml
├── HU-AUD-auditoria.puml
├── HU-AUT-autenticacion.puml
├── HU-BAN-banco-preguntas.puml
├── HU-CFG-configuracion.puml
├── HU-CLV-clases-vivo.puml
├── HU-CON-contenido.puml
├── HU-EJP-ejercicios-parametrizados.puml
├── HU-EXA-examenes.puml
├── HU-GAM-gamificacion.puml
├── HU-IAR-ia-recomendaciones.puml
├── HU-INT-interaccion.puml
├── HU-NOT-notificaciones.puml
├── HU-OCR-pdf-digitalizacion.puml
├── HU-PAG-pagos-suscripciones.puml
├── HU-PRO-progreso-rutinas.puml
├── HU-RPT-reportes-analytics.puml
└── HU-USR-gestion-usuarios.puml
plain

---

## Modulos del Sistema

| Modulo | Descripcion | Actores |
|--------|-------------|---------|
| **ADM** | Administracion y dashboard | Administrador |
| **AUD** | Auditoria y logs de seguridad | Administrador |
| **AUT** | Autenticacion y autorizacion | Todos |
| **BAN** | Banco de preguntas para examenes | Profesor, Admin |
| **CFG** | Configuracion del sistema | Administrador |
| **CLV** | Clases en vivo y virtuales | Profesor, Estudiante |
| **CON** | Contenido: temas y ejercicios | Profesor, Estudiante |
| **EJP** | Ejercicios parametrizados con IA | Profesor, Estudiante |
| **EXA** | Examenes y evaluaciones | Profesor, Estudiante, Admin |
| **GAM** | Gamificacion y recompensas | Estudiante |
| **IAR** | IA y recomendaciones adaptativas | Estudiante, Profesor |
| **INT** | Foro e interaccion social | Estudiante, Profesor |
| **NOT** | Notificaciones y alertas | Todos |
| **OCR** | PDF y digitalizacion OCR | Profesor |
| **PAG** | Pagos y suscripciones | Estudiante, Admin |
| **PRO** | Progreso y rutinas de estudio | Estudiante |
| **RPT** | Reportes y analytics | Profesor, Admin |
| **USR** | Gestion de usuarios y perfiles | Todos |

---

## Casos de Uso Principales

### 1. Modulo de Autenticacion
![Autenticacion](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 2. Modulo de Gestion de Usuarios
![Gestion de Usuarios](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 3. Modulo de Contenido (Temas y Ejercicios)
![Contenido](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 4. Modulo de Ejercicios Parametrizados
![Ejercicios Parametrizados](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 5. Modulo de Examenes
![Examenes](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 6. Modulo de IA y Recomendaciones
![IA y Recomendaciones](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 7. Modulo de Gamificacion
![Gamificacion](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 8. Modulo de Progreso y Rutinas
![Progreso y Rutinas](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 9. Modulo de Reportes y Analytics
![Reportes](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 10. Modulo de Clases en Vivo
![Clases en Vivo](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 11. Modulo de Foro e Interaccion
![Foro](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 12. Modulo de Notificaciones
![Notificaciones](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 13. Modulo de Pagos y Suscripciones
![Pagos](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 14. Modulo de PDF y OCR
![PDF y OCR](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 15. Modulo de Banco de Preguntas
![Banco de Preguntas](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 16. Modulo de Administracion
![Administracion](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 17. Modulo de Auditoria
![Auditoria](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

### 18. Modulo de Configuracion del Sistema
![Configuracion](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

---

## Diagrama de Casos de Uso General del Sistema

![Diagrama General](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

---

## Diagrama de Clases

![Diagrama de Clases](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMmKiX8pSd9vt98pKi1IW80)

---