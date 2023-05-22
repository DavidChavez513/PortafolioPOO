import java.util.ArrayList;

public class Producto {

    private int id, stock;
    private String descripcion;
    private float precio;

    public Producto(){

    }

    public Producto(int id, int stock, String descripcion, float precio) {
        this.id = id;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean agregar(ArrayList<Producto> inventario, Producto producto) {
        inventario.add(producto);
        return true;
    }

    public Producto buscar(ArrayList<Producto> inventario){
        Producto resulSearch = null;
        for (Producto prod: inventario) {
            resulSearch = prod;
        }
        return resulSearch;
    }

}
