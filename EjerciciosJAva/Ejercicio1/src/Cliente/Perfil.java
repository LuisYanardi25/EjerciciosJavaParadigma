package Cliente;

public class Perfil {
    private String nombreperfil;
    
    public Perfil(String nombrePerfil){
        this.nombreperfil=nombrePerfil;
    }
    
    public String getnombreperfil(){
        return nombreperfil;
    }

    public void setnombreperfil(String nombreperfil){
        this.nombreperfil=nombreperfil; 
    }

}
