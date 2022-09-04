package Cliente;

public abstract class Persona {
    protected String Nombre;

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre= nombre;
    }
}
