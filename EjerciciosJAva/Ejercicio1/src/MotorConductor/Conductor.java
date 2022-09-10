public class Conductor {
    
    private Integer direccion;
    private int distRecorrida;
    private Buscador busca;


    public Conductor(Integer n){
        this.distRecorrida  = n;
    }


    //Dependencia
    public void ctrlAvance (){
        Avance start = new Avance();
    }
    public void crtrlGiro(){
        Giro turn = new Giro();
    }



    public Buscador getBusca() {
        return busca;
    }
    public void setBusca(Buscador busca) {
        this.busca = busca;
    }
    public Integer getDireccion(){
        return this.direccion;
    }
    public void setDireccion(Integer dir){
        this.direccion=dir;
    }
    public int getDistRecorrido(){
        return this.distRecorrida;
    }
    public void setDistRecorrido(int recorrido){
        this.distRecorrida=recorrido;
    }


    public void avanzar(){
        busca.buscarPaso();
        if(this.distRecorrida>100){

            for(int i =0; i<this.distRecorrida; i++){
                this.distRecorrida+=i;
            }
        }
    }
}
