public class SeleccionFutbol {

    /**
     * Atributos de la clase
     */

    protected int idPersonal, edad;
    protected String nombre, apellido;

    public SeleccionFutbol(){}

    public SeleccionFutbol(int id, int edad, String nombre, String apellido){
        this.idPersonal = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIPersonal(int id_personal) {
        this.idPersonal = id_personal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void concentrarse(){
        System.out.println("CONCENTRARSE");
    }
    public void viajar(){
        System.out.println("VIAJA AL SIGUIENTE PARTIDO");
    }
}
