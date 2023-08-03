import javax.swing.*;

public class SistemNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // Se debe poner un 0b para que sistema sepa que es un numero binario
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        // Se debe poner un 0 para que el sistema sepa que es un numero octal
        int numeroOctal = 036;
        System.out.println("numero Octal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        // Se debe poner un 0x para que el sistema sepa que es un numero hexadecimal
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
