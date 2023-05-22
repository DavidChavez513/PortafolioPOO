import java.util.Scanner;

public class Main {

    static CRUDMain crudHelper = new CRUDMain();
    static int opc = 0;
    static boolean salir = false;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String fecha, nombre;
        int dni, sueldo;

        do {
            crudHelper.menu();
            opc = scan.nextInt();

            fecha = "";
            nombre = "";
            dni = 0;
            sueldo = 0;

            switch (opc) {
                case 1:

                    System.out.println("Ingresa el username: ");
                    // scan.next();
                    nombre = scan.next();
                    System.out.println("Ingresa la fecha: ========> DIA/MES/AÑO <============");
                    // scan.next();
                    fecha = scan.next();
                    System.out.println("Ingresa el numero de matricula: ");
                    dni = scan.nextInt();
                    System.out.println("Ingresa su salario base: ");
                    sueldo = scan.nextInt();

                    Empleado empleado = new Empleado(nombre, fecha, dni, sueldo);

                    crudHelper.createPerson(empleado);

                    break;
                case 2:
                    System.out.println("Ingresa el nombre: ");
                    nombre = scan.next();
                    System.out.println("Ingresa la fecha: ========> DIA/MES/AÑO <============");
                    fecha = scan.next();
                    System.out.println("Ingresa el numero de matricula: ");
                    dni = scan.nextInt();
                    Estudiante estudiante = new Estudiante(nombre, fecha, dni);
                    crudHelper.createPerson(estudiante);
                    break;
                case 3:

                    float perComiss = 0.0F;
                    System.out.println("Ingresa el nombre: ");
                    nombre = scan.next();
                    System.out.println("Ingresa la fecha: ========> DIA/MES/AÑO <============");
                    fecha = scan.next();
                    System.out.println("Ingresa el numero de matricula: ");
                    dni = scan.nextInt();
                    System.out.println("Ingresa el sueldo base: ");
                    sueldo = scan.nextInt();
                    System.out.println("Ingresa el porcentaje de comision: ");
                    perComiss = scan.nextFloat();
                    
                    Comision comision = new Comision(nombre, fecha, dni, sueldo, perComiss);
                    crudHelper.createPerson(comision);

                    break;
                case 4:

                    System.out.println("Ingresa el username del usuario");
                    crudHelper.setName(scan.next());
                    
                    // System.out.println(crudHelper.getName());

                    crudHelper.buscarPersona(scan);
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                    salir = true;
                    break;
                default:

                    System.out.println("OPCION NO DISPONIBLE");
                    break;
            }

        } while (salir != true);

    }
}