public class TestGerente extends Funcionario implements Autenticar {
    // Extends crea la herencia de la clase Funcionario a la clase gereente
    public static void main(String[] args) {

        TestGerente gerente = new TestGerente();

        gerente.setNombre("Guillermo Saucedo");
        gerente.setDocumento("G12345");
        gerente.setSalario(20000);
        gerente.setClave("123");

        boolean autenticar = gerente.iniciarSesion("123");

        System.out.println("Su sesion ha sido: " + autenticar);

        System.out.println("Hola " + gerente.getNombre());

        System.out.println("Tu bonificacion es de: " + gerente.getBonificacion());
        System.out.println("Tu salario es de: " + gerente.getSalario());
        System.out.println("Su salario total es: " + (gerente.getBonificacion() + gerente.getSalario()));

    }

    // Metodos exclusivos de gerente

    // Esto es una sobreescritura de metodos
    public double getBonificacion() {
        System.out.println("Ejecutanto test de GERENTE");
        return super.getSalario() * 2;
        // Super es la palabra reservada para llamar a los metodo
        // de la clase padre
    }

    /*
     * Modificadores de acceso:
     * private - solo visible dentro de la clase.
     * protected - visible dentro de la clase y también para las hijas.
     * public - visible en todo lugar.
     * También tenga en cuenta que protected está relacionado con la herencia.
     */

}
