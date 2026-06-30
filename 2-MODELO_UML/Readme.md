# 📐 Academia Virtual de Matematicas - Documentacion UML 
 
Proyecto de documentacion UML completo para la plataforma educativa **Academia Virtual de Matematicas**. 
 
## Estructura del Proyecto 
 
- **Comportamiento/**: Diagramas de comportamiento del sistema 
  - `1-Casos_Uso/`: 18 Diagramas de Casos de Uso (CU01-CU18) 
  - `2-Secuencias/`: 18 Diagramas de Secuencia (DS01-DS18) 
  - `3-Estados/`: 18 Diagramas de Estado (DE01-DE18) 
  - `Especificaciones/`: 18 Especificaciones de Casos de Uso (ECU01-ECU18) 
- **Estructural/**: Diagramas estructurales del sistema 
  - Diagrama de clases principal 
 
## Modulos del Sistema (18 Casos de Uso) 
 
| ID | Modulo | Caso de Uso | Actor Principal | 
| CU-01 | ADM | Administrar Dashboard | Administrador | 
| CU-02 | AUD | Gestionar Auditoria y Logs | Administrador | 
| CU-03 | AUT | Autenticar Usuario | Estudiante, Profesor, Administrador | 
| CU-04 | BAN | Gestionar Banco de Preguntas | Profesor | 
| CU-05 | CFG | Configurar Sistema | Administrador | 
| CU-06 | CLV | Gestionar Clases en Vivo | Profesor, Estudiante | 
| CU-07 | CON | Gestionar Contenido Educativo | Profesor, Estudiante | 
| CU-08 | EJP | Gestionar Ejercicios Parametrizados | Profesor, Estudiante | 
| CU-09 | EXA | Gestionar Examenes | Profesor, Estudiante | 
| CU-10 | GAM | Gestionar Gamificacion | Estudiante | 
| CU-11 | IAR | Gestionar IA y Recomendaciones | Estudiante, Profesor | 
| CU-12 | INT | Gestionar Foro e Interaccion | Estudiante, Profesor | 
| CU-13 | NOT | Gestionar Notificaciones | Estudiante, Profesor, Administrador | 
| CU-14 | OCR | Gestionar PDF y OCR | Profesor | 
| CU-15 | PAG | Gestionar Pagos y Suscripciones | Estudiante, Administrador | 
| CU-16 | PRO | Gestionar Progreso y Rutinas | Estudiante | 
| CU-17 | RPT | Gestionar Reportes y Analytics | Profesor, Administrador | 
| CU-18 | USR | Gestionar Usuarios | Administrador, Estudiante, Profesor | 

## Readme_content = """# 📐 Academia Virtual de Matemáticas - Documentación UML

Proyecto de documentación UML completo para la plataforma educativa Academia Virtual de Matemáticas. Plataforma integral para la enseñanza y aprendizaje de matemáticas a nivel universitario, con soporte de IA, ejercicios parametrizados, gamificación y clases en vivo.

🏗️ Estructura del Proyecto
2-MODELO_UML/
├── Comportamiento/
│   ├── 1-Casos_Uso/                    ← 18 Diagramas de Casos de Uso (CU01-CU18)
│   │   ├── CU01-Administracion.puml
│   │   ├── CU02-Auditoria.puml
│   │   ├── CU03-Autenticacion.puml
│   │   ├── CU04-Banco-Preguntas.puml
│   │   ├── CU05-Configuracion.puml
│   │   ├── CU06-Clases-Vivo.puml
│   │   ├── CU07-Contenido.puml
│   │   ├── CU08-Ejercicios-Parametrizados.puml
│   │   ├── CU09-Examenes.puml
│   │   ├── CU10-Gamificacion.puml
│   │   ├── CU11-IA-Recomendaciones.puml
│   │   ├── CU12-Interaccion.puml
│   │   ├── CU13-Notificaciones.puml
│   │   ├── CU14-PDF-OCR.puml
│   │   ├── CU15-Pagos-Suscripciones.puml
│   │   ├── CU16-Progreso-Rutinas.puml
│   │   ├── CU17-Reportes-Analytics.puml
│   │   ├── CU18-Gestion-Usuarios.puml
│   │   │
│   │   └── Especificaciones/           ← 18 Especificaciones de Casos de Uso (ECU01-ECU18)
│   │       ├── ECU01-administracion-especificacion.puml
│   │       ├── ECU02-Auditoria-Especificacion.puml
│   │       ├── ECU03-Autenticacion-Especificacion.puml
│   │       ├── ECU04-Banco-Preguntas-Especificacion.puml
│   │       ├── ECU05-Configuracion-Especificacion.puml
│   │       ├── ECU06-Clases-Vivo-Especificacion.puml
│   │       ├── ECU07-Contenido-Especificacion.puml
│   │       ├── ECU08-Ejercicios-Parametrizados-Especificacion.puml
│   │       ├── ECU09-Examenes-Especificacion.puml
│   │       ├── ECU10-Gamificacion-Especificacion.puml
│   │       ├── ECU11-IA-Recomendaciones-Especificacion.puml
│   │       ├── ECU12-Interaccion-Especificacion.puml
│   │       ├── ECU13-Notificaciones-Especificacion.puml
│   │       ├── ECU14-PDF-OCR-Especificacion.puml
│   │       ├── ECU15-Pagos-Suscripciones-Especificacion.puml
│   │       ├── ECU16-Progreso-Rutinas-Especificacion.puml
│   │       ├── ECU17-Reportes-Analytics-Especificacion.puml
│   │       └── ECU18-Gestion-Usuarios-Especificacion.puml
│   │
│   ├── 2-Secuencias/                   ← 18 Diagramas de Secuencia (DS01-DS18)
│   │   ├── DS01-administrar-dashboard.puml
│   │   ├── DS02-auditoria-logs.puml
│   │   ├── DS03-autenticar-usuario.puml
│   │   ├── DS04-banco-preguntas.puml
│   │   ├── DS05-configurar-sistema.puml
│   │   ├── DS06-clases-vivo.puml
│   │   ├── DS07-contenido-educativo.puml
│   │   ├── DS08-ejercicios-parametrizados.puml
│   │   ├── DS09-examenes.puml
│   │   ├── DS10-gamificacion.puml
│   │   ├── DS11-ia-recomendaciones.puml
│   │   ├── DS12-foro-interaccion.puml
│   │   ├── DS13-notificaciones.puml
│   │   ├── DS14-pdf-ocr.puml
│   │   ├── DS15-pagos-suscripciones.puml
│   │   ├── DS16-progreso-rutinas.puml
│   │   ├── DS17-reportes-analytics.puml
│   │   └── DS18-gestion-usuarios.puml
│   │
│   └── 3-Estados/                      ← 18 Diagramas de Estado (DE01-DE18)
│       ├── DE01-Administracion.puml
│       ├── DE02-Auditoria.puml
│       ├── DE03-Autenticacion.puml
│       ├── DE04-Banco-Preguntas.puml
│       ├── DE05-Configuracion.puml
│       ├── DE06-Clases-Vivo.puml
│       ├── DE07-Contenido.puml
│       ├── DE08-Ejercicios-Parametrizados.puml
│       ├── DE09-Examenes.puml
│       ├── DE10-Gamificacion.puml
│       ├── DE11-IA-Recomendaciones.puml
│       ├── DE12-Interaccion.puml
│       ├── DE13-Notificaciones.puml
│       ├── DE14-PDF-OCR.puml
│       ├── DE15-Pagos-Suscripciones.puml
│       ├── DE16-Progreso-Rutinas.puml
│       ├── DE17-Reportes-Analytics.puml
│       └── DE18-Gestion-Usuarios.puml
│
├── Estructural/
│   └── diagrama-clases-Academia Virtual de Matematicas.puml
│
└── README.md
📋 Módulos del Sistema (18 Casos de Uso)
ID	Módulo	Caso de Uso	Actor Principal
CU-01	ADM	Gestionar Dashboard Administrativo	Administrador
CU-02	AUD	Gestionar Auditoría y Logs del Sistema	Administrador
CU-03	AUT	Autenticar y Gestionar Sesiones de Usuario	Estudiante, Profesor, Administrador
CU-04	BAN	Gestionar Banco de Preguntas Matemáticas	Profesor
CU-05	CFG	Configurar Parámetros Globales del Sistema	Administrador
CU-06	CLV	Gestionar Clases en Vivo y Grabaciones	Profesor, Estudiante
CU-07	CON	Gestionar Contenido Educativo y Temas	Profesor, Estudiante
CU-08	EJP	Gestionar Ejercicios Parametrizados Adaptativos	Profesor, Estudiante
CU-09	EXA	Gestionar Exámenes y Evaluaciones	Profesor, Estudiante
CU-10	GAM	Gestionar Sistema de Gamificación y Recompensas	Estudiante
CU-11	IAR	Gestionar Inteligencia Artificial y Recomendaciones	Estudiante, Profesor
CU-12	INT	Gestionar Foro e Interacción Comunitaria	Estudiante, Profesor
CU-13	NOT	Gestionar Sistema de Notificaciones Multicanal	Estudiante, Profesor, Administrador
CU-14	OCR	Gestionar Digitalización de PDF con OCR	Profesor
CU-15	PAG	Gestionar Pagos y Suscripciones	Estudiante, Administrador
CU-16	PRO	Gestionar Progreso Académico y Rutinas de Estudio	Estudiante
CU-17	RPT	Gestionar Reportes y Analytics Educativos	Profesor, Administrador
CU-18	USR	Gestionar Usuarios y Perfiles del Sistema	Administrador, Estudiante, Profesor
📊 Resumen de Entregables UML
Tipo	Cantidad	Ubicación	Descripción
Diagramas de Casos de Uso (CU)	18	Comportamiento/1-Casos_Uso/	Diagramas de casos de uso por módulo
Especificaciones de Casos de Uso (ECU)	18	Comportamiento/1-Casos_Uso/Especificaciones/	Especificaciones detalladas en formato estructurado
Diagramas de Secuencia (DS)	18	Comportamiento/2-Secuencias/	Flujo de interacción entre actores y sistema
Diagramas de Estado (DE)	18	Comportamiento/3-Estados/	Estados y transiciones de cada caso de uso
Diagrama de Clases	1	Estructural/	Modelo de dominio del sistema completo
Total	73		Archivos de documentación UML
🛠️ Tecnologías del Sistema
Stack Técnico
Tecnología	Uso
Java / Spring Boot	Backend principal del sistema
Maven	Gestión de dependencias y build
PlantUML	Generación de diagramas UML desde código
Arquitectura de Microservicios	Diseño escalable del sistema
Docker	Contenedores y despliegue
PostgreSQL	Base de datos relacional
Redis	Cache y sesiones en memoria
Herramientas de Modelado
Tecnología	Uso
PlantUML	Diagramas UML (casos de uso, secuencia, estado, clases)
Modelo C4	Arquitectura de software en 4 niveles
JSON	Especificaciones estructuradas de casos de uso
Git/GitHub	Control de versiones y colaboración en equipo
🚀 Cómo Visualizar los Diagramas
Opción 1: Extensión VS Code (Recomendado)
Instala la extensión "PlantUML" de Jebbs
Abre cualquier archivo .puml
Presiona Alt + D para ver el diagrama en tiempo real
Opción 2: Servidor PlantUML Online
Visita www.plantuml.com/plantuml
Pega el contenido del archivo .puml
Opción 3: PlantUML Local
java -jar plantuml.jar archivo.puml
👥 Equipo de Desarrollo
Miembro	Rama	Contribución
Emerson	emerson-avance	Diagramas CU, ECU, DS, DE, README
Joaquín	avance-joaquin	...
Cristofer	cristofer-avance	...
📜 Licencia
Proyecto académico - Universidad - 2026. Todos los derechos reservados.

Nota: Este repositorio contiene exclusivamente la documentación del modelo UML para el proyecto de la Academia Virtual de Matemáticas. Para el código fuente del sistema, consultar el repositorio principal del proyecto. """

Guardar el archivo
with open('/mnt/agents/output/README.md', 'w', encoding='utf-8') as f: f.write(readme_content)

print("README.md generado correctamente.") print(f"Tamaño: {len(readme_content)} caracteres")