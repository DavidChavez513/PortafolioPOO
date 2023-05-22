import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas para el Triángulo de Pascal: ");
        int rows = sc.nextInt();

        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            triangle[i][i] = 1;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                if (i - j == 0){
                    System.out.print(triangle[i][j] + "b^" + j);
                } else if (j == 0){
                    System.out.print(triangle[i][j] + "a^" + (i - j) + "+");
                } else
                System.out.print(triangle[i][j] + "a^" + (i - j) + "b^" + j + " + ");
            }
            System.out.println();
        }
    }
}