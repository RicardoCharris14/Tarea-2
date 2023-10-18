/**
 * clase que representa un bebestible
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public abstract class Bebida extends Producto{
    public Bebida(int serie){
        super(serie);
    }

    /**
     * Simula la accion de beber una bebida
     * @return String que representa la accion de beber
     */
    public abstract String beber();

    /**
     * Da una descripcion de la clase
     * @return String que describe la clase Bebida
     */
    @Override
    public String toString(){
        return "\nBebida con Nro. Serie: "+getSerie();
    }

}
