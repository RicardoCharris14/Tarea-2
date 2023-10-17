public class Expendedor {

    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private int precioBebidas;
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();
        this.precioBebidas = precioBebidas;
        for (int i = 0; i < numBebidas; i++) {
            Bebida bebida1 = new CocaCola(100 + i);
            coca.addBebida(bebida1);
            Bebida bebida2 = new Sprite(200 + i);
            sprite.addBebida(bebida2);
        }
    }

    public Bebida comprarBebida(Moneda m, int cualBebida){
        if(m==null){
            return null;
        }
        else if(m.getValor()>=precioBebidas){
            Bebida bebida;
            switch(cualBebida) {
                case COCA:
                    bebida = coca.getBebida();
                    break;
                case SPRITE:
                    bebida = sprite.getBebida();
                    break;
                default:
                    bebida = null;
                    break;

            }
            if(bebida != null){
                int NumMonedas=(m.getValor()-precioBebidas)/100;
                for(int i=0;i<NumMonedas;i++) {
                    Moneda moneda = new Moneda100();
                    monVu.addMoneda(moneda);
                }
            }
            if(bebida==null){
                monVu.addMoneda(m);
            }
            return bebida;
        }
        else{
            monVu.addMoneda(m);
            return null;
        }

    }
    public Moneda getVuelto(){
        if(monVu.monedas.isEmpty()){
            return null;
        }
        else{
            return monVu.getMoneda();
        }
    }
}
}
