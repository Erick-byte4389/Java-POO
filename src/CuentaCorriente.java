public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobreescritura del método

    @Override
    public boolean retirar(double retiro) {
        double comision = 0.5;
        return super.retirar(retiro + comision);
    }

    @Override
    public void depositar(double saldo) {
        this.saldo = this.saldo + saldo;
    }
}
