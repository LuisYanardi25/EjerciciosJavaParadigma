package Cliente;

public class Tarjeta {
    private int numero;

    public Tarjeta(int numero){
        this.numero=numero;
    }
    public int getnumero(){
        return numero;
    }

    public void setnumero(int numero){
        this.numero=numero;
    }
}
