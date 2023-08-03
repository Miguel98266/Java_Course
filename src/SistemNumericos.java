public class SistemNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 30;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        // Se debe poner un 0b para que sistema sepa que es un numero binario
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        // Se debe poner un 0 para que el sistema sepa que es un numero octal
        int numeroOctal = 036;
        System.out.println("numero Octal = " + numeroOctal);

        System.out.println("numero hexadecimal de  = " + numeroOctal + " = " + Integer.toHexString(numeroOctal));
        // Se debe poner un 0x para que el sistema sepa que es un numero hexadecimal
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

    }
}
