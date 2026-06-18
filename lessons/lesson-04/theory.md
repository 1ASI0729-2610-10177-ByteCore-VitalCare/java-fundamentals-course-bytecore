# Lección 4 — Estructuras de control: Decisiones y bucles

**Duración estimada**: 10 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### Sentencia if-else

Permite que el programa tome decisiones:

```java
if (condicion) {
    // se ejecuta si la condición es verdadera
} else {
    // se ejecuta si la condición es falsa
}
```

**Ejemplo**:
```java
int nota = 14;
if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```

También puedes encadenar condiciones con `else if`:
```java
if (nota >= 18) {
    System.out.println("Excelente");
} else if (nota >= 14) {
    System.out.println("Bueno");
} else if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```

### Bucle for

Repite un bloque un número determinado de veces:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Vuelta número: " + i);
}
```

- `int i = 1` → valor inicial
- `i <= 5` → condición de continuación
- `i++` → incremento en cada vuelta

### Bucle while

Repite mientras una condición sea verdadera:

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### Ejemplo completo

```java
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
```

---

## Ejercicio práctico

> Crea un programa que evalúe notas y genere una tabla de multiplicar.

**Enlace Replit / JDoodle**:  
https://www.jdoodle.com/ia/1Ud8

**Consigna**: Usa `if-else` para clasificar una nota (Excelente / Bueno / Aprobado / Desaprobado) y un bucle `for` para imprimir la tabla de multiplicar del número 7.
