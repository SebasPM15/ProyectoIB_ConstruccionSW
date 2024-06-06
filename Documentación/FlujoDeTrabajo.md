# Escuela Politécnica Nacional
# Construcción y Evolución del Software

### Integrantes:
- Juan Jima
- Mateo Pilco
- Juan Rengifo

# Documentación del Flujo de Trabajo

## Objetivo

Este documento describe el flujo de trabajo adoptado para el desarrollo del proyecto de transcripción Braille, asegurando una gestión eficiente y organizada del código fuente y de las actividades relacionadas.


## Ramas del Repositorio
- **main**: Rama principal que contiene la versión más estable del código.
- **development**: Rama para el desarrollo de nuevas funcionalidades.
- **feature**: Ramas específicas para cada nueva característica.
- **bugfix**: Ramas destinadas a la corrección de errores.

## Ciclo de Vida del Desarrollo

1. **Planificación**: Definición de tareas y asignación en el sistema de seguimiento de proyectos.

2. **Desarrollo**:
   - Clonar el repositorio usando:
     ```
     git clone https://github.com/SebasPM15/ProyectoIB_ConstruccionSW.git
     ```
    - Crear una rama **feature** o **bugfix** según sea necesario.

   - Desarrollar la funcionalidad o corrección en la rama creada.
3. **Revisión de Código**:
   - Solicitar una revisión de código mediante una Pull Request (PR) hacia la rama `development` (o hacia la rama que sea necesario).
   - Realizar pruebas y revisión por pares.
   - Corregir cualquier problema identificado.
4. **Integración**:
   - Una vez aprobada la PR, integrar los cambios en `development` (o hacia la rama que sea necesario).
   - Realizar pruebas integradas en la rama.
5. **Lanzamiento**:
   - Tras completar un ciclo de desarrollo y pruebas, fusionar las ramas necesarias con la rama `main`.
   - Etiquetar la versión en `main` con el nuevo número de versión.
   - Desplegar la versión desde `main`.

## Herramientas Utilizadas
- **Git**: Control de versiones.
- **Apache NetBeans**: IDE para desarrollo.

## Política de Commit
- Los mensajes de commit deben ser claros y seguir el formato: `[Tipo] Descripción breve de la acción realizada`.
  Ejemplo:
`[Feature] Añadida la capacidad de guardar imágenes en ubicación seleccionada.`

## Política de Revisiones
- Todas las PR deben ser revisadas antes de su fusión.
- Las PR para correcciones de errores deben incluir verificaciones manuales que validen el error y su corrección.

## Seguridad y Copias de Seguridad
- Regularmente se realizan copias de seguridad de todo el código y la documentación.
- Se adoptan prácticas de seguridad para proteger el código y los datos contra accesos no autorizados.

Este flujo de trabajo asegura que el proyecto se desarrolle de manera organizada y que cada cambio introducido sea estable y bien documentado.
