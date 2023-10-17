import java.util.ArrayList;

public class DepositoProducto<T> {
    private ArrayList<T> productos;
    public DepositoProducto(){
        productos = new ArrayList();
    }
    public void addProducto(T item){
        productos.add(item);
    }
    public T getProducto(){
        if(productos.isEmpty()){
            return null;
        }
        else{
            return productos.remove(0);
        }
    }


}
