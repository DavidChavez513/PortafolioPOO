public class Masajista extends SeleccionFutbol{

    private String especialidad;
    private int exp;


    public Masajista(int id, int edad, String nombre, String apellido, String especialidad, int exp){
        super(id, edad, nombre, apellido);
        this.especialidad = especialidad;
        this.exp = exp;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void darMasaje(){
        System.out.println("DAR MASAJE A ->");
    }
}
