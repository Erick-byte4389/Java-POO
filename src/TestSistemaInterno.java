public class TestSistemaInterno {
    public static void main(String[] args) {

        SistemaInterno sistema = new SistemaInterno();
        TestGerente gerente = new TestGerente();
        Administrador admin = new Administrador();

        sistema.autentica(gerente);
        sistema.autentica(admin);

    }
}
