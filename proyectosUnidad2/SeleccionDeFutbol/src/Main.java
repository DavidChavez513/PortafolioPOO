import java.util.ArrayList;

public class Main {

    public static ArrayList<SeleccionFutbol> personal = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        Entrenador dirTec = new Entrenador(1234569, 50, "Guillermo",
                "Almada", "DIRECTOR TECNICO", 1253565);
        Jugador jugador = new Jugador(290123, 22, "Humberto",
                "Suazo", "DEFENSA CENTRAL", 4);
        Masajista fisioMasajista = new Masajista(1234568978, 35, "Alan", "Rodriguez",
                "TERAPIA DEPORTIVA Y RELAJACION MUSCULAR", 7);

        personal.add(dirTec);
        personal.add(jugador);
        personal.add(fisioMasajista);
        //Empiezo en 0
        for (SeleccionFutbol staff : personal) {
            // Ok, la posicion 0 es entrenador, pero solo puedo acceder a 
            // los metodos de Seleccion futbol
            StringBuffer sf = new StringBuffer("El nombre del empleado es: \n");
            System.out.println(sf
                    .append(staff.getNombre())
                    .append(" " + staff.getApellido())
                    .append(", id: " + staff.getIdPersonal()));

            System.out.println("USTEDE DEBE: ");
            staff.concentrarse();
            staff.viajar();
        }

        System.out.println(dirTec.getNombre() + " " + dirTec.getApellido() + " debe ");
        dirTec.dirigirPartido();
        System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " debe ");
        jugador.jugarPartido();

        System.out.println(fisioMasajista.getNombre() + " " + fisioMasajista.getApellido() + " Debe");
        fisioMasajista.darMasaje();
        System.out.println("A " + jugador.getNombre() + " " + jugador.getApellido());

    }
}