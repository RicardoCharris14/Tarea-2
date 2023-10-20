public class Expendedor {
    private DepositoProducto<Cocacola> depositoCoca;
    private DepositoProducto<Sprite> depositSprite;
    private DepositoProducto<Fanta> depositoFanta;
    private DepositoProducto<Snickers> depositoSnickers;
    private DepositoProducto<Super8> depositoSuper8;
    private DepositoMoneda monedas;


    public Expendedor(int numProducto) {
        depositoCoca = new DepositoProducto<Cocacola>();
        depositSprite = new DepositoProducto<Sprite>();
        depositoFanta = new DepositoProducto<Fanta>();
        depositoSuper8 = new DepositoProducto<Super8>();
        depositoSnickers = new DepositoProducto<Snickers>();
        monedas = new DepositoMoneda();

        for (int i = 0; i < numProducto; i++) {
            Cocacola bebida1  = new Cocacola(100 + i);
            depositoCoca.addProducto(bebida1);
            Sprite bebida2 = new Sprite(200 + i);
            depositSprite.addProducto(bebida2);
            Fanta bebida3 = new Fanta(300  + i);
            depositoFanta.addProducto(bebida3);
            Snickers dulce1 = new Snickers(400 + i);
            depositoSnickers.addProducto(dulce1);
            Super8 dulce2 = new Super8(500 + i);
            depositoSuper8.addProducto(dulce2);
        }
    }

    public Producto comprarProducto(Moneda m, SeleccionProductos n_producto ){
        if (m==null){
            //crear exepcion PagoIncorrectoExepcion
            return null;
        }
        if (m.getValor()!= 100 || m.getValor()!= 500 || m.getValor()!=1000) {
            monedas.addMoneda(m);
            return null;
        }
        else if(m.getValor()>=n_producto.getPrecio()){
            Producto producto1;
            switch(n_producto) {
                case Cocacola:
                    producto1 = depositoCoca.getProducto();
                    break;
                case Sprite:
                    producto1 = depositSprite.getProducto();
                    break;
                case Fanta:
                    producto1 = depositoFanta.getProducto();
                    break;
                case Snickers:
                    producto1 = depositoSnickers.getProducto();
                    break;
                case Super8:
                    producto1 = depositoSuper8.getProducto();
                default:
                    //crear exepcion NoHayProductoExepcion
                    monedas.addMoneda(m);
                    return null;
            }

            if(producto1 != null){
                int NumMonedas=(m.getValor()-n_producto.getPrecio())/100;
                for(int i=0;i<NumMonedas;i++) {
                    Moneda moneda = new Moneda100();
                    monedas.addMoneda(moneda);
                }
            }
             else{
                monedas.addMoneda(m);
                // crear exepcion NoHayProductoExepcion XD
            }
            return producto1;
        }
        else{
            //crear exepcion NoHayProductoExepcion
            monedas.addMoneda(m);
            return null;
        }

    }
    public Moneda getVuelto() {
        return monedas.getMoneda();
    }
}


