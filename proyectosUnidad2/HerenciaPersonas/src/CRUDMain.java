import java.util.ArrayList;
import java.util.Scanner;

public class CRUDMain {

    private int dni;
    private String name;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public void menu() {
        StringBuffer sf = new StringBuffer();

        System.out.println(
                sf.append("MENU PRINCIPAL \n")
                        .append("1.- Agregar Empleado \n")
                        .append("2.- Agregar Estudiante \n")
                        .append("3.- Agregar Comision \n")
                        .append("4.- Buscar \n")
                        .append("5.- Terminar programa"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    boolean encontrar = false;

    public void buscarPersona(Scanner scan) {

        for (Persona persona : this.personas) {
            if (persona.getNombre().equals(getName())) {
                System.out.println("La persona buscada tiene los siguientes datos");
                StringBuffer sf = new StringBuffer();

                sf
                        .append("Nombre: " + persona.getNombre() + "\n")
                        .append("Matricula: " + persona.getDni() + "\n")
                        .append("Fecha de nacimiento: " + persona.getFechaNacimiento() + "\n");

                if (persona instanceof Estudiante) {
                    encontrar = true;

                    boolean salir = false;
                    int calif = 0, opc = 0;

                    StringBuffer sf2 = new StringBuffer();

                    sf2.append("MENÚ PARA Estudiantes \n")
                            .append("1.- Agregar Calificacion \n")
                            .append("2.- Mostrar Promedio \n")
                            .append("0.- Ir al menú principal");

                    do {
                        System.out.println(sf2);
                        opc = scan.nextInt();

                        switch (opc) {
                            case 1:

                                calif = 0;

                                System.out
                                        .println("Para terminar de agregar calificaciones, ingresa un numero negativo");

                                do {
                                    System.out.println("Agrega tu calificación: ");
                                    calif = scan.nextInt();
                                    ((Estudiante) persona).nuevaCalificacion(calif);

                                } while (calif >= 0);

                                break;

                            case 2:
                                sf.append("Promedio: " + ((Estudiante) persona).promediarCalificacion());
                                System.out.println(sf);
                                break;

                            default:
                                salir = true;
                                break;
                        }

                    } while (salir != true);

                    sf.append("\n Promedio: " + ((Estudiante) persona).getPuntuacionTotal());
                } else if (persona instanceof Comision) {

                    encontrar = true;

                    boolean salir = false;

                    int vta = 0, opc = 0;

                    StringBuffer sf2 = new StringBuffer();

                    sf2.append("MENÚ PARA COMISIONES \n")
                            .append("1.- Agregar venta \n")
                            .append("2.- Mostrar Sueldo \n")
                            .append("0.- Ir al menú principal");

                    do {

                        System.out.println(sf2);
                        opc = scan.nextInt();
                        switch (opc) {
                            case 1:

                                System.out
                                        .println("Para terminar de agregar ventas, ingresa un numero negativo");

                                do {
                                    System.out.println("Agrega total venta: ");
                                    vta = scan.nextInt();
                                    ((Comision) persona).vender(vta);

                                } while (vta >= 0);
                                break;

                            case 2:
                                sf.append("Sueldo: " + ((Comision) persona).getSueldo());
                                System.out.println(sf);
                                break;

                            default:
                                salir = true;
                                break;
                        }

                    } while (salir != true);

                } else if (persona instanceof Empleado) {
                    encontrar = true;
                    sf.append("\n Sueldo: " + ((Empleado) persona).getSueldoBase());
                }
                System.out.println(sf);
                if (encontrar) {
                    break;
                }

            } else {
                System.out.println("ESTA PERSONA NO EXISTE EN ESTE SISTEMA");
            }
        }
    }

    public void createPerson(Persona person) {
        this.personas.add(person);
    }

}
