/**
 * Enumeracion que contiene los productos y sus precios.
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public enum SeleccionProductos {
    /**Constantes que hacen alucion a los diferentes productos*/
    Sprite(1, 3000),Cocacola(2,1500),Fanta(3,1000),Snickers(4,800),Super8(5,500);
    /**Guarda el precio de cada constante*/
    private final int precio;
    private final int numroSeleccion;
    SeleccionProductos(int numeroSeleccion, int precio){
        this.precio = precio;
        this.numroSeleccion = numeroSeleccion;
    }

    /**
     * retorna el valor de la variable precio
     * @return Entero con el valor de la variable precio
     */
    public int getPrecio(){
        return precio;
    }
}
