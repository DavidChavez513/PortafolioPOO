class Persona {
    protected String nombre; 
    protected Fecha fechaNacimiento;
    protected int dni;


    public Persona() {

    }

    public Persona(String nom, String fechaNac, int dni){
        Fecha dateHelper = new Fecha();
        this.nombre = nom;
        this.dni = dni;
        this.fechaNacimiento = dateHelper.DesglozaFecha(fechaNac);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void imprimirDatos(){
        System.out.println(getNombre());
        System.out.println(getDni());
        System.out.println(getFechaNacimiento());
    }
}
