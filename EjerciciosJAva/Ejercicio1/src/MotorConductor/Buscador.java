import java.util.ArrayList;

public class Buscador {
    
    private Conductor conduce;
    private ArrayList<Censor> censa = new ArrayList<>();

    public Conductor getConduce() {
        return conduce;
    }

    public void setConduce(Conductor conduce) {
        this.conduce = conduce;
    }

    public ArrayList<Censor> getCensa() {
        return censa;
    }

    public void setCensa(ArrayList<Censor> censa) {
        this.censa = censa;
    }

    public int buscarPaso(){
        if (censa.size() != 0){
            Avance a = new Avance();
            a.parar();
            conduce.setDireccion(1);
        }else{
            Avance b = new Avance();
            b.mover(2);
            System.out.println("Distancia avanzada " + 2);
        }
        return 2;
    }
    public Boolean detectarObstaculo(){

        if (censa.size()>2){
            return true;
        }
        return false;
    }

    
}
