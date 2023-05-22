import java.util.Scanner;

public class Main {

    static boolean salir = false;
    static int opc = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuffer menu= new StringBuffer("MENU PRINCIPAL \n")
                .append("1.- Circulo \n")
                .append("2.- Cuadrilateros regulares \n")
                .append("3.- Triangulo \n")
                .append("4.- Elipses \n")
                .append("0.- Salir");

        do {
            System.out.println(menu);
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    Circulo circulo = new Circulo();

                    System.out.println("Ingresa el radio del circulo");
                    circulo.setX(scan.nextDouble());

                    System.out.println(circulo.calcularArea());
                    System.out.println(circulo.calcularPerimetro());

                    break;
                case 2:
                    Cuadrilatero cuadrilatero = new Cuadrilatero();

                    System.out.println("Ingresa la base");
                    cuadrilatero.setX(scan.nextDouble());
                    System.out.println("Ingresa la altura");
                    cuadrilatero.setY(scan.nextDouble());

                    System.out.println(cuadrilatero.calcularArea());
                    System.out.println(cuadrilatero.calcularPerimetro());

                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();


                    System.out.println("Ingresa la base");
                    triangulo.setX(scan.nextDouble());
                    System.out.println("Ingresa la altura");
                    triangulo.setY(scan.nextDouble());

                    for (int i = 0; i < 3; i++){
                        System.out.println("Ingresa el valor de tu lado n. " + (i + 1));
                        triangulo.setLados(scan.nextDouble(), i);
                    }

                    System.out.println(triangulo.calcularArea());
                    System.out.println(triangulo.calcularPerimetro());

                    break;
                case 4:
                    Elipse elipse = new Elipse();

                    System.out.println("Ingresa la diagonal mayor");
                    elipse.setX(scan.nextDouble());
                    System.out.println("Ingresa la diagonal menor");
                    elipse.setY(scan.nextDouble());

                    System.out.println(elipse.calcularArea());
                    System.out.println(elipse.calcularPerimetro());
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }


        } while (salir != true);

    }
}