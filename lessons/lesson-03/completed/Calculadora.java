public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
        if (a > b) System.out.println("Mayor: " + a);
        else if (b > a) System.out.println("Mayor: " + b);
        else System.out.println("Son iguales.");
    }
}
