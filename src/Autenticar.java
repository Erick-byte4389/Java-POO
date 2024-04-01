public interface Autenticar {

    /*
        Una interfaz en Java es un tipo de referencia similar a una clase.
        Se compone de constantes estáticas y métodos abstractos.
        No se puede instanciar directamente, sino que debe ser implementada por una clase.
     */

    public void setClave(String clave);

    public boolean iniciarSesion(String clave);

}
