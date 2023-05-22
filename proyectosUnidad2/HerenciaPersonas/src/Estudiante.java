public class Estudiante extends Persona{
    private int puntuacionTotal;
    private int numeroCalificaciones;

    public Estudiante(){

    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public int getNumeroCalificaciones() {
        return numeroCalificaciones;
    }

    public void setNumeroCalificaciones(int numeroCalificaciones) {
        this.numeroCalificaciones = numeroCalificaciones;
    }

    public Estudiante(String nom, String fechNam, int dni){
        super(nom, fechNam, dni);
        this.numeroCalificaciones = 0;
        this.puntuacionTotal = 0;
    }

    public void nuevaCalificacion(int cal){
        this.puntuacionTotal += cal;
        this.numeroCalificaciones++;
    }

    public double promediarCalificacion(){
        return (getPuntuacionTotal() / getNumeroCalificaciones());
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tu promedio es: " + promediarCalificacion());
    }
}
