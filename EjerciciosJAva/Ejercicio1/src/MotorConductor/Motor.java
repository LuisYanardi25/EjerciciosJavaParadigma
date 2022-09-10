public abstract class Motor{
    protected Integer velocidad;

    public void mover(Integer vel){
           this.velocidad = vel; 
    }
    public void parar(){
        this.velocidad = 0;
    }
}