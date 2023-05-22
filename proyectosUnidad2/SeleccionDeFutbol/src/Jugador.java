public class Jugador extends SeleccionFutbol {

    /**
     * Deja voy por los metodos y atributos de la clase selección de futbol.
     */
    private int dorsal;
    private String posicionJugador;

    public Jugador(int id, int edad, String nombre, String apellido, String posicion, int dorsal) {
        super(id, edad, nombre, apellido);
        this.posicionJugador = posicion;
        this.dorsal = dorsal;
    }

    public Jugador(){} // contructor default

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void jugarPartido() {
        System.out.println("HOY ENTRAS DE TITULAR");
    }

    public void entrenar() {
        System.out.println("TE ESPERAN EN EL CAMPO DE ENTRENAMIENTO");
    }

}
