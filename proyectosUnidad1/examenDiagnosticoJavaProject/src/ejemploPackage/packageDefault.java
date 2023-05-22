package ejemploPackage;

import java.util.Scanner;

public class packageDefault {
    static Scanner scan = new Scanner(System.in);
    static ClaseDefinida classDefined = new ClaseDefinida();
    public static void main(String[] args) {

        classDefined.setEdad(scan.nextInt());

        System.out.println(classDefined.getEdad());
    }
}

