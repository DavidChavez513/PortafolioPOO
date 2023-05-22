import javax.naming.Context;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arrayNumeros = new int[10];
        boolean salir = false, cambiarValor = true;
        String opc = "";
        Scanner scanner = new Scanner(System.in);


        int pos = 0, val = 0;

        do {

            try {

                if (val != 0) {
                    System.out.println("Desea cambiar el valor a guardar: \n VALOR ACTUAL : " + val);
                    System.out.println("Decida con Si o No ");
                    opc = scanner.next();

                    if (opc.toUpperCase().equals("SI")){
                        cambiarValor = true;
                    } else {
                        cambiarValor = false;
                    }

                }

                if (cambiarValor) {
                    System.out.println("Ingresa el valor a guardar.");
                    val = scanner.nextInt();
                }

                System.out.println("Ingresa la posicion donde quieres ingresar el numero, pon -1 para salir");
                pos = scanner.nextInt();
                if (pos == -1) {
                    break;
                }

                arrayNumeros[pos - 1] = val;

                if ((pos != -1 || pos > -1) && pos < arrayNumeros.length) {
                    if (opc.toUpperCase().equals("SI")) {
                        cambiarValor = true;
                        val = 0;
                    } else {
                        cambiarValor = false;
                    }
                    pos = 0;
                }

            } catch (InputMismatchException errInput){
                System.out.println("Ingresa un entero ======== Error al ingresar datos");
                if (pos != -1 && (pos > arrayNumeros.length || pos < -1) ) {
                    System.out.println("\n Además posición del arreglo invalida");
                }

            } catch (IndexOutOfBoundsException errOutBounds){
                System.out.println("INGRESA UN VALOR ENTERO POSITIVO LA POSICION. Error: " + errOutBounds.getMessage());
            } catch (Exception err) {
                throw err;
            } finally {
                scanner.nextLine();
            }
        } while (salir == false);

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Vector: pos[" + (i + 1) + "] : val => " + arrayNumeros[i]);
        }
    }
}