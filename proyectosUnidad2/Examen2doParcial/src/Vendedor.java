import java.util.ArrayList;

public class Vendedor extends Persona{
    private String area;
    private float comision;
    private int sueldo, idVendedor;
    private int vtaRealizada;
    private static int vendedoresExistentes = 0;

    public Vendedor(){

    }

    public Vendedor(String area, float comision, int sueldo) {
        this.area = area;
        this.comision = comision;
        this.sueldo = sueldo;
    }

    public Vendedor(String nombre, String appParteno, String appMaterno, String fechaNacimiento, String area, float comision, int sueldo) {
        super(nombre, appParteno, appMaterno, fechaNacimiento);
        this.area = area;
        this.comision = comision;
        this.sueldo = sueldo;
        vendedoresExistentes++;
        this.idVendedor = vendedoresExistentes;
        this.vtaRealizada++;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getComision() {
        return comision;
    }

    public int getVtaRealizada() {
        return vtaRealizada;
    }

    public void setVtaRealizada(int vtaRealizada) {
        this.vtaRealizada = vtaRealizada;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


    public float calcularComision(ArrayList<Cliente> clientes){

        float totalVtas = 0.0f;

        for (Cliente cliente: clientes) {

            for (Venta vtas : cliente.getHistorial()) {
                if (vtas.getIdVendedor().getNombre().equals(this.nombre)){
                    totalVtas = vtas.getTotal() + totalVtas;
                }
            }
        }

        float sueldoMasComision = 0.0f;
        float comisionCalculada = totalVtas != 0 ? totalVtas * this.comision : 0;

        sueldoMasComision = comisionCalculada + this.sueldo;

        return sueldoMasComision;
    }

}
