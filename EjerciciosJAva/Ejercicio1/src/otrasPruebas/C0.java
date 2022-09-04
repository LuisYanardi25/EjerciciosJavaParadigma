package otrasPruebas;



public class C0 {
    static C0 instance;
    public static final String outer =
    instance.makeString(8.6);
    
    public C0(){
        instance = this;
    }
   
    public String makeString(int i){
        return ((new Integer(i)).toString());
    }
    public String makeString(double d){
        return ((new Double(d)).toString());
    }
    public static final class nested {
        public static final String inner=
        instance.makeString(4);
    }
    
}
