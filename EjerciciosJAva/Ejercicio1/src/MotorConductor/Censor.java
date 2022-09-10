public class Censor {
    private Buscador busca;

    public Buscador getBusca() {
        return busca;
    }

    public void setBusca(Buscador busca) {
        this.busca = busca;
    }
    
    public int distancia(){
        return (int) Math.random()*10;
    }
}
