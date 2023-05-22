import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
    private int idVenta;
    private Fecha dtVenta;
    private int contVentas = 0;
    private final float IVA = 0.16F;
    private float subtotal, total;
    private static int vtasCompletas = 0;
    private ArrayList<Producto> carrito = null;
    private ArrayList<Producto> inventario = null;
    private Vendedor idVendedor;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Fecha getDtVenta() {
        return dtVenta;
    }

    public void setDtVenta(Fecha dtVenta) {
        this.dtVenta = dtVenta;
    }

    public int getContVentas() {
        return contVentas;
    }

    public void setContVentas(int contVentas) {
        this.contVentas = contVentas;
    }

    public float getIVA() {
        return IVA;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Producto> getArrVentas() {
        return carrito;
    }

    public void setArrVentas(ArrayList<Producto> arrVentas) {
        this.carrito = arrVentas;
    }

    public Vendedor getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Vendedor idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Venta() {

    }

    public Venta(Vendedor vendedor) {
        this.carrito = new ArrayList<Producto>();
        this.idVendedor = vendedor;
    }

    public Venta(Fecha dtVenta, float subtotal, float total, Vendedor idVendedor) {
        vtasCompletas++;
        this.idVenta = vtasCompletas;
        this.dtVenta = dtVenta;
        this.subtotal = subtotal;
        this.total = total;
        this.idVendedor = idVendedor;
    }

    public void agregarProductoToCarrito(ArrayList<Producto> inventario, Scanner scan) {
        int id = 0, stock = 0;
        System.out.println("Cual es el ID del producto");
        id = scan.nextInt();
        System.out.println("Cuantos quieres agregar: ");
        stock = scan.nextInt();
        this.carrito = carrito.isEmpty() ? new ArrayList<Producto>() : getCarrito();
        for (Producto prod : inventario) {
            if (prod.getId() == id) {
                if (stock <= prod.getStock()) {

                    carrito.add(new Producto(prod.getId(), stock, prod.getDescripcion(), prod.getPrecio()));
                    prod.setStock(prod.getStock() - stock);
                    System.out.println("PRODUCTOS AGREGADOS AL CARRITO CON EXITO");

                    break;
                } else {
                    System.out.println("NO ES POSIBLE HACER ESTE PEDIDO, NO HAY STOCK DISPONIBLE");
                }
            }

        }

    }

    public void agregarProductos(ArrayList<Producto> productos, Scanner scan) {
        int id = 0, stock = 0;
        float precio = 0.0f;
        String descp = "";

        System.out.println("Cual es el ID del producto");
        id = scan.nextInt();
        System.out.println("Cual es el stock a agregar: ");
        stock = scan.nextInt();
        System.out.println("Precio del producto: ");
        precio = scan.nextFloat();
        System.out.println("Descripcion del producto: ");
        descp = scan.next();

        // this.inventario = productos == null ? new ArrayList<Producto>() : inventario;

        productos.add(new Producto(id, stock, descp, precio));

        System.out.println("PRODUCTOS AGREGADOS CON EXITO");
    }

    public void eliminarProductos(Scanner scan) {
        int id = 0, stock = 0;
        String confirm = "";

        System.out.println("Que producto quieres eliminar: ");
        id = scan.nextInt();
        System.out.println("Cuantos elementos quieres eliminar: ");
        stock = scan.nextInt();
        System.out.println("ESTA ACCIÓN ELIMINARÁ LOS PRIMEROS " + stock
                + " ELEMENTOS DE ESE PRODUCTO, SI ESTÁS SEGURO DE ESO \n ESCRIBE LA PALABRA * CONTINUAR *");
        confirm = scan.next();

        if (confirm.equals("CONTINUAR")) {
            for (Producto producto : this.inventario) {
                if (producto.getId() == id) {
                    for (int i = 0; i < stock; i++) {
                        this.inventario.remove(i);
                    }
                    System.out.println("PRODUCTOS ELIMINADOS CORRECTAMENTE");
                }
            }
        } else {
            System.out.println("OPERACIÓN CANCELADA");
        }
    }

}
