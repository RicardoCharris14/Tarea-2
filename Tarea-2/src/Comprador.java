public class Comprador {
    private String productoConsumido;
    private int vuelto;
    public Comprador(Moneda m, SeleccionProductos eleccion, Expendedor exp){
        vuelto = 0;
        Producto productoComprado = exp.comprarProducto(m, eleccion);
        if(productoComprado != null) {
            productoConsumido = productoComprado.consumir();
        }
        Moneda tmp = exp.getVuelto();
        while(tmp != null){
            vuelto += tmp.getValor();
            tmp = exp.getVuelto();
        }

    }
    public String queBebiste(){
        return productoConsumido;
    }
    public int getVuelto(){
        return vuelto;
    }

}

