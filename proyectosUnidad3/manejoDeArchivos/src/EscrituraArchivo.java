import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivo {

    public static void main(String[] args) {
        // TODO code application logic here

        File file = new File("database.txt");
        FileWriter fr = null;

        try {
            fr = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fr);

            for (int i = 0; i < 20; i++) {
                pw.println("Line " + i);
                System.out.println("Line " + i);
            }

            pw.close();
            fr.close();

            System.out.println("Finished writing file");

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

}
