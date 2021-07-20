package model;
// LOS ATRIBUTOS DE LA CLASE FORMADOR
public class Formador {
    private String nombre;
    private int codigo;
    // EL METODO CONSTRUCTOR
    public Formador(String nombre, int codigo) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    //GETTERS
    public int getCodigo() {
        return codigo;
    }  
    public String getNombre() {
        return nombre;
    }
}
