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
Hilt es una biblioteca de inyección de dependencias para Android que reduce la dificultad de hacer una inyección de dependencia manual en su proyecto. Hacer una inyección manual de dependencias requiere que construyas cada clase y sus dependencias a mano, y que uses contenedores para reutilizar y administrar dependencias.

Hilt proporciona una forma estándar de usar DI en su aplicación al proporcionar contenedores para cada clase de Android en su proyecto y administrar sus ciclos de vida automáticamente. Hilt está construido sobre la popular Dagger de la biblioteca DI para beneficiarse de la corrección en tiempo de compilación, el rendimiento en tiempo de ejecución, la escalabilidad y el soporte de Android Studio que proporciona Dagger. Para obtener más información, vea Hilt y Dagger.
