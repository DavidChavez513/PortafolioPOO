public class Entrenador extends SeleccionFutbol{

    private String puesto;
    private int idFederacion;

    public Entrenador(int id, int edad, String nombre, String apellido, String puesto, int idFederacion){
        super(id, edad, nombre, apellido);
        this.puesto = puesto;
        this.idFederacion = idFederacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){
        System.out.println("DIRIGIR PARTIDO EN LA CANCHA");
    }

    public void dirigirEntrenamiento(){
        System.out.println("TE ESPERAN EN EL CAMPO DE ENTRENAMIENTO");
    }

}
