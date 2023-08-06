import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        double precio1 = 0;
        double precio2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre para la factura");

        String nombre = scanner.nextLine();
        System.out.println("Ingrese un precio del primer producto");
        try {
            precio1 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Intenta con un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese un precio del segundo producto");
        try {
            precio2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Intenta con un numero");
            main(args);
            System.exit(0);
        }
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * .19;
        double total = totalBruto + impuesto;
        String mensaje = "La factura producto de " + nombre + " tiene un total bruto de " + totalBruto + " , con un impuesto de " + impuesto + " y el monto después de impuesto es de " + total;
        System.out.println(mensaje);
    }
}
