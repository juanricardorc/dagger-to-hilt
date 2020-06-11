Dagger to Hilt
================================

## ¿Qué es Inyección de dependencias?
La inyección de dependencias (DI) es una técnica muy utilizada en programación y adecuada para el desarrollo de Android. Si sigues los principios de la DI, sentarás las bases para una buena arquitectura de apps.

Implementar la inyección de dependencias te proporciona las siguientes ventajas:

- Reutilización de código
- Facilidad de refactorización
- Facilidad de prueba


## ¿Qué es Dagger?
Pues dagger genera automáticamente un código que imita el código que de otro modo habría escrito a mano. Debido a que el código se genera en tiempo de compilación, es rastreable y tiene un mejor rendimiento que otras soluciones basadas en la reflexión.

Dagger te libera de escribir código repetitivo tedioso y propenso a errores al:

- Generando el AppContainercódigo (gráfico de la aplicación) que implementó manualmente en la sección DI manual.

- Creación de fábricas para las clases disponibles en el gráfico de la aplicación. Así es como se satisfacen las dependencias internamente.

- Reutilizar una dependencia o crear nuevas instancias de un tipo dependiendo de cómo se configura el tipo mediante ámbitos .

- Crear contenedores para flujos específicos como lo hizo con el flujo de inicio de sesión en la sección anterior utilizando subcomponentes Dagger . Esto mejora el rendimiento de su aplicación al liberar objetos en la memoria cuando ya no son necesarios.

## ¿Qué es Hilt?
Para demostrar cómo funciona los patrones de diseño, he creado una applicación modular, eso quiere decir que en cada modulo se describe como funciona cada patron de diseño. 

### Patrones Creacionales
- Factory Method, Builder, Abstract Factory, Prototype, Singleton.
### Patrones Estructurales
