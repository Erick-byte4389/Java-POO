public class Main {
    public static void main(String[] args) {

        for (Dias dia : Dias.values()) {
            System.out.println("El dia de la semana es: " + dia); // Imprime los enums
        }

        Dias domingo = Dias.DOMINGO;
        System.out.println(domingo.name()); // Imprime el nombre del enum
        System.out.println(domingo.ordinal()); // Imprime el indice del enum
        System.out.println(domingo.toString()); // Convierte de enum a String

    }
}