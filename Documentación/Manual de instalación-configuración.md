# Escuela Politécnica Nacional
# Construcción y Evolución del Software

### Integrantes:
- Juan Jima
- Mateo Pilco
- Juan Rengifo

# Manual de instalación / configuración

## Descripción General
Este manual proporciona instrucciones detalladas para la instalación y configuración del proyecto de transcripción Braille, asegurando que los usuarios y desarrolladores puedan configurar el entorno de desarrollo y ejecutar la aplicación de manera efectiva.

## Requisitos del Sistema
Antes de proceder con la instalación, asegúrate de que tu sistema cumple con los siguientes requisitos:
- **Sistema Operativo:** Windows 10-11 (x64) 
- **JDK:** Java Development Kit (JDK) 20-21.
- **IDE:** Apache NetBeans IDE 19-20.
- **Procesador:** Mínimo de 2 GHz recomendado.
- **Memoria RAM:** Mínimo de 8 GB de RAM para un rendimiento óptimo.
- **Espacio en Disco:** Al menos 10 MB disponibles para la instalación.

## Instalación del JDK 20
1. **Descarga del JDK:**
   - Accede a [Descargas de JDK](https://www.oracle.com/java/technologies/downloads/?er=221886#javasejdk) y descarga la versión 20 o 21 del JDK para Windows.
2. **Instalación:**
   - Ejecuta el archivo descargado y sigue las instrucciones para instalar el JDK en tu sistema.
3. **Configuración de Variables de Entorno:**
   - Añade la ruta del binario de Java al `PATH` del sistema.

## Instalación de Apache NetBeans IDE 19
1. **Descarga de NetBeans:**
   - Visita [el sitio web oficial de Apache NetBeans](https://netbeans.apache.org/front/main/download/) y descarga la versión 19 o 20 del IDE.
2. **Instalación:**
   - Ejecuta el instalador descargado y sigue las instrucciones en pantalla para instalar el IDE.

## Configuración del Proyecto
1. **Clonar el Repositorio:**
   - Abre una terminal y ejecuta el siguiente comando para clonar el repositorio del proyecto:
     ```
     git clone https://github.com/SebasPM15/ProyectoIB_ConstruccionSW.git
     ```
2. **Abrir el Proyecto en NetBeans:**
   - Inicia Apache NetBeans.
   - Selecciona `File` > `Open Project` y navega al directorio donde clonaste el repositorio.
   - Selecciona el proyecto y haz clic en `Open Project`.

## Compilar y Ejecutar el Proyecto
1. **Compilación:**
   - En NetBeans, haz clic derecho sobre el proyecto en el explorador de proyectos y selecciona `Build`.
2. **Ejecución:**
   - Una vez construido el proyecto, haz clic derecho sobre el proyecto y selecciona `Run` para iniciar la aplicación.

## Solución de Problemas
- **Problema de Compilación:** Asegúrate de que el JDK correcto esté configurado en las propiedades del proyecto en NetBeans.
- **Errores de Ejecución:** Verifica las configuraciones del `PATH` si se encuentra algun error relacionado con la ejecución de Java.

Este manual está diseñado para ayudar a configurar y comenzar a utilizar el proyecto de transcripción Braille de manera eficiente.
