import java.util.ArrayList;

public class UNA{
    private Integer X;
    private ArrayList<TRES> Stiene = new ArrayList<>();
    
    public UNA (Integer X){
        this.X=X;
    }

    public void producto (int y){
        X = X*y;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public ArrayList<TRES> getStiene() {
        return Stiene;
    }

    public void setStiene(ArrayList<TRES> stiene) {
        Stiene = stiene;
    }
    



}