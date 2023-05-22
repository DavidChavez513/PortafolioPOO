public class Comision extends Empleado{

    private float porcentajeComision;
    private int ventas;

    public Comision(){
    }

    public Comision(String nom, String fechaNam, int dni, int sueldo, float perComision){
        super(nom, fechaNam, dni, sueldo);
        this.porcentajeComision = perComision;
        this.ventas = 0;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void vender(int venta){
        this.ventas += venta;
    }

    public int getSueldo(){

        float operador = 0.0F;

        if (getPorcentajeComision() > 1) {
            operador = getPorcentajeComision() / 100;
        } else {
            operador = getPorcentajeComision();
        }

        return getSueldoBase() + (int) (getVentas() * (operador));
    }



}
