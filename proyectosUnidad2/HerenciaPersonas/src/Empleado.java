public class Empleado extends Persona{

    protected int sueldoBase;


    public Empleado(){
        super();
    }

    public Empleado(String nombre, String fecha, int dni, int sueldoBase){
        super(nombre, fecha, dni);
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tu sueldo es de: ");
        System.out.println(getSueldoBase());
    }

}
