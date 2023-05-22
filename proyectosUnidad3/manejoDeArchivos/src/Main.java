import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {



    public static void main(String[] args) {
        File file = new File("database.txt");
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Finished reading file");
        }

    }
}