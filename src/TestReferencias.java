public class TestReferencias {
    public static void main(String[] args) {

        // Ejemplo de polimorfismo

        Funcionario Funcionario1 = new TestGerente();
        Funcionario1.setNombre("Diego");

        TestGerente Gerente1 = new TestGerente();
        Gerente1.setNombre("Ximena");

        Funcionario1.setSalario(2000);
        Gerente1.setSalario(10000);

        Funcionario1.setClave("123");

        System.out.println("Funcionario1 ha iniciado sesion: " + Funcionario1.iniciarSesion("123"));

    }
}
