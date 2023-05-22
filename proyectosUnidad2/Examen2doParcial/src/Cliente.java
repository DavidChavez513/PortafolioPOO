import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cliente extends Persona {
    private String rfc, domicilio;
    private int idCliente;
    private ArrayList<Venta> historial;
    private static int clientesExistentes = 0;
    static DecimalFormat formatoPersonalizado = new DecimalFormat("#,##0.00");

    private static Venta vtaHelper = new Venta();

    public Cliente() {

    }

    public Cliente(String nombre, String appParteno, String appMaterno, String fechaNacimiento, String rfc,
            String domicilio) {
        super(nombre, appParteno, appMaterno, fechaNacimiento);
        this.rfc = rfc;
        this.domicilio = domicilio;
        this.historial = new ArrayList<Venta>();
        clientesExistentes++;
        this.idCliente = clientesExistentes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Venta> getHistorial() {
        return historial;
    }

    private void registrarHistorial(Venta venta) {
        this.historial.add(venta);
    }

    public String comprar(Vendedor vendedor, ArrayList<Producto> carrito) {

        Fecha dtCompra = Fecha.getTimestamp();

        float subtotal = 0.0f;
        for (Producto prod : carrito) {
            subtotal = prod.getPrecio() * prod.getStock();
            float total = (vtaHelper.getIVA() * subtotal) + subtotal;
            registrarHistorial(new Venta(dtCompra, subtotal, total, vendedor));
            StringBuffer infoCompra = new StringBuffer("==== FECHA COMPRA ====> " + dtCompra + "\nSubTotal: $"
                    + formatoPersonalizado.format(subtotal) + "\nTotal: $" + formatoPersonalizado.format(total)
                    + "\nIVA: %" + formatoPersonalizado.format(vtaHelper.getIVA() * 100));
            System.out.println(infoCompra);
        }

        return "COMPRA REALIZADA CON EXITO";
    }

}
