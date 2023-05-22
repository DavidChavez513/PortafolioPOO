import java.util.Scanner;

public class Main {

    static EjemploDatosDelimitados exam = new EjemploDatosDelimitados();
    //static ClaseDefinida claseDefinida = new ClaseDefinida();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        try {
            exam.metodoDefault();
            //claseDefinida.setEdad(scan.nextInt());
        } catch (Exception exception) {
            System.out.println(exception);
        }

        System.out.println("Hello world!");
    }
}
