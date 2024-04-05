
package herenciaa;


public class Cliente extends Persona{
    private String categoria;

    public Cliente(String categoria, String nombre, String apellido, String codigo) {
        super(nombre, apellido, codigo);
        this.categoria = categoria;
    }
    
}
