public class Basicos {
    static final int SIZE_ARR = 25;
    static final int SIZE_ARR_PELIS = 3;

    static final int SIZE_ARR_CALIFICACIONES = 3;


    private double result, calificacion;
    private int num;
    private int dias, minutos, hrs, minutosTotales, arreSizeUser;
    private double calificaciones[] = new double[SIZE_ARR_CALIFICACIONES];
    private double precios[] = new double[SIZE_ARR_PELIS];
    public void setCalificaciones(double calificacion, int index) {
        this.calificaciones[index] = calificacion;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public int getNum() {
        return num;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int segundos) {
        this.hrs = segundos;
    }

    public int getMinutosIngresados() {
        return minutosTotales;
    }
    public void setMinutosIngresados(int minutosIngresados) {
        this.minutosTotales = minutosIngresados;
    }

    public void setPrecios(double precio, int index) {
        this.precios[index] = precio;
    }

    public double[] getCalificaciones() {
        return this.calificaciones;
    }

    public int getSizeArrCalificaciones() {
        return SIZE_ARR_CALIFICACIONES;
    }

    public int getSizeArrPelis() {
        return SIZE_ARR_PELIS;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getArreSizeUser() {
        return this.arreSizeUser;
    }

    public void setArreSizeUser(int arreSizeUser) {
        this.arreSizeUser = arreSizeUser;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double calcularPrecioPeliculas() {
        double[] precios = getPrecios();
        if (precios[0] > precios[1] && precios[0] > precios[2]) {
            setResult(precios[1] + precios[2]);
        } else if (precios[0] < precios[1] && precios[1] > precios[2]) {
            setResult(precios[0] + precios[2]);
        } else {
            setResult(precios[0] + precios[1]);
        }
        return getResult();
    }

    private double[] getPrecios() {
        return this.precios;
    }

    public void menu() {
        System.out.println("=========== Bienvenido al menú de mi programa basicos ==============");
        System.out.println("1.- Calcular precio del videoclub");
        System.out.println("2.- Mostrar calificacion aprobatoria/reprobada");
        System.out.println("3.- Conversión de calificación de sistema numerico a notación por letra");
        System.out.println("4.- Calcular horas extras de un trabajador");
        System.out.println("5.- Calcular dias, minutos y horas");
        System.out.println("6.- Obtener tamaño de un arreglo e imprimirlo al revés");
        System.out.println("7.- Promedia elementos de un arreglo");
        System.out.println("8.- Sumatoria de multiplos de 5");
        System.out.println("9.- Factorial de un numero");
        System.out.println("10.- Muestra los impares");
        System.out.println("11.- SALIR");
    }

    public String promediarCalificacion() {

        double[] calificaciones = getCalificaciones();


        double sumCalif = 0;
        double result = 0;

        for (int i = 0; i < SIZE_ARR_CALIFICACIONES; i++) {
            double calificacion = calificaciones[i];
            sumCalif = sumCalif + calificacion;
        }
        result = sumCalif / SIZE_ARR_CALIFICACIONES;

        if (result >= 70) {
            return "APROBADO, TU PROMEDIO FUE:" + result;
        } else {
            return "REPROBADO, TU PROMEDIO FUE:" + result;
        }
    }

    public String convertirCalificacion() {
        if (this.calificacion <= 20 && this.calificacion >= 19) {
            return "A";
        } else if (this.calificacion >= 16 && this.calificacion <= 18) {
            return "B";
        } else if (this.calificacion >= 13 && this.calificacion <= 15) {
            return "C";
        } else if (this.calificacion >= 10 && this.calificacion <= 12) {
            return "D";
        } else if (this.calificacion >= 1 && this.calificacion <= 10) {
            return "E";
        } else {
            return "INGRESA RANGO VALIDO";
        }
    }

    public double calcularPagoTotal(double hrsTrabajadas, double tarifa) {
        double aumento = 0, sueldo;
        if (hrsTrabajadas < 40) {
            sueldo = tarifa * hrsTrabajadas;
        } else {
            sueldo = tarifa * 40;
        }


        float hrsExtra = (float) hrsTrabajadas - 40;

        if (hrsTrabajadas >= 40) {
            aumento = tarifa * 1.5;
            setResult(sueldo + (aumento * hrsExtra));
        } else {
            setResult(sueldo);
        }
        return this.result;
    }

    public String calcularDiasHrsMin() {

        setDias(this.minutosTotales / 1440);
        setMinutos(this.minutosTotales % 1440);
        setHrs(getMinutos() / 60);
        setMinutos(getMinutos() % 60);




        return "Tienes " + getDias() + " días con " + getHrs() + " horas y " + getMinutos() + " minutos";
    }


    public int[] createArr(int SIZE){
        return new int[SIZE];
    }

    public double promediarArreglo(int[] arr){
        double suma = 0, prome;
        for (int i = 0; i < getArreSizeUser(); i++){
            suma = suma + arr[i];
        }

        prome = suma / getArreSizeUser();

        return prome;
    }

    public void showArray(int[] arrViewer){
        for (int i = getArreSizeUser() - 1; i >= 0; i--){
            System.out.println(arrViewer[i]);
        }
    }

    public void calcularMultiploDe5(){
        int sumatoria = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println("ESTE NUMERO ES MULTIPLO DE 5: " + i);
                sumatoria = sumatoria + i;
            }
        }

        System.out.println("LA SUMA DE TODOS LOS MULTIPLOS ENTRE EL 1 Y EL 100 ES: " + sumatoria);

    }

    public long calcularFactorial(){
        long factorial = 1;
        System.out.println(getNum());
        for (int i = getNum(); i >= 1; i--){
            factorial = factorial * i;
        }

        return factorial;
    }

    public long calcularFactorial(int num){
        long factorial = 1;
        System.out.println(getNum());
        for (int i = 1; i <= num; i++){
            factorial*= i;
        }

        return factorial;
    }

    public double calcularEuler(){

        double euler = 0, eulerExp = 0;

        for (int i = 0; i <= getNum(); i++){
            euler = (Math.pow(getNum(), i) / calcularFactorial(i));
            System.out.println("Valor Potencia: " + Math.pow(getNum(), i) + "\nValor Factorial: " + calcularFactorial(i) +
                    "\n Valor Euler: " + euler +
                    "\n\nCon esta data: \n Numero a potencia ["+ getNum() +"^"+ i + "]\n entre: " + i + "!");

            eulerExp += euler;

        }

        return eulerExp;
    }

    public void mostrarImpares(){
        for (int i = 0; i <= getNum(); i++){
            if (i % 2 != 0){
                System.out.println("ESTE NUMERO ES IMPAR: " + i );
            }
        }
    }
}
