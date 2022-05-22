# Lenguajes de programacion - Desarrollo de la ficha teorica
Este documento de formato Markdown contiene las respuestas de la ficha pertiente a un cuestionario para conocer el lenguaje asignado para esta actividad, siendo este **Kotlin**.

## Tabla de contenido
1. [Propósito](#1-propósito)
2. [Paradigma](#2-paradigma)
3. [Fortalezas y debilidades](#3-fortalezas-y-debilidades)
4. [Implementación](#4-implementación)
5. [Runtime / Maquina Virtual](#5-runtime--maquina-virtual)
6. [Plataformas soportadas](#6-plataformas-soportadas)
7. [Usuarios notables](#7-usuarios-notables)
8. [Historia](#8-historia)
9. [Estado](#9-estado)

## 1. Propósito
El propósito de Kotlin es general, permitiendo a los desarrolladores de Kotlin desarrollar aplicaciones en múltiples dominios (Powell, Z., 2021).
 
Referencia utilizada: https://www.makeuseof.com/what-is-kotlin/.
 
## 2. Paradigma
Kotlin es un lenguaje de programación multi-paradigma; es decir, es un lenguaje que puede ser orientado a objetos, funcional, imperativo, estructurado por bloques, declarativo, generico, reflectivo y concurrente ("Kotlin (programming language)", 2022).
 
Referencia utilizada: https://en.wikipedia.org/wiki/Kotlin_(programming_language).
 
## 3. Fortalezas y debilidades
Kotlin tiene las siguientes fortalezas y debilidades ("Will Kotlin Replace Java? (with Pros and Cons)", 2022):
 
| **Fortalezas** | **Debilidades** |
| -------------- | --------------- |
| 1. Tiene una sintaxis concisa y fácil de leer. | 1. Es un lenguaje de programación relativamente nuevo con una documentación escasa comparado con otros lenguajes  |
| 2. Tiene capacidad para interoperar con Java, ya que pueden coexistir mediante la JVM. | 2. Comunidad de pequeños desarrolladores con recursos de aprendizaje limitados. |
| 3. Combina las mejores características de los paradigmas de programación procedimental y funcional. | 3. Evita el problema de la nulibilidad, evitando bloques de prueba de evaluación de variables nulas. |
| 4. Posee seguridad con los tipos de datos de variables, evitando problemas a lo largo de la ejecución del programa. | 4. Tiene una velocidad de compilación inestable, llegando a ser más lento que la compilacion de Java |
| 5. Cambiar de Java a Kotlin es fácil. | 5. Puede tener una curva de aprendizaje considerable. |
| 6. Como el creador es una empresa de gran tamaño, Kotlin cuenta con mantenibilidad, soporte y confiabilidad. | |
 
Referencia utilizada: https://howtocreateapps.com/kotlin-replace-java. 
 
## 4. Implementación
Kotlin es un lenguaje con una implementación híbrida: puede ser interpretado, compilado o transpilado. Este puede compilarse de tres formas ("How is Kotlin specifically compiled?", 2018):
 
* Kotlin/JVM: Cuando se dirige a la JVM (Java Virtual Machine), Kotlin se compila en archivos JVM *.class, que es un formato de código de bytes que luego puede ser interpretado por una JVM o compilado en el código máquina por la JVM durante la ejecución del programa (JIT), o incluso compilado antes de tiempo (AOT) hasta el código máquina. También, puede compilarse a archivos *.jar, que es otro archivo de bytes interpretado por la JVM.
 
* Kotlin/JS: Cuando se dirige a JavaScript, se traduce el código a su equivalente en dicho lenguaje de programación. En este caso, el código es transpirado, enfatizando que el formato de destino es el código fuente de JavaScript en lugar de binario, mientras que el compilador aún realiza muchas transformaciones y optimizaciones.
 
* Kotlin/Native: Cuando se dirige a nativo, quiere decir que se compila a lenguaje de máquina, sin pasar por el JVM o por una traducción hacia JS. Hay dos posibles formas de destino para Kotlin/Native:
   * Una libreria en *.klib que se puede reutilizar en otro proyecto Kotlin/Native. Este es un archivo ZIP que contiene código de bits LLVM junto con algunos metadatos específicos de Kotlin.
   * Un binario específico de la plataforma, en uno de los numerosos formatos, incluidas las bibliotecas estáticas y dinámicas y los archivos ejecutables. Este es, de hecho, el código máquina para una plataforma de destino específica, que se puede usar para vincular en caso de que sea una biblioteca, o ejecutarse directamente si es un ejecutable. En este caso, el compilador Kotlin invoca al enlazador LLVM lld para vincular un binario desde el código de bits LLVM.
 
Referencia utilizada: https://stackoverflow.com/questions/53472710/how-is-kotlin-specifically-compiled.
 
## 5. Runtime / Maquina Virtual
Dependiendo del destino (target) de compilación, Kotlin tiene los siguientes runtimes o máquinas virtuales:
 
* Si se compila nativamente, utiliza la LLVM (Low-Level Virtual Machine), una máquina virtual de bajo nivel. Puede soportar múltiples sistemas operativos, como Windows, Linux y MacOS en 32-bits y 64-bits ("Kotlin Native", 2022).
 
* Si se compila a archivos de Java, como *.class o *.jar, utiliza la JVM (Java Virtual Machine), una máquina virtual para ejecutar programas de Java ("Get started with Kotlin/JVM", 2022). La JVM soporta Windows, Linux, Solaris, y Mac OS en múltiples plataformas como x86_64 y ARM, tanto de 32-bits como de 64-bits (Tyson, 2020).
 
* Si se transpira a JavaScript, el runtime es NodeJS, siendo este un entorno de tiempo de ejecución de JavaScript ágil, rápido y multiplataforma que es útil tanto para servidores como para aplicaciones de escritorio, y soporta Windows, Linux y Mac OS en múltiples plataformas como x86_64 y ARM, tanto de 32-bits como de 64-bits (Heller, 2020).
 
Referencias utilizadas:
1. https://kotlinlang.org/docs/native-overview.html.
2.  https://kotlinlang.org/docs/jvm-get-started.html.
3. https://www.infoworld.com/article/3272244/what-is-the-jvm-introducing-the-java-virtual-machine.html
4. https://www.infoworld.com/article/3210589/what-is-nodejs-javascript-runtime-explained.html
 
## 6. Plataformas soportadas
Kotlin a nivel general soporta las siguientes plataformas / sistemas operativos ("Multiplatform Gradle DSL reference", 2022):
 
* Microsoft Windows: Mediante MinGW, ya sea de 32-bits o 64-bits.
 
* Android: A plataformas de escritorio (x86_64) y a plataformas ARM de 32-bits o 64-bits.
 
* Apple iOS: A plataformas ARM de 32-bits y 64-bits, a su simulador de escritorio x86_64, y su nueva plataforma ARM "Apple Sillicon".
 
* Apple watchOS: A procesadores ARM de 32-bits o 64-bits, a su simulador de escritorio x86_64, y a su nueva plataforma ARM "Apple Sillicon".
 
* Apple tvOS: A plataformas ARM de 32-bits o 64-bits, a su simulador de escritorio x86_64, y a su nueva plataforma ARM "Apple Sillicon".
 
* Apple macOS: A plataformas de escritorio (x86_64), y a su nueva plataforma ARM "Apple Sillicon".
 
* GNU/Linux: A plataformas de escritorio (x86_64), a plataformas MIPS (32-bits) y a plataformas ARM de 32-bits y 64-bits.
 
Referencia utilizada: https://kotlinlang.org/docs/multiplatform-dsl-reference.html#targets.
 
## 7. Usuarios notables
Kotlin es utilizado por compañías notables de alto rango, tales como Google, Twitter, Reddit, Netflix, Uber, BMW, Coursera, Slack, y Trello ("Why Teach Kotlin", s.f.). Inclusive, muchas aplicaciones populares, algunas desarrolladas por las mismas empresas anteriores, han sido desarrolladas utilizando Kotlin, como las siguientes (Singh, 2021):
 
* Coursera es una plataforma de aprendizaje electrónico. Su aplicación móvil ha sido desarrollada primordialmente utilizando Kotlin.
 
* Evernote es una aplicación para tomar notas. Su aplicación móvil, específicamente su versión en Android, utiliza Kotlin como lenguaje principal.
 
* Zomato, popular aplicación de entrega de alimentos, utiliza el lenguaje de programación Kotlin para escribir código más conciso y seguro.
 
* Netflix es un popular servicio bajo suscripción para streamear series y películas. La compañía ha renovado el reproductor de interfaz de usuario actual en la aplicación Android de Netflix utilizando 100% Kotlin.
 
* Pinterest es una aplicación popular para compartir imágenes. La compañía del mismo nombre se mudó oficialmente de Java a Kotlin en 2016, así como mostró las ventajas de esta iniciativa en Droidcon NYC 2016.
 
* Square, plataforma de pago en línea, adoptó Kotlin para reforzar la experiencia del desarrollador de las bibliotecas de código abierto de Square.
 
* Uber es una de las famosas aplicaciones de viajes compartidos bajo demanda creadas con Kotlin.
 
* Swiggy, otra popular aplicación de pedidos y entrega de alimentos a pedido, también se basa en Kotlin.
 
* Trello es una herramienta de colaboración popular utilizada por millones de usuarios en todo el mundo para administrar proyectos y organizar tareas de manera eficiente. El equipo de Trello migró las funciones principales de la aplicación a Kotlin.
 
* Corda, una plataforma Blockchain de código abierto que permite a los desarrolladores de aplicaciones Blockchain construir redes blockchain interoperables, también ha sido desarrollado completamente usando Kotlin.
 
* Basecamp 3 es una de las famosas herramientas de gestión de proyectos y comunicación en equipo con millones de usuarios. La versión Android de Basecamp 3 de su aplicación está escrita en 100% Kotlin.
 
* Duolingo, una popular aplicación de aprendizaje de idiomas, para Android es una de las aplicaciones creadas con Kotlin.
 
* Kickstarter ayuda a creadores como artistas, cineastas, músicos y más a obtener el apoyo que necesitan para convertir sus visiones en realidad. La aplicación también se basa en Kotlin.
 
* Airbnb aprovechó el lenguaje de programación Kotlin en un nuevo marco de productos Android (MvRx) para lograr una experiencia perfecta.
 
* Postmates es otra aplicación de entrega de alimentos a pedido migrada a Kotlin para su aplicación de Android.
 
Referencias utilizadas:
1. https://infostride.com/apps-built-with-kotlin/;
2. https://kotlinlang.org/education/why-teach-kotlin.html
 
## 8. Historia
Los siguientes puntos seran tratados con respecto a varios puntos sobre la historia de Kotlin ("Kotlin (programming language)", 2022; Polyakov, 2022):
 
* Creadores: JetBrains, con el desarrollo liderado por Dmitry Jemerov.
* 1er Release (versión y fecha):
   * La primera versión de Kotlin, denominado "Project Kotlin", lanzada el 22 de julio de 2011.
   * La primera versión estable de Kotlin fue la versión 1.0, lanzada el 15 de febrero del 2016.
* Último release (versión y fecha): A la fecha de realizado este documento, la última versión de Kotlin es la versión 1.6.20, lanzada el 3 de abril del 2022.
 
Referencias utilizadas:
1. https://en.wikipedia.org/wiki/Kotlin_(programming_language).
2. https://blog.jetbrains.com/kotlin/2022/04/kotlin-1-6-20-released/
 
## 9. Estado
Kotlin es un lenguaje activo y mantenido por Jetbrains, utilizado principalmente para el desarrollo de aplicaciones móviles en Android (Waweru, 2022).
 
Referencia utilizada: https://careerkarma.com/blog/is-kotlin-worth-learning/.
