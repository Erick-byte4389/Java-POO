public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario Erick = new Contador();
        Erick.setNombre("Erick de la Cruz");
        Erick.setDocumento("E140203");
        Erick.setSalario(10000);

        System.out.println("Hola " + Erick.getNombre());
        System.out.println("Tu bonificacion es de: " + Erick.getBonificacion());
        System.out.println("Tu salario es de: " + Erick.getSalario());
        System.out.println("Su salario total es: " + (Erick.getSalario() + Erick.getBonificacion()));
    }
}
