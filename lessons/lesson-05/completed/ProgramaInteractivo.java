import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        String nombre = sc.nextLine();
        System.out.print("Primera nota (0-20): ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota (0-20): ");
        double nota2 = sc.nextDouble();
        double p = calcularPromedio(nota1, nota2);
        System.out.println("Hola, " + nombre + "! Promedio: " + p);
        sc.close();
    }
    public static double calcularPromedio(double n1, double n2) {
        double p = (n1 + n2) / 2;
        System.out.println(p >= 11 ? "Aprobado" : "Desaprobado");
        return p;
    }
}
