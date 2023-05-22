public class Persona {

    static Fecha dtHelp = new Fecha();

    protected String nombre, appParteno, appMaterno;
    protected Fecha fechaNacimiento;

    public Persona(){

    }

    public Persona(String nombre, String appParteno, String appMaterno, String fechaNacimiento) {
        this.nombre = nombre;
        this.appParteno = appParteno;
        this.appMaterno = appMaterno;
        this.fechaNacimiento = dtHelp.desglozaFecha(fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppParteno() {
        return appParteno;
    }

    public void setAppParteno(String appParteno) {
        this.appParteno = appParteno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
