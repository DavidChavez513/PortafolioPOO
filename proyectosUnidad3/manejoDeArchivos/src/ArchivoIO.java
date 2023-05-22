import java.io.*;

public class ArchivoIO {

    public static void main(String[] args) {
        // TODO code application logic here

        File fileInput = new File("entrada.txt"), fileOutput = new File("salida.txt");
        FileReader fr = null;
        FileWriter fw = null;

        BufferedReader br = null;
        PrintWriter pw = null;

        try {

            fr = new FileReader(fileInput);
            fw = new FileWriter(fileOutput);
            br = new BufferedReader(fr);
            pw = new PrintWriter(fw);

            String line = br.readLine();


            while (line != null) {

                int num = Integer.parseInt(line);
                int factorial = factorial(num);
                System.out.println(line);
                pw.println(factorial);
                line = br.readLine();
            }
            pw.close();
            fr.close();

            System.out.println("Finished writing file");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("Finished writing file");
        }
    }

    private static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return (int) resultado;
        }
    }

}
