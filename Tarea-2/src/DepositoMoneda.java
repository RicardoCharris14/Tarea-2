import java.util.ArrayList;
public class DepositoMoneda {
    private ArrayList<Moneda> monedas;
    public DepositoMoneda(){
        monedas = new ArrayList();
    }

    public ArrayList<Moneda> getMonedas() {
        return monedas;
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
