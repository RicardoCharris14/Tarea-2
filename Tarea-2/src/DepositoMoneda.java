public class DepositoMoneda {
    public ArrayList<Moneda> monedas;
    public DepositoM(){
        monedas = new ArrayList();
    }
    public void addMoneda(Moneda moneda){
        monedas.add(moneda);
    }
    public Moneda getMoneda(){
        if(monedas.isEmpty()){
            return null;
        }
        else{
            return monedas.remove(0);
        }
    }
}
