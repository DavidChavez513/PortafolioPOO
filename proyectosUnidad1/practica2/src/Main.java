import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Basicos basic = new Basicos();
    static boolean salir = false;
    static int opc;

    public static void main(String[] args) {


        double hrsTrabajadas, tarifa;

       do {

           basic.menu();
           opc = scan.nextInt();

           switch (opc){
               case 1:
                   double base, altura;
                   System.out.println("INGRESA LA BASE");
                   base = scan.nextDouble();

                   System.out.println("INGRESA LA ALTURA");
                   altura = scan.nextDouble();
                   System.out.println("El area de ese triangulo es: " + basic.calcularAreaTriangulo(base, altura));

                   break;
               case 2:
                   double radio;
                   System.out.println("INGRESA LA BASE");
                   radio = scan.nextDouble();
                   System.out.println("El area de ese triangulo es: " + basic.calcularAreaCirculo(radio));

                   break;
               case 3:
                    System.out.println("INGRESA TU TEMPERATURA EN GRADOS C°");
                    basic.setGrados(scan.nextDouble());

                    System.out.println(basic.convertirTemperatura());

                   break;
               case 4:
                   double cantidad = 0;

                   System.out.println("INGRESA LA CANTIDAD QUE QUIERES PEDIR: ");
                   cantidad = scan.nextDouble();

                   System.out.println(basic.calcularInteres(cantidad));

                   break;
               case 5:

                   System.out.println("Ingrese las horas que trabajó este mes:");
                   hrsTrabajadas = scan.nextDouble();

                   System.out.println("Ingrese la tarifa por hora:");
                   tarifa = scan.nextDouble();

                   System.out.println(basic.calcularPagoNeto(hrsTrabajadas, tarifa));
                   break;
               case 6:
                   System.out.println("Ingrese las horas que trabajó este mes:");
                   hrsTrabajadas = scan.nextDouble();

                   System.out.println("Ingrese la tarifa por hora:");
                   tarifa = scan.nextDouble();

                   System.out.println(basic.calcularTiemposExtra(hrsTrabajadas, tarifa));
                   break;
               case 7:
                   System.out.println("Ingresa los metros que quieras convertir");
                   basic.setMts(scan.nextDouble());
                   System.out.println(basic.convertirMedidas());
                   break;
               case 8:
                   System.out.println("Ingresa los km recorridos");
                   basic.setKm(scan.nextDouble());

                   System.out.println("Ingresa el tiempo tardado");
                   System.out.println("Ingresa las hrs");
                   basic.setHrsMin(scan.nextDouble(), 0);
                   System.out.println("Ingresa los minutos");
                   basic.setHrsMin(scan.nextDouble(), 1);

                   System.out.println("Ingresa el costo total de la gasolina");
                   basic.setGastoTotal(scan.nextDouble());
                   System.out.println("Ingresa el precio por listo de gasolina");
                   basic.setPrecioGas(scan.nextDouble());

                   System.out.println(basic.calcularCostosTiempo());

                   break;
               case 9:
                   for (int i = 0; i < basic.getCalficaciones().length; i++){
                       System.out.println("Ingresa la calificacion" + (i + 1));
                       basic.setCalficaciones(scan.nextDouble(), i);
                   }

                   System.out.println(basic.promediarMaterias());
                   break;
               case 10:
                   System.out.println("Ingresa tu tiempo en minutos");
                   basic.setTiempo(scan.nextDouble());

                   System.out.println(basic.calcularDiasHrsMin());

                   break;
               case 0:
                   salir = true;
                   break;
               default:
                   System.out.println("OPCION NO VALIDA");
                   break;
           }



       } while (salir == false);


    }
}