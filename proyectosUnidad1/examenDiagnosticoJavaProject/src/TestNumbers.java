import java.util.Scanner;

public class TestNumbers {
    static Number processNumbers = new Number();
    static long result;
    static final int SIZE_ARRAY = 3;
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        processNumbers.setNum1(scanNumber());
        processNumbers.setNum2(scanNumber());
        processNumbers.setNum3(scanNumber());

        result = processNumbers.calcularNumero();

        System.out.println(result);

    }

    public static int scanNumber(){
        int num = 0;
        do {

            System.out.println("Dame un numero de 3 digitos: ");
            num = lector.nextInt();

        } while (num < 100 || num > 999);

        return num;
    }

}
