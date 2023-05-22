import java.awt.desktop.ScreenSleepEvent;

public class Ciclos {

    private int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void menu() {
        StringBuffer sf = new StringBuffer();

        sf.append("=============== MENU PRINCIPAL ======================")
                .append("\n1.- Sumar numeros del 1 al 10")
                .append("\n2.- Sumar multiplos de 5 del 1 al 100")
                .append("\n3.- Imprime una tabla de multiplicar")
                .append("\n4.- Imprimir los numeros primos")
                .append("\n5.- Factorial de un numero")
                .append("\n6.- Imprimir numeros impares")
                .append("\n7.- ¿Es un numero perfecto?")
                .append("\n8.- ¿Son numeros amigos?")
                .append("\n9.- Elevar numero a una potencia P")
                .append("\n10.- Calcular la formula de Taylor")
                .append("\n0.- SALIR");

        System.out.println(sf);
    }

    protected int sumarNumeros(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                suma += i;
        }
        return suma;
    }

    public void calcularDel1al10() {
        int sumar = 0;
        for (int i = 1; i <= 10; i++) {
            sumar += i;
        }
        System.out.println("La suma del 1 al 10 es: " + sumar);
    }

    public void calcularMultiplosDe5() {
        int sumar = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                sumar += i;
        }

        System.out.println("La suma del 1 al 100 de los multiplos de 5 es: " + sumar);
    }

    public void calcularTablasMultiplicar() {
        for (int i = 1; i <= getNum1(); i++) {
            System.out.println(getNum1() + " * " + i + " = " + (getNum1() * i));
        }
    }

    public void mostrarNumerosPrimos() {
        int contador = 0, numero = 2, encontrados = 0;

        while (encontrados < getNum1()) {
            for (int div = 1; div <= numero; div++) {

                //System.out.println("Tu cociente es de " + (double) (numero / div));
                //System.out.println("Tu residuo es de " + (double) (numero % div));

                if (numero % div == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                encontrados++;
                System.out.println("El numero " + numero + " Es un numero primo");
            }
            contador = 0;
            numero++;
        }

    }

    public long calcularFactorial() {
        long factorial = 1;
        //System.out.println(getNum1());
        for (int i = 1; i <= getNum1(); i++) {
            factorial *= i;
        }

        return factorial;
    }

    public long calcularFactorial(int num) {
        long factorial = 1;
        //System.out.println(getNum1());
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }


    public double calcularEuler() {

        double euler = 0, eulerExp = 0;

        for (int i = 0; i <= getNum1(); i++) {
            euler = (Math.pow(getNum1(), i) / calcularFactorial(i));
            System.out.println("Valor Potencia: " + Math.pow(getNum1(), i) + "\nValor Factorial: " + calcularFactorial(i) +
                    "\n Valor Euler: " + euler +
                    "\n\nCon esta data: \n Numero a potencia [" + getNum1() + "^" + i + "]\n entre: " + i + "!");

            eulerExp += euler;

        }

        return eulerExp;
    }

    public void mostrarImpares() {
        for (int i = 0; i <= getNum1(); i++) {
            if (i % 2 != 0) {
                System.out.println("ESTE NUMERO ES IMPAR: " + i);
            }
        }
    }

    public String calcularNumeroPerfecto() {
        if (sumarNumeros(getNum1()) == getNum1()) {
            return "Este numero es perfecto";
        } else {
            return "Este numero NO es perfecto";
        }
    }

    public String calcularNumerosAmigos() {
        if (sumarNumeros(getNum1()) == getNum2() && sumarNumeros(getNum2()) == getNum1()) {
            return "Estos numeros son amigos";
        } else {
            return "Estos numeros NO son amigos";
        }
    }

    public void elevarPotencias() {
        for (int i = 1; i <= getNum2(); i++) {
            System.out.println("Tu numero " + getNum1() + "^" + i + " es " + Math.pow(getNum1(), i));
        }
    }
}
