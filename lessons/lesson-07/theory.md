# Lección 7 — Encapsulación y Proyecto Final: Registro de Estudiante

**Duración estimada**: 8 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### ¿Qué es la encapsulación?

La encapsulación protege los datos de una clase. Los atributos se declaran como `private` (solo accesibles desde dentro de la clase) y se accede a ellos mediante métodos `public` llamados **getters** y **setters**.

```java
public class Estudiante {
    // Atributos privados (protegidos)
    private String nombre;
    private int edad;
    private double nota;

    // Constructor
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    // Getters (leer el valor)
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNota() { return nota; }

    // Setters (modificar el valor con validación)
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 20.");
        }
    }

    // Método de comportamiento
    public void mostrarInfo() {
        String estado = nota >= 11 ? "Aprobado" : "Desaprobado";
        System.out.println("Nombre: " + nombre + " | Edad: " + edad +
                           " | Nota: " + nota + " | Estado: " + estado);
    }
}
```

### ¿Por qué usar private?

Si el atributo fuera `public`, cualquiera podría poner una nota de 999.  
Con `private` + setter, puedes validar antes de aceptar el valor.

### Proyecto final — Registro de Estudiante

```java
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes quieres registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Estudiante[] estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Nota (0-20): ");
            double nota = sc.nextDouble();
            sc.nextLine();

            estudiantes[i] = new Estudiante(nombre, edad, nota);
        }

        System.out.println("\n===== REPORTE FINAL =====");
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
        }

        sc.close();
    }
}
```

---

## Ejercicio práctico

> Ejecuta el proyecto final y registra a tus compañeros de clase.

**Enlace Replit / JDoodle**:  
`<!-- INSERTAR ENLACE AQUÍ -->`

**Consigna**: Corre el programa, registra 3 estudiantes ficticios con diferentes notas y verifica que el estado (Aprobado / Desaprobado) se muestre correctamente. Intenta también modificar la nota de un estudiante usando el setter.
