# Lección 5 — Métodos y entrada/salida básica

**Duración estimada**: 10 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### ¿Qué es un método?

Un método es un bloque de código con nombre que puedes reutilizar cuando quieras.  
Piénsalo como una función o una receta: la defines una vez y la usas muchas veces.

### Cómo crear un método

```java
public static void saludar() {
    System.out.println("¡Hola!");
}
```

Para llamarlo desde `main`:
```java
saludar();
```

### Métodos con parámetros

Los parámetros son datos que le pasas al método:

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
}

// Llamada:
saludar("Ana");
saludar("Luis");
```

### Métodos que devuelven un valor

```java
public static int sumar(int a, int b) {
    return a + b;
}

// Uso:
int resultado = sumar(5, 3);
System.out.println("Suma: " + resultado);
```

### Entrada del usuario con Scanner

```java
import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        sc.close();
    }
}
```

Métodos útiles de `Scanner`:
- `sc.nextLine()` → lee texto completo
- `sc.nextInt()` → lee un número entero
- `sc.nextDouble()` → lee un número decimal

---

## Ejercicio práctico

> Crea un programa interactivo que pida datos al usuario y calcule algo con ellos.

**Enlace Replit / JDoodle**:  
https://www.jdoodle.com/ia/1Ud9

**Consigna**: Pide al usuario su nombre y dos notas. Crea un método `calcularPromedio` que devuelva el promedio e indique si está aprobado (nota >= 11).
