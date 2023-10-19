/**
 * Enumeracion que contiene los productos y sus precios.
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public enum SeleccionProductos {
    /**Constantes que hacen alucion a los diferentes productos*/
    Sprite(3000),Cocacola(1500),Fanta(1000),Snickers(800),Super8(500);
    /**Guarda el precio de cada constante*/
    private final int precio;
    SeleccionProductos(int precio){
        this.precio = precio;
    }

    /**
     * retorna el valor de la variable precio
     * @return Entero con el valor de la variable precio
     */
    public int getPrecio(){
        return precio;
    }
}
