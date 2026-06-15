class Mascota {
    String nombre;
    String especie;
    int edad;
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre; this.especie = especie; this.edad = edad;
    }
    public void describirse() {
        System.out.println("Hola, soy " + nombre + ". Soy un/a " + especie + " de " + edad + " anio(s).");
    }
}
public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "perro", 3);
        Mascota m2 = new Mascota("Mishi", "gato", 5);
        Mascota m3 = new Mascota("Piolin", "pajaro", 1);
        System.out.println("=== Mis Mascotas ===");
        m1.describirse(); m2.describirse(); m3.describirse();
    }
}
