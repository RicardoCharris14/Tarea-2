/**
 * Esta clase es abstracta y hereda las monedas
 * @author Vicente
 * @author Ricardo
 */

/**
 * Metodo constructor de Moneda
 */
public abstract class Moneda  implements Comparable <Moneda>{
    public Moneda(){

    }
//REVISAR EL HASCODE DEL METODO
    /**
     *
     * @return devuelve la moneda
     */
    public String getSerie(){
        int hashCode = System.identityHashCode(this);
        String hexHashCode = Integer.toHexString(hashCode);
        return hexHashCode;
    }



    /**
     * funcion abstracta que hereda getValor
     * @return devualve el valor de la moneda
     */
    public abstract int getValor();





    public int compareTo(Moneda moneda){
        if(this.getValor() > moneda.getValor()){
            return 1;
        }
        else if (this.getValor() < moneda.getValor()){
                return -1;
        }
        else {
            return 0;
        }

    }

}



