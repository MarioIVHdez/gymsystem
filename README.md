# GymSystem - Sistema de Gestión de Gimnasio

Proyecto orientado a objetos desarrollado en Java para la administración operativa, control de accesos y gestión financiera de un gimnasio.

## Estructura del Proyecto
- `src/`: Código fuente en Java organizado en paquetes (`com.gymsystem.model` y `com.gymsystem.main`).
- `diagramas/`: Contiene los diseños y diagramas de arquitectura del sistema.

## Diagramas de Arquitectura y Diseño

### 1. Arquitectura Hexagonal y Componentes
Detalla la separación de responsabilidades entre el núcleo del dominio, los puertos de entrada/salida y los adaptadores:
![Diagrama Hexagonal](diagramas/Diagrama%201.png)

### 2. Topología de Despliegue Físico-Lógica
Muestra la distribución de artefactos, servidores de aplicaciones, base de datos y la integración con hardware de acceso:
![Diagrama de Despliegue](diagramas/Diagrama%202.png)

### 3. Diagrama UML de Clases (Modelo de Dominio)
Representa el modelado de clases del dominio (`Rol`, `Usuario`, `Socio`, `Membresia`, `Transaccion`), sus atributos encapsulados, métodos y sus relaciones de cardinalidad:
![Diagrama UML de Clases](diagramas/Diagrama%203.png)

## Ejecución del Proyecto
1. Abrir el proyecto en **Eclipse IDE** (configurado para compilar en **Java 1.8**).
2. Ejecutar la clase principal `com.gymsystem.main.Main.java` como **Java Application**.