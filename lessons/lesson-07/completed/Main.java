import java.util.Scanner;
class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre; this.edad = edad; this.nota = nota;
    }
    public String getNombre() { return nombre; }
    public int getEdad()      { return edad; }
    public double getNota()   { return nota; }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 20) this.nota = nota;
        else System.out.println("Nota invalida.");
    }
    public void mostrarInfo() {
        String estado = nota >= 11 ? "Aprobado" : "Desaprobado";
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Nota: " + nota + " | " + estado);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos estudiantes? ");
        int cantidad = sc.nextInt(); sc.nextLine();
        Estudiante[] lista = new Estudiante[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("--- Estudiante " + (i+1) + " ---");
            System.out.print("Nombre: "); String nombre = sc.nextLine();
            System.out.print("Edad: "); int edad = sc.nextInt();
            System.out.print("Nota (0-20): "); double nota = sc.nextDouble(); sc.nextLine();
            lista[i] = new Estudiante(nombre, edad, nota);
        }
        System.out.println("===== REPORTE =====");
        for (Estudiante e : lista) e.mostrarInfo();
        sc.close();
    }
}
