import java.util.ArrayList;

/**
 * Deposito que guarda varios productos de un solo tipo
 * @param <T> indica que clase de objeto contendra el deposito
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class DepositoProducto<T> {
    /**objeto de clase T, para obtener el nombre de la clase en el toString */
    private T tipoProducto;
    /**guarda varios productos del tipo T */
    private ArrayList<T> productos;
    public DepositoProducto(){
        productos = new ArrayList();
    }

    /**
     * Añade un objeto del tipo T al ArrayList de productos
     * @param item objeto que sera añadido al ArrayList productos
     */
    public void addProducto(T item){
        productos.add(item);
    }

    /**
     * Saca un producto del ArrayList productos y lo devuelve
     * @return objeto de tipo T del ArrayList productos
     */
    public T getProducto(){
        if(productos.isEmpty()){
            return null;
        }
        else{
            return productos.remove(0);
        }
    }

    /**
     * Describe la clase DepositoProducto
     * @return String que da una descripcion de la clase
     */
    public String toString(){
        return "\nDeposito que contiene productos de tipo "+tipoProducto.getClass().getSimpleName();
    }


}
