public class PrimitivosFloat {
    //static float varFlotante;

    public static void main(String[] args) {

        float realFloat = 1.5e4f;//2.12e3f;//2120.0f;
        float realFloatNegative = 0.00000000015f;// 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloatNegative = " + realFloatNegative);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);


        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
        // Al no iniciarlizar las variables por default el valor de double y float es 0.0

    }
}

