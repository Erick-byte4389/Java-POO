public class SistemaInterno {

    private String Clave = "Hola";

    public boolean autentica (Autenticar gerente) {
        boolean puedeLoguear = gerente.iniciarSesion(Clave);
        if (puedeLoguear) {
            System.out.println("Bienvenido");
            return true;
        } else {
            System.out.println("No puede ingresar");
            return false;
        }
    }

}
