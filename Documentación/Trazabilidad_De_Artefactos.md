# Escuela Politécnica Nacional
# Construcción y Evolución del Software

### Integrantes:
- Juan Jima
- Mateo Pilco
- Juan Rengifo

# Documentación del Manual del Usuario

## Objetivo

Garantizar la calidad, consistencia y verificabilidad de los documentos transcritos, así como facilitar la identificación y corrección de posibles 
errores o discrepancias en cualquier punto del proceso.

### Detalle paso a paso.

# Trazabilidad del Proyecto

## VERSIÓN 1.0

| Versión | Característica                                        | Descripción                                                                                                                                                           |
|---------|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.0     | Transcripción de texto a Braille                      | Los usuarios pueden ingresar texto en español. El programa transcribe este texto al sistema Braille y muestra el resultado en pantalla.                                |
| 1.0     | Guardado de señalización Braille y texto en espejo    | Se proporciona la opción de guardar los resultados de la transcripción en formato de imagen. Los usuarios pueden guardar tanto la señalización Braille como el texto en espejo. |
| 1.0     | Función para limpiar la pantalla y salir              | Se incluye una función para limpiar la pantalla y salir de la aplicación de manera conveniente.                                                                       |

### Cambios Realizados en la VERSIÓN 1.0
- Se implementó la funcionalidad básica para la transcripción de texto a Braille.
- Se agregaron opciones para guardar los resultados de la transcripción en formato de imagen.
- Se añadió una función para limpiar la pantalla y salir de la aplicación.

### Tareas Futuras para la VERSIÓN 1.0
- Mejorar la interfaz de usuario para una experiencia más intuitiva.
- Añadir soporte para otros idiomas además del español.
- Optimizar el proceso de transcripción para manejar texto más largo de manera eficiente.

## VERSIÓN 1.1

| Versión | Característica                                        | Descripción                                                                                                                                                           |
|---------|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.1     | Selección de ubicación para guardar imágenes          | Se añadió la opción para que el usuario seleccione la ubicación donde guardar las imágenes, brindando mayor flexibilidad y control sobre dónde se almacenan los archivos generados por la aplicación. |
| 1.1     | Mejora de estructura de código                        | Se implementaron clases adicionales para manejar la transcripción de texto y la generación de imágenes, mejorando la estructura del código y la eficiencia del programa. |

### Cambios Realizados en la VERSIÓN 1.1
- Se añadió la opción para que el usuario seleccione la ubicación donde guardar las imágenes.
- Se implementaron clases adicionales para manejar la transcripción de texto y la generación de imágenes.

### Tareas Futuras para la VERSIÓN 1.1
- Refactorizar el código para mejorar la modularidad y la legibilidad.
- Investigar y corregir posibles errores reportados por los usuarios.

## VERSIÓN 1.2

| Versión | Característica                                        | Descripción                                                                                                                                                           |
|---------|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.2     | Soporte para transcribir más elementos a Braille      | Se implementó el soporte para transcribir números, abecedario, vocales acentuadas y signos básicos a Braille, ampliando la funcionalidad del programa y permitiendo la transcripción de una variedad más amplia de contenido. |
| 1.2     | Mejoras en la interfaz de usuario                    | Se trabajó en mejorar la interfaz de usuario para hacerla más intuitiva y fácil de usar, logrando optimizar la experiencia de transcripción.                           |

### Cambios Realizados en la VERSIÓN 1.2
- Se implementó el soporte para transcribir números, abecedario, vocales acentuadas y signos básicos a Braille.
- Se realizaron mejoras en la interfaz de usuario para hacerla más intuitiva y fácil de usar.

### Tareas Futuras para la VERSIÓN 1.2
- Investigar y corregir posibles problemas de rendimiento.
- Añadir opciones de configuración para personalizar la experiencia del usuario.

## VERSIÓN 1.3

| Versión | Característica                                        | Descripción                                                                                                                                                           |
|---------|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.3     | Reestructuración de la interfaz de usuario           | Se realizó una reestructuración significativa de la interfaz de usuario, dividiendo la GUI en frames para mejorar la organización y la usabilidad del programa. Esta actualización permitirá una mejor gestión de los elementos de la interfaz y una navegación más fluida para los usuarios. |
| 1.3     | Teclado en Braille                                   | Se agregó un teclado en Braille a la parte de Braille a Español, facilitando la entrada de texto en Braille y mejorando la accesibilidad para usuarios con discapacidad visual. Esta adición amplía la funcionalidad del programa y lo hace más inclusivo. |
| 1.3     | Mejoras en manejo de errores y excepciones           | Se realizaron mejoras en el manejo de errores y excepciones, garantizando una experiencia más robusta y confiable para los usuarios en diversas situaciones de uso.    |
| 1.3     | Correcciones y ajustes menores                       | Se corrigieron pequeños errores y se realizaron ajustes menores para optimizar el rendimiento y la estabilidad del programa en general.                                  |

### Cambios Realizados en la VERSIÓN 1.3
- Se realizó una reestructuración significativa de la interfaz de usuario.
- Se agregó un teclado en Braille para mejorar la accesibilidad.
- Se realizaron mejoras en el manejo de errores y excepciones.
- Se corrigieron pequeños errores y se realizaron ajustes menores.

### Tareas Futuras para la VERSIÓN 1.3
- Realizar pruebas exhaustivas para garantizar la estabilidad del programa.
- Recopilar comentarios de los usuarios para identificar áreas de mejora adicionales.

## Artefactos Asociados

### Package GUI
- BrailleEsp.java
- EspañolBraille.java
- MENU.java

### Package NEGOCIO
- Diccionario.java
- Main.java
- Transcriptor.java
