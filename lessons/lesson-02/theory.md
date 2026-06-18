# Lección 2 — Variables y tipos de datos

**Duración estimada**: 8 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### ¿Qué es una variable?

Una variable es como una caja con nombre donde guardas información.

```
[ nombre: "Ana" ]   [ edad: 15 ]   [ promedio: 14.5 ]
```

### Tipos de datos principales en Java

| Tipo | ¿Para qué sirve? | Ejemplo |
|------|-----------------|---------|
| `int` | Números enteros | `int edad = 15;` |
| `double` | Números con decimales | `double nota = 14.5;` |
| `String` | Texto | `String nombre = "Ana";` |
| `boolean` | Verdadero o falso | `boolean aprobado = true;` |

### Cómo declarar una variable

```java
tipo nombreVariable = valor;
```

### Ejemplo completo

```java
public class MiPerfil {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 15;
        double nota = 14.5;
        boolean aprobado = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
        System.out.println("¿Aprobado? " + aprobado);
    }
}
```

### Concatenar texto con `+`

El operador `+` entre un `String` y otro valor los une:
```java
System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
```

---

## Ejercicio práctico

> Crea variables con tu propia información y muéstralas en pantalla.

**Enlace Replit / JDoodle**:  
https://www.jdoodle.com/ia/1Ud6

**Consigna**: Declara variables con tu nombre, edad, nota favorita y si te gusta la programación. Imprime una presentación personal.
