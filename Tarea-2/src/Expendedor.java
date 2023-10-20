public class Expendedor {
    private Deposito<Cocacola> depositoCoca;
    private Deposito<Sprite> depositSprite;
    private Deposito<Fanta> depositoFanta;
    private Deposito<Snickers> depositoSnickers;
    private Deposito<Super8> depositoSuper8;
    private Deposito<Moneda> monedas;

    public Expendedor(int numProducto) {
        depositoCoca = new Deposito<>();
        depositSprite = new Deposito<>();
        depositoFanta = new Deposito<>();
        depositoSuper8 = new Deposito<>();
        depositoSnickers = new Deposito<>();
        monedas = new Deposito<>();

        for (int i = 0; i < numProducto; i++) {
            Cocacola bebida1  = new Cocacola(100 + i);
            depositoCoca.addElemento(bebida1);
            Sprite bebida2 = new Sprite(200 + i);
            depositSprite.addElemento(bebida2);
            Fanta bebida3 = new Fanta(300  + i);
            depositoFanta.addElemento(bebida3);
            Snickers dulce1 = new Snickers(400 + i);
            depositoSnickers.addElemento(dulce1);
            Super8 dulce2 = new Super8(500 + i);
            depositoSuper8.addElemento(dulce2);
        }
    }

    public Producto comprarProducto(Moneda m, SeleccionProductos n_producto ){
        if (m==null){
            throw PagoIncorrectoException("\nNo se ha ingresado una moneda.");
            //return null;
        }
        if (m.getValor()!= 100 || m.getValor()!= 500 || m.getValor()!=1000) {
            monedas.addElemento(m);
            return null;
        }
        else if(m.getValor()>=n_producto.getPrecio()){
            Producto producto1;
            switch(n_producto) {
                case Cocacola:
                    producto1 = depositoCoca.getElemento();
                    break;
                case Sprite:
                    producto1 = depositSprite.getElemento();
                    break;
                case Fanta:
                    producto1 = depositoFanta.getElemento();
                    break;
                case Snickers:
                    producto1 = depositoSnickers.getElemento();
                    break;
                case Super8:
                    producto1 = depositoSuper8.getElemento();
                    break;
                default:
                    throw NoHayProductoException("\nSeleccion de producto invalida.");
                    //monedas.addElemento(m);
                    return null;
            }

            if(producto1 != null){
                int NumMonedas=(m.getValor()-n_producto.getPrecio())/100;
                for(int i=0;i<NumMonedas;i++) {
                    Moneda moneda = new Moneda100();
                    monedas.addElemento(moneda);
                }
            }
             else{
                 throw NoHayProductoException("\nNo hay disponibilidad del producto que se solicitó.");
                 //monedas.addElemento(m);
            }
            return producto1;
        }
        else{
            throw PagoInsuficienteException("\nEl monto ingresado es insuficiente.");
            //monedas.addElemento(m);
            //return null;
        }

    }
    public Moneda getVuelto() {
        return monedas.getElemento();
    }
}


