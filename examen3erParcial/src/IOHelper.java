import java.io.*;

public class IOHelper {
    private String entrada;
    private File archivoEntrada = new File("entrada.txt");
    private File archivoSalida = new File("salida.txt");

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void escribirArchivo() {
        FileWriter fw = null;

        if (!entrada.equals("")){
            try {
                fw = new FileWriter(archivoEntrada, true);
                fw.write(entrada + "\n");
            } catch (IOException e) {
                System.out.println("Error al escribir el archivo" + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error al escribir el archivo" + e.getMessage());
            } finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo" + e.getMessage());
                }
            }
        } else {
            System.out.println("No se ha ingresado nada");
        }
    }

    public void escribirArchivo(String nuevaLinea) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(archivoSalida, true);
            fw.write(nuevaLinea + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo" + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo" + e.getMessage());
            }
        }

    }

    public void calcularPalabras() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(archivoEntrada);
            br = new BufferedReader(fr);

            String linea = br.readLine();

            int contarVocal = 0;


            while (linea != null) {
                // Proceso para lectura del archivo
                linea.toLowerCase();

                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) == 'a' || linea.charAt(i) == 'e' || linea.charAt(i) == 'i' || linea.charAt(i) == 'o'
                            || linea.charAt(i) == 'u') {
                        contarVocal++;
                    }
                }

                if (contarVocal % 2 == 0) {
                    escribirArchivo(linea + ": Tiene " + contarVocal + " vocales");
                } else {
                    escribirArchivo(linea + ": Tiene " + contarVocal + " vocales y el factorial de " + contarVocal + " es: " + factorial(contarVocal));
                }
                linea = br.readLine();
                contarVocal = 0;
            }

            System.out.println("Se ha terminado de leer el archivo puedes revisar la salida en el archivo salida.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public StringBuffer factorial(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(n);
        for (int i = n - 1; i > 0; i--) {
            sb.append(" * " + i);
            n = n * i;
        }
        return sb.append(" = " + n);
    }

}