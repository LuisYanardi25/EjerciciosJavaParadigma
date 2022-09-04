package Cliente;


import java.sql.SQLOutput;
import java.util.ArrayList;



public class Cliente extends Persona{
    ArrayList<Lugar> frctes = new ArrayList <>();
    public Tarjeta tc;
    ArrayList<Perfil> pfles = new ArrayList<>();

    public Cliente (String nombre){
        this.Nombre=nombre;
    }


    public void agregarFrecuenta(Lugar lug){
        frctes.add(lug);
        //System.out.println("SE A AGREADO EL LUGAR");
    }
    public void agregarPerfil(Perfil perf){
        pfles.add(perf);
        //System.out.println("SE AGREGO EL PERFIL");
    }

    public void mostrarPerfiles(){
        System.out.println("Perfiles: "+Nombre);
        for(Perfil e :pfles){
            
            System.out.println(e.getnombreperfil());
        }
    }
    public void mostrarLugar(){
        System.out.println("Lugares visitados: "+ Nombre);
        for(Lugar l : frctes){
           
            System.out.println(l.getCiudad());
        }
    }
    public void setTarjeta(Tarjeta tarj){
        this.tc = tarj;
    }


    @Override
    public String toString() {
        return "Cliente [frctes=" + frctes + ", pfles=" + pfles + ", tc=" + tc + "]";
    }


    


}
