public class PrimitivoBoolean {
    public static void main(String[] args) {
        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);

        double d = 98765.43e-3; // 98.76543e-3
        System.out.println("d = " + d);
        float f = 1.2345e2f; //123.450
        System.out.println("f = " + f);

        dataLogico = d > f;
        System.out.println("dataLogico = " + dataLogico);

        boolean esIgual = 3 - 2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
