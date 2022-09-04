package otrasPruebas;

public class Container{
    public class Item{
        Object data;
        public Container getContainer(){
            return Container.this;
        }
        public Item(Object d){
            super();
            this.data = d;
        }
    }
    /*Orginalmente tiene la palabra static, el error porque no se puede instaciar */
    public  Item create(Object d){
        return new Item(d);
    }
    public Item createSubItem(Object d){
        return new Item(d);
    }
}