import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IOHelper ioHelper = new IOHelper();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opc = 0;

        do {
            System.out.println("1. Ingresa una linea al archivo");
            System.out.println("2. Calcular");
            System.out.println("0. Salir");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:

                    System.out.println("Ingresa una linea al archivo");

                    String entrada = "";

                    try {
                        entrada = sc.nextLine();

                    } catch (Exception e) {
                        System.out.println("Error al leer la entrada" + e.getMessage());
                    } finally {
                        ioHelper.setEntrada(entrada);
                    }

                    ioHelper.escribirArchivo();
                    break;

                case 2:
                    System.out.println("PUEDES REVISAR LA SALIDA DEL CALCULO EN EL ARCHIVO salida.txt");
                    ioHelper.calcularPalabras();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (salir != true);

    }
}