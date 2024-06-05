### Documentación del Ambiente de Desarrollo

**Requisitos del Sistema:**
- **Sistema Operativo:** Windows 11 (x64) con al menos 16 GB de RAM.
- **JDK:** Java Development Kit (JDK) 20.
- **IDE:** Apache NetBeans IDE 19.

**Requisitos Mínimos/Recomendados:**

- **Procesador:** Se recomienda un procesador de al menos 2 GHz.
- **Memoria RAM:** Se recomienda un mínimo de 8 GB de RAM para un rendimiento óptimo.
- **Espacio en Disco:** Se recomienda al menos 500 MB de espacio en disco para la instalación del JDK y Apache NetBeans.
- **Resolución de Pantalla:** Se recomienda una resolución de pantalla de al menos 1280x800 píxeles para una experiencia de usuario adecuada en Apache NetBeans.

**Configuración del Entorno:**
1. **Instalar JDK 20:**
   - Descarga e instala el JDK 20 desde [AdoptOpenJDK](https://adoptopenjdk.net/).
   - Configura la variable de entorno `JAVA_HOME` y añade el binario de Java al `PATH`.

2. **Instalar Apache NetBeans IDE 19:**
   - Descarga e instala Apache NetBeans IDE 19 desde [el sitio web oficial](https://netbeans.apache.org/download/nb120/nb120.html).

3. **Configurar el Proyecto en Apache NetBeans:**
   - Clona el repositorio del proyecto:
     ```sh
     git clone https://github.com/tu_usuario/transcripcion-braille.git
     ```
   - Abre el proyecto en Apache NetBeans.

### Documentación del Código Fuente (Manual para el Programador)

**Estructura del Proyecto:**
- `/src`: Código fuente del proyecto.
- `/docs`: Documentación del proyecto.
- `/diagrams`: Diagramas del diseño del sistema.
- `/images`: Ejemplos de imágenes generadas.
- `/build`: Archivos generados durante el proceso de construcción.

**Clases Principales:**
1. **Usuario.java:** Maneja la transcripción de texto y la generación de señalización Braille.
2. **TranscripcionEspBraille.java:** Transcribe texto en español a Braille.
3. **TranscripcionBrailleEsp.java:** Transcribe texto en Braille a español.
4. **GeneracionSenal.java:** Genera imágenes de señalización Braille a partir del texto en Braille.
5. **ImpresionEspejo.java:** Genera imágenes de texto Braille en modo espejo.
6. **Main.java:** Punto de entrada del programa, con interfaz gráfica para el usuario.

**Principales Métodos:**
- Métodos en las clases principales para transcripción de texto, generación de imágenes y manejo de la interfaz gráfica.

**Características Recomendadas Agregadas:**
- **Selección de Ubicación para Guardar Imágenes:** Implementada la opción para que el usuario elija la ubicación donde guardar las imágenes generadas.

### Base de Datos de Conocimiento

| ID  | Descripción                                    | Categoría          | Solución                                                                                       |
|-----|------------------------------------------------|--------------------|------------------------------------------------------------------------------------------------|
| 001 | Error al transcribir vocales acentuadas        | Defecto de Software | Se corrigió la lógica de transcripción para incluir las vocales acentuadas en la conversión.   |
| 002 | Interfaz gráfica se congela al guardar imágenes| Rendimiento         | Se optimizó el proceso de guardado de imágenes en un hilo separado para evitar congelamientos. |
| 003 | Texto en Braille no se muestra correctamente   | Defecto de Software | Se ajustaron las fuentes y los tamaños en el JTextArea para una correcta visualización.        |
| 004 | Imágenes se guardan en ubicación seleccionada por el usuario | Mejora de Funcionalidad | Se implementó la opción para que el usuario elija la ubicación donde guardar las imágenes.  |

### Manual de Instalación / Configuración

1. **Clonar el Repositorio:**
   ```sh
   git clone https://github.com/tu_usuario/transcripcion-braille.git
   ```

2. **Configurar el Proyecto en Apache NetBeans:**
   - Abre Apache NetBeans.
   - Importa el proyecto clonado.

3. **Compilar y Ejecutar el Proyecto:**
   - Compila y ejecuta el proyecto desde Apache NetBeans.

### Manual de Usuario

**Transcripción de Texto a Braille:**
1. Ingresa el texto en español en el campo de entrada.
2. Haz clic en "Transcribir a Braille".
3. Visualiza el texto transcrito en el área de salida.

**Guardar Señalización Braille:**
1. Haz clic en "Guardar Señalización Braille".
2. Selecciona el directorio donde guardar la imagen.

**Guardar Texto en Espejo:**
1. Haz clic en "Guardar Texto en Espejo".
2. Selecciona el directorio donde guardar la imagen.

**Limpiar Pantalla:**
1. Haz clic en "Limpiar Pantalla" para reiniciar los campos de entrada y salida.

**Salir:**
1. Haz clic en "Salir" para cerrar la aplicación.

### Notas de la Versión

**Versión 1.1:**
- Se añadió la opción para que el usuario seleccione la ubicación donde guardar las imágenes.
- Se implementaron clases adicionales para manejar la transcripción de texto y la generación de imágenes.

Esta documentación debería proporcionar una guía completa tanto para el desarrollo como para el uso del proyecto. Si tienes alguna pregunta adicional o necesitas más detalles, no dudes en preguntar.

### Trazabilidad de Artefactos

| Artefacto             | Versión | Cambios Realizados                                             |
|-----------------------|---------|----------------------------------------------------------------|
| Usuario.java          | 1.1     | Implementación de métodos para transcripción y generación de imágenes. |
| TranscripcionEspBraille.java | 1.1     | Corrección de lógica para incluir vocales acentuadas.        |
| Main.java             | 1.1     | Añadida la opción para que el usuario seleccione la ubicación de las imágenes. |