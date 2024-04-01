// Clase abstracta Funcionario
public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;
    private String clave;

    public Funcionario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Metodo abstracto
    public abstract double getBonificacion();

    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
