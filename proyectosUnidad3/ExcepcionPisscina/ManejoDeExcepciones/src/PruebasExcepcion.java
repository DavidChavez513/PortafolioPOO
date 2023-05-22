public class PruebasExcepcion {
    public void sacarExcepcion () {
        int numeros[] = new int[15];
        System.out.println("A ver ponlo en el 16 de 15 we");
        numeros[16] = 1;
    }

    public void sacarExcepcion (String a){
        int numeros[] = new int[15];
        try {
            System.out.println("A ver ponlo en el 16 de 15 we");
            numeros[16] = 1;

        } catch (ArrayIndexOutOfBoundsException exErr) {

            System.out.println("ERROR: Intentas asignar un numero fuera del valor del arreglo " + exErr.getMessage());
        }
    }

    public static void divisiones(){
        int numerosADividir[] = {0,1, 2,4,8,16,32,64,128,256,512};
        double denominadores;
        try {
            for (int i = 0; i <= numerosADividir.length; i++) {

                denominadores = i == 0 ? 0 : Math.random() * 3;
                try {
                    System.out.println("Division de " + numerosADividir[i] + "/" + (int) denominadores + " = " + (numerosADividir[i]/ (int) denominadores));
                } catch (ArithmeticException err) {
                    System.out.println("Ora we no se puede hacer " + err.getMessage());
                }
            }

        } catch (Exception err) {
            System.out.println("El error es: " + err.getMessage());
        } finally {
            System.out.println("ADIOS WE, YA NOS VAMOS");
        }

    }
}
