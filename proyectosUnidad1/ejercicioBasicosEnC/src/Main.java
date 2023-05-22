import java.util.Scanner;
public class Main {
    static int opc = 0;
    static boolean salir = false;

    static Basicos basic = new Basicos();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            basic.menu();
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    for (int i = 0; i < basic.getSizeArrPelis(); i++) {
                        System.out.println("Ingresa el precio de tu " + (i + 1) + " película");
                        basic.setPrecios(scan.nextDouble(), i);
                    }

                    System.out.println("Tu total a pagar es: " + basic.calcularPrecioPeliculas());

                    break;

                case 2:
                    for (int i = 0; i < basic.getSizeArrCalificaciones(); i++) {
                        System.out.println("Ingresa tu " + (i + 1) + " calificacion");
                        basic.setCalificaciones(scan.nextDouble(), i);
                    }

                    System.out.println(basic.promediarCalificacion());

                    break;

                case 3:

                    do {
                        System.out.println("Ingresa tu promedio o calificación");
                        basic.setCalificacion(scan.nextDouble());
                        System.out.println(basic.convertirCalificacion());
                    } while (basic.convertirCalificacion() == "INGRESA RANGO VALIDO");

                    break;

                case 4:
                    double hrsTrabajadas, tarifa;

                    System.out.println("Ingresa tus horas trabajadas");
                    hrsTrabajadas = scan.nextDouble();
                    System.out.println("Ingresa la tarifa por hora");
                    tarifa = scan.nextDouble();

                    System.out.println("Tu pago total de esta semana será: " + basic.calcularPagoTotal(hrsTrabajadas, tarifa));
                    break;

                case 5:
                    System.out.println("Ingresa tu cantidad en minutos");
                    basic.setMinutosIngresados(scan.nextInt());
                    System.out.println(basic.calcularDiasHrsMin());
                    break;
                case 6:
                    System.out.println("Ingresa el tamaño de tu array");
                    basic.setArreSizeUser(scan.nextInt());

                    int[] arrUser = basic.createArr(basic.getArreSizeUser());

                    for (int i = 0; i < basic.getArreSizeUser(); i++) {
                        System.out.println("INGRESA EL VALOR " + (i) + ":");
                        arrUser[i] = scan.nextInt();
                    }

                    basic.showArray(arrUser);
                    break;

                case 7:
                    System.out.println("Ingresa el tamaño de tu array");
                    basic.setArreSizeUser(scan.nextInt());


                    int[] arrProm = basic.createArr(basic.getArreSizeUser());

                    for (int i = 0; i < basic.getArreSizeUser(); i++) {
                        System.out.println("INGRESA EL VALOR " + (i) + ":");
                        arrProm[i] = scan.nextInt();
                    }

                    System.out.println(basic.promediarArreglo(arrProm));

                    break;
                case 8:
                    basic.calcularMultiploDe5();
                    break;
                case 9:
                    System.out.println("Ingresa el numero para sacar su factorial");
                    basic.setNum(scan.nextInt());

                    System.out.println(basic.calcularFactorial());
                    break;
                case 10:
                    System.out.println("Ingresa un numero");
                    basic.setNum(scan.nextInt());

                    basic.mostrarImpares();

                    break;


                case 11:

                    System.out.println("Ingresa tu numero para elevar e");
                    basic.setNum(scan.nextInt());

                    System.out.println(basic.calcularEuler());

                    break;

                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Ingresa una opción correcta");
            }
        } while (salir == false);

    }

}