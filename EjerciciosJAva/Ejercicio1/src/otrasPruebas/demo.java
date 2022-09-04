package otrasPruebas;

class demo {
    public long test (Object obj){
        if(Integer.parseInt(obj.toString())>9)
            return ((Long)obj).longValue();
        return -1L;
    }
}
