# Estructural - Diagramas de Clases 
 
Carpeta dedicada a los diagramas estructurales del sistema. 
Contiene el modelo de dominio completo de la Academia Virtual de Matemáticas. 
 
## Archivos 
 
| Archivo | Descripción | 
| :--- | :--- |
| diagrama-clases-Academia Virtual de Matemáticas.puml | Diagrama de clases principal del sistema. Modelo de dominio completo con entidades, relaciones, atributos y métodos. | 
 
## Propósito 
 
Los diagramas estructurales definen la arquitectura estática del sistema: 
* **Entidades del dominio:** Usuarios, Cursos, Ejercicios, Exámenes, Pagos, etc. 
* **Relaciones:** Asociaciones, herencias, agregaciones, composiciones. 
* **Atributos:** Propiedades de cada clase. 
* **Métodos:** Comportamientos y operaciones de cada entidad. 
 
## Relación con otros diagramas 
 
| Tipo | Ubicación | Descripción | 
| :--- | :--- | :--- |
| Casos de Uso | ../Comportamiento/1-Casos_Uso/ | Qué hace el sistema | 
| Secuencia | ../Comportamiento/2-Secuencias/ | Cómo interactúan los objetos | 
| Estado | ../Comportamiento/3-Estados/ | Estados de los objetos | 
| **Clases** | **./** | **Estructura del dominio** | 

![Diagrama de Clases](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/Johan/ACADEMIA-MATH-DOCS/main/3-PATRONES%20DE%20DISE%C3%91O/1-Patron%20Singleton/Singleton.puml)
 
> 💡 **Nota:** Este diagrama es la base sobre la cual se construyen los diagramas de secuencia y estado.