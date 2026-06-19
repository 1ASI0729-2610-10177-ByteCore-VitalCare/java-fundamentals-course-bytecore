# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo conceptos básicos de programación orientada a objetos. **¡No requiere descargas ni instalaciones!** Solo abre tu navegador web.

**Duración total**: ~60 minutos  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)  
**Repositorio de código fuente**: [https://github.com/upc-pre-202610-1asi0729-10177-bytecore/java-fundamentals-course-bytecore](https://github.com/upc-pre-202610-1asi0729-10177-bytecore/java-fundamentals-course-bytecore)

---

## Secuencia de Lecciones

### Lección 1: ¿Qué es Java y para qué sirve? (5 minutos)

- **Descripción**: Descubre qué es la programación, por qué Java es uno de los lenguajes más usados en el mundo y qué podrás crear al terminar este curso.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L1)
- **Conclusiones clave**:
  - Java es un lenguaje de programación usado en aplicaciones móviles, videojuegos y sistemas bancarios.
  - Un programa es una lista de instrucciones que la computadora sigue paso a paso.
  - Todo programa Java parte de un método `main`.
- **Práctica**: [Abrir editor online — Hola Mundo](https://www.jdoodle.com/ia/1Ud5) *(no requiere registro)*

---

### Lección 2: Variables y tipos de datos (8 minutos)

- **Descripción**: Aprende a guardar información en tu programa usando variables. Conoce los tipos de datos más comunes en Java.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L2)
- **Conclusiones clave**:
  - Una variable es un espacio en memoria con un nombre y un valor.
  - Tipos principales: `int` (números enteros), `double` (decimales), `String` (texto), `boolean` (verdadero/falso).
  - Declaración: `int edad = 15;` / `String nombre = "Ana";`
- **Práctica**: [Abrir editor online — Variables](https://www.jdoodle.com/ia/1Ud6) *(no requiere registro)*

---

### Lección 3: Operadores y expresiones (7 minutos)

- **Descripción**: Usa operadores aritméticos, de comparación y lógicos para crear expresiones que den vida a tus programas.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L3)
- **Conclusiones clave**:
  - Operadores aritméticos: `+`, `-`, `*`, `/`, `%`
  - Operadores de comparación: `==`, `!=`, `>`, `<`, `>=`, `<=`
  - Operadores lógicos: `&&` (y), `||` (o), `!` (no)
- **Práctica**: [Abrir editor online — Operadores](https://www.jdoodle.com/ia/1Ud7) *(no requiere registro)*

---

### Lección 4: Estructuras de control — Decisiones y bucles (10 minutos)

- **Descripción**: Haz que tu programa tome decisiones con `if-else` y repita tareas automáticamente con bucles `for` y `while`.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=xtjPtHL-Fnk)
- **Conclusiones clave**:
  - `if (edad >= 12) { ... } else { ... }` para tomar decisiones.
  - `for (int i = 0; i < 5; i++) { ... }` para repetir un número fijo de veces.
  - `while (condicion) { ... }` para repetir mientras se cumpla una condición.
- **Práctica**: [Abrir editor online — Estructuras de control](https://www.jdoodle.com/ia/1Ud8) *(no requiere registro)*

---

### Lección 5: Métodos y entrada/salida básica (10 minutos)

- **Descripción**: Organiza tu código creando métodos reutilizables y aprende a interactuar con el usuario mediante `Scanner`.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L5)
- **Conclusiones clave**:
  - Un método es un bloque de código con nombre que puedes llamar cuando necesites: `public static void saludar() { ... }`
  - `System.out.println(...)` muestra texto en pantalla.
  - `Scanner` lee lo que el usuario escribe: `Scanner sc = new Scanner(System.in);`
- **Práctica**: [Abrir editor online — Métodos y Scanner](https://www.jdoodle.com/ia/1Ud9) *(no requiere registro)*

---

### Lección 6: Introducción a la POO — Clases y Objetos (12 minutos)

- **Descripción**: Da el salto a la programación orientada a objetos. Crea tu primera clase con atributos y métodos, e instancia objetos a partir de ella.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L6)
- **Conclusiones clave**:
  - Una clase es el molde; un objeto es el producto creado a partir de ese molde.
  - Los atributos describen características: `String nombre;`, `int edad;`
  - Los métodos describen comportamientos: `void presentarse() { ... }`
  - Constructor: `public Estudiante(String nombre, int edad) { ... }`
- **Práctica**: [Abrir editor online — Clases y Objetos](https://www.jdoodle.com/ia/1Uda) *(no requiere registro)*

---

### Lección 7: Encapsulación y proyecto final — Registro de Estudiante (8 minutos)

- **Descripción**: Aplica encapsulación con getters y setters, y construye un programa completo de registro de estudiantes que integra todo lo aprendido.
- **Enlace**: [Ver lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-L7)
- **Conclusiones clave**:
  - Encapsulación: atributos `private` + métodos `public` getter/setter para proteger los datos.
  - `this.nombre = nombre;` para diferenciar el atributo del parámetro.
  - Proyecto final: clase `Estudiante` con nombre, edad y nota; registro de varios estudiantes con `Scanner`.
- **Proyecto final**: [Abrir editor online — Registro de Estudiante](https://www.jdoodle.com/ia/1Udb) *(guarda y comparte tu código)*

---

## Recursos Adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/1ASI0729-2610-10177-ByteCore-VitalCare/java-fundamentals-course-bytecore.git)

**Resumen de actividades prácticas**:

| Lección | Tema                           | Editor online                                               |
|---------|--------------------------------|-------------------------------------------------------------|
| 1       | Hola Mundo                     | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 2       | Variables y tipos de datos     | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 3       | Operadores y expresiones       | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 4       | Estructuras de control         | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 5       | Métodos y entrada/salida       | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 6       | Clases y objetos               | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |
| 7       | Encapsulación y proyecto final | [JDoodle](https://www.jdoodle.com/online-java-compiler/)    |

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202610  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 10177

**Nombre del equipo**: ByteCore  
**Líder del equipo**: Rioja Nuñez, Franco Diego  
**Integrantes del equipo**:
- Bardales Tejada, Luis Alexis
- Caisahuana Osores, Becker Junior
- Huaman Gallardo, Bruno Aldair
- Rocca Mariaca, Angel Mathias

**Fecha de entrega**: Semana 12 — Ciclo 202610
