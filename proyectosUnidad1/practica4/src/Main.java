import java.util.Scanner;
public class Main {
    static int opc = 0;
    static boolean salir = false;

    static Ciclos basic = new Ciclos();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            basic.menu();
            opc = scan.nextInt();

            switch (opc) {
                case 1:

                    basic.calcularDel1al10();

                    break;

                case 2:

                    basic.calcularMultiplosDe5();

                    break;

                case 3:

                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());

                    basic.calcularTablasMultiplicar();

                    break;

                case 4:
                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());

                    basic.mostrarNumerosPrimos();
                    break;

                case 5:
                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());

                    System.out.println(basic.calcularFactorial());
                    break;
                case 6:
                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());

                    basic.mostrarImpares();
                    break;

                case 7:
                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());

                    System.out.println(basic.calcularNumeroPerfecto());
                    break;
                case 8:
                    System.out.println("Ingresa un numero");
                    basic.setNum1(scan.nextInt());
                    System.out.println("Ingresa otro numero");
                    basic.setNum2(scan.nextInt());

                    System.out.println(basic.calcularNumerosAmigos());
                    break;
                case 9:
                    System.out.println("Ingresa el numero a potenciar");
                    basic.setNum1(scan.nextInt());

                    System.out.println("Ingresa la potencia deseada");
                    basic.setNum2(scan.nextInt());

                    basic.elevarPotencias();
                    break;

                case 10:
                    System.out.println("Ingresa tu numero para elevar e");
                    basic.setNum1(scan.nextInt());
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