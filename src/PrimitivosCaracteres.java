public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (caracter == decimal));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        var caracter1 = '\u0040';

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bytes = " + Character.SIZE);
        System.out.println("Character.Min_Value = " + Character.MIN_VALUE);
        System.out.println("Character.Max_Value = " + Character.MAX_VALUE);
    }
}
