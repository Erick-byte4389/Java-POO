public abstract class Cuenta {
    /*
     * Es un paradigma de programación (un estilo de programación)
     * Clase: Plantilla de métodos y atributos abstraídos de un objeto real
     * Objeto: Es una instancia de una clase donde podemos definir valores para sus
     * atributos.
     * Atributo: Características de una clase
     * class --> palabra reservada de java que representa un objeto
     * Instancia: Es la representación de un objeto (mandar a llamar una clase)
     */
    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();
    // psvm --> Es el método para ejecutar una clase

    // Variables estáticas -> Hace que una variable no sea de una instancia si no de
    // la clase
    private static int total = 0;

    // Constructor -> Se utiliza para inicializar los atributos
    public Cuenta(int agencia, int numero) {
        if (agencia <= 0) {
            System.out.println("No se permiten negativos");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
        // System.out.println("Aqui se crea una nueva cuenta");
    }

    // Método es la acción de un objeto
    // Hay metodos que retornar valor y hay otros que no
    public abstract void depositar(double saldo); // Void no retorna un valor
        // This -> Esta diferencia la variable del objeto a la del parametro
        // This es una referencia que apunta a un objeto

    // Retorna valor
    public boolean retirar(double retiro) {
        if (retiro <= this.saldo) {
            this.saldo = this.saldo - retiro;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public boolean transferir(double transferir, Cuenta cuenta) {
        if (transferir <= this.saldo) {
            // this.saldo = this.saldo - transferir;
            this.retirar(transferir);
            cuenta.depositar(transferir);
            return true;
        } else {
            return false;
        }
    }

    public boolean retiro(double retirar) {
        if (retirar <= this.saldo) {
            this.saldo -= retirar;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
    /*
     * public void setAgencia(int agencia){
     * if (agencia > 0) {
     * this.agencia = agencia;
     * }
     * }
     * 
     */

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    // Miembro estático
    public static int getTotal() {
        return Cuenta.total;
    }

}
