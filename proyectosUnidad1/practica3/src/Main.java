import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Condicionales condi = new Condicionales();
    static boolean salir = false;
    static int opc;

    public static void main(String[] args) {


        double hrsTrabajadas, tarifa;

        do {

            condi.menu();
            opc = scan.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Ingresa tu edad");
                    condi.setEdad(scan.nextInt());

                    System.out.println(condi.checarSiMayorEdad());
                    break;
                case 2:
                    System.out.println("Ingresa tu edad");
                    condi.setEdad(scan.nextInt());

                    System.out.println(condi.checarEtapaDeVida());

                    break;
                case 3:

                    for (int i = 0; i < condi.getNumeros().length; i++){
                        System.out.println("Ingresa el numero " + (i + 1));
                        condi.setNumeros(scan.nextInt(), i);
                    }
                    System.out.println(condi.determinarMayor());

                    break;
                case 4:
                    System.out.println("Ingresa un numero");
                    condi.setNum(scan.nextInt());

                    System.out.println(condi.determinarPositivoNegativo());

                    break;
                case 5:
                    System.out.println("Ingresa un numero");
                    condi.setNum(scan.nextInt());

                    System.out.println(condi.determinarParImpar());

                    break;
                case 6:
                    System.out.println("Ingresa un la categoría de tu puesto");
                    condi.setCat(scan.nextInt());
                    System.out.println("Ingresa tu salario actual");
                    condi.setSalario(scan.nextDouble());

                    System.out.println(condi.calcularIncrementoSalario());
                    break;
                case 7:

                    String sexoLocal, naciLocal;

                    System.out.println("Ingresa tu edad");
                    condi.setEdad(scan.nextInt());

                    System.out.println("Ingresa tu nacionalidad como en el sigiuente ejemplo: *   MEXICANA  *");
                    do {
                        naciLocal = scan.nextLine();
                    } while (naciLocal.length() == 0);

                    System.out.println("Ingresa tu sexo biologico como en el sigiuente ejemplo: *   MASCULINO  *");
                    do {
                        sexoLocal = scan.nextLine();
                    } while (sexoLocal.length() == 0);

                    condi.setNacionalidad(naciLocal);
                    condi.setSexo(sexoLocal);


                    System.out.println(condi.checarServicio());
                    break;
                case 8:
                    System.out.println("Ingresa tu precio de venta");
                    condi.setPrecio(scan.nextDouble());

                    System.out.println(condi.tomarComision());

                    break;
                case 9:
                    StringBuffer sf = new StringBuffer();
                    sf.append("Ingresa un la categoría de tu puesto segun la tabla: \n")
                            .append("1.- SINDICALIZADO")
                            .append("\n2.- CONFIANZA")
                            .append("\n3.- ALTO DIRECTIVO")
                            .append("\n4.- EJECUTIVO");
                    System.out.println(sf);
                    condi.setCat(scan.nextInt());
                    System.out.println("Ingresa tu salario actual");
                    condi.setSalario(scan.nextDouble());

                    System.out.println(condi.checarAumentos());
                    break;
                case 10:
                    System.out.println("Ingresa un numero");
                    condi.setNum(scan.nextInt());

                    System.out.println(condi.calcularFunciones());

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