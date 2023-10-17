public class DepositoProducto {
    private ArrayList<Bebida> bebidas;
    public Deposito(){
        bebidas = new ArrayList();
    }
    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    public Bebida getBebida(){
        if(bebidas.isEmpty()){
            return null;
        }
        else{
            return bebidas.remove(0);
        }
    }


}
