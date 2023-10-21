import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Deposito<Moneda> deposito1 = new Deposito<>();
        System.out.println(deposito1.toString());


        Expendedor expe = new Expendedor(6);
        Moneda m = null;
        Comprador comprador = null;

        //aqui probemos si el comprador
        m = new Moneda1500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Cocacola, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println("Moneda invalida");
        } catch (PagoInsuficienteException e) {
            System.out.println("La moneda no satisface el precio del producto");
        } catch (NoHayProductoException e) {
            System.out.println("No existe el producto en la maquina");
        }
        System.out.println(comprador.queBebiste() + ", mi vuelto fue de $" + comprador.getVuelto());

        m= new Moneda1000();
        try {
            comprador = new Comprador(m, SeleccionProductos.Sprite, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queBebiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        m = new Moneda500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Fanta, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queBebiste() + ", mi vuelto fue de $" + comprador.getVuelto());

        m= new Moneda100();
        try {
            comprador = new Comprador(m, SeleccionProductos.Snickers, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queBebiste() + ", mi vuelto fue de $" + comprador.getVuelto());

        m= new Moneda1500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Super8, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queBebiste() + ", mi vuelto fue de $" + comprador.getVuelto());












    }
}