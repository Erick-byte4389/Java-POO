public class TestCuenta {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorro ca = new CuentaAhorro(3, 2);

        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println("Saldo Cuenta Corriente: " + cc.getSaldo());
        System.out.println("Saldo Cuenta Ahorro: " + ca.getSaldo());

    }
}
