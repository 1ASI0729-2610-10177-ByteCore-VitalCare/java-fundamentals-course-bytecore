# Lección 6 — Introducción a la POO: Clases y Objetos

**Duración estimada**: 12 minutos  
**Público**: Estudiantes de 12 a 17 años sin experiencia previa

---

## Contenido teórico

### ¿Qué es la Programación Orientada a Objetos?

La POO organiza el código en torno a **objetos**, igual que el mundo real.

Ejemplo del mundo real:
- **Clase** `Perro` → es el molde (la idea de un perro)
- **Objeto** `miPerro` → es un perro concreto (Firulais, 3 años)

### Anatomía de una clase

```java
public class Estudiante {
    // Atributos (características)
    String nombre;
    int edad;
    double nota;

    // Constructor (crea el objeto con valores iniciales)
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    // Métodos (comportamientos)
    public void presentarse() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años.");
    }

    public void mostrarNota() {
        System.out.println(nombre + " tiene una nota de " + nota);
    }
}
```

### Crear objetos (instanciar)

```java
public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Estudiante
        Estudiante est1 = new Estudiante("Ana", 15, 16.5);
        Estudiante est2 = new Estudiante("Luis", 14, 13.0);

        est1.presentarse();
        est1.mostrarNota();

        est2.presentarse();
        est2.mostrarNota();
    }
}
```

### Conceptos clave

| Concepto | Significado |
|----------|-------------|
| **Clase** | Plantilla o molde |
| **Objeto** | Instancia concreta de una clase |
| **Atributo** | Variable que pertenece a la clase |
| **Método** | Función que pertenece a la clase |
| **Constructor** | Método especial para inicializar el objeto |
| **`this`** | Referencia al objeto actual |
| **`new`** | Palabra clave para crear un objeto |

---

## Ejercicio práctico

> Crea tu primera clase y genera objetos a partir de ella.

**Enlace Replit / JDoodle**:  
`<!-- INSERTAR ENLACE AQUÍ -->`

**Consigna**: Crea una clase `Mascota` con atributos `nombre`, `especie` y `edad`. Agrega un constructor y un método `describirse()`. Luego crea al menos dos mascotas en `main` y llámalas.
