# Lección 3 — Operadores y expresiones

**Duración estimada**: 7 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### Operadores aritméticos

| Operador | Significado | Ejemplo | Resultado |
|----------|-------------|---------|-----------|
| `+` | Suma | `5 + 3` | `8` |
| `-` | Resta | `10 - 4` | `6` |
| `*` | Multiplicación | `3 * 4` | `12` |
| `/` | División | `10 / 2` | `5` |
| `%` | Módulo (resto) | `10 % 3` | `1` |

### Operadores de comparación

Devuelven `true` o `false`:

| Operador | Significado | Ejemplo |
|----------|-------------|---------|
| `==` | Igual a | `5 == 5` → `true` |
| `!=` | Distinto de | `5 != 3` → `true` |
| `>` | Mayor que | `7 > 3` → `true` |
| `<` | Menor que | `2 < 8` → `true` |
| `>=` | Mayor o igual | `5 >= 5` → `true` |
| `<=` | Menor o igual | `4 <= 6` → `true` |

### Operadores lógicos

| Operador | Significado | Ejemplo |
|----------|-------------|---------|
| `&&` | Y (ambos deben ser true) | `edad >= 12 && edad <= 17` |
| `\|\|` | O (al menos uno true) | `dia == 6 \|\| dia == 7` |
| `!` | No (invierte el valor) | `!aprobado` |

### Ejemplo completo

```java
public class Calculadora {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("¿a es mayor que b? " + (a > b));
    }
}
```

---

## Ejercicio práctico

> Construye una mini calculadora que opere con dos números.

**Enlace Replit / JDoodle**:  
https://www.jdoodle.com/ia/1Ud7

**Consigna**: Declara dos variables numéricas y muestra el resultado de todas las operaciones aritméticas. Agrega una comparación que indique cuál número es mayor.
