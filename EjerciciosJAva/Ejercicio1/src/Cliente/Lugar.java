package Cliente;

public class Lugar {
    private String ciudad;

    public Lugar(String ciudad){
        this.ciudad = ciudad;
    }


    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
}
