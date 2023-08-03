public class ConversionDeTipos {
    public static void main(String[] args) {
        var numeroStr = "50";

        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "9128398.12e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        var logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumberoStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.2345;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 70000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f= (float) i;
        System.out.println("f = " + f);
    }
}
