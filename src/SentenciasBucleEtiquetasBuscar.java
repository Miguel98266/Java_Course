public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "trigo tres tigres tigres tragan trigo en un trigal";
        String palabra = "tigres";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                System.out.println(frase.charAt(k) +" "+ palabra.charAt(j));
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter " + palabra + " en la frase ");
    }
}
