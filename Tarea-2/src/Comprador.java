public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida bebida = exp.comprarBebida(m, cualBebida);
        if(bebida == null){
            sonido = null;
        }
        else{
            sonido = bebida.beber();
        }
        Moneda aux;
        do{
            aux = exp.getVuelto();
            if(aux == null){
                break;
            }
            vuelto += aux.getValor();
        }while(aux!= null);
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }

}
}
