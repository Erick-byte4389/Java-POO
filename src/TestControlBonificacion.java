public class TestControlBonificacion {

    /*
     * Ejemplo de polimorfismo en Java con el uso de la herencia. En este ejemplo se
     * crea una clase padre llamada Funcionario y dos clases hijas llamadas Contador
     * y TestGerente. La clase Funcionario tiene un método llamado getBonificacion()
     * que es sobreescrito en las clases hijas. La clase TestControlBonificacion
     * tiene un método registrarSalario() que recibe como parámetro un objeto de
     * tipo Funcionario. En el método registrarSalario() se llama al método
     * getBonificacion() del objeto Funcionario que se recibe como parámetro. Como
     * el método getBonificacion() es sobreescrito en las clases hijas, se ejecuta
     * el método getBonificacion() de la clase hija que se haya instanciado.
     */

    public static void main(String[] args) {
        Funcionario Erick = new Contador();
        Erick.setSalario(2000);

        TestGerente Ximena = new TestGerente();
        Ximena.setSalario(10000);

        ControlBonificacion controlBonif = new ControlBonificacion();
        controlBonif.registrarSalario(Erick);
        controlBonif.registrarSalario(Ximena);

        Contador contador = new Contador();
        contador.setSalario(5000);
        controlBonif.registrarSalario(contador);

    }
}
