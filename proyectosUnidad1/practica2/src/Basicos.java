import java.lang.Math;
import java.text.DecimalFormat;

public class Basicos {
    static final double PI = 3.141592654;
    static final float TASA_INTERES = .018F;
    static final float INCREMENTO = .5F;
    static final int PERIODO = 12;
    static final float ISR = .3F;
    static final int SIZE_PROM = 5;

    static DecimalFormat df = new DecimalFormat("#.##");


    private double area, promedio, totalPago, grados, interesAPagar;
    private double mts, cm, km, ft, inch;
    private int dias, min, hrs;
    private double precioGas, gastoTotal, tiempo;
    private double[] hrsMin = new double[2];
    private double[] calficaciones = new double[SIZE_PROM];

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public double[] getCalficaciones() {
        return calficaciones;
    }

    public void setCalficaciones(double calficaciones, int index) {
        this.calficaciones[index] = calficaciones;
    }

    public double[] getHrsMin() {
        return hrsMin;
    }

    public void setHrsMin(double hrsMin, int index) {
        this.hrsMin[index] = hrsMin;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getInteresAPagar() {
        return interesAPagar;
    }

    public void setInteresAPagar(double interesAPagar) {
        this.interesAPagar = interesAPagar;
    }

    public double getMts() {
        return mts;
    }

    public void setMts(double mts) {
        this.mts = mts;
    }

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getFt() {
        return ft;
    }

    public void setFt(double ft) {
        this.ft = ft;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public double getPrecioGas() {
        return precioGas;
    }

    public void setPrecioGas(double precioGas) {
        this.precioGas = precioGas;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }


    public void menu(){
        System.out.println("---------- MENÚ PRINCIPAL -----------");
        System.out.println("1.- CALCULAR AREA TRINAGULO");
        System.out.println("2.- CALCULAR AREA CIRCULO");
        System.out.println("3.- CONVERTIR TEMPERATURA C° A F°");
        System.out.println("4.- CALCULAR INTERÉS CREDITICIO");
        System.out.println("5.- CALCULAR SALARIO NETO");
        System.out.println("6.- CALCULAR SALARIO HORAS EXTRAS");
        System.out.println("7.- CONVERTIR MEDIDAS");
        System.out.println("8.- CALCULAR GASTO DE VIAJE");
        System.out.println("9.- PROMEDIAR CALIFICACIONES");
        System.out.println("10.- CONVERTIR MINUTOS A DIAS:HRS:MINUTOS");
        System.out.println("0.- SALIR");
    }

    public double calcularAreaTriangulo(double base, double altura){
        setArea((base * altura) / 2);
        return getArea();
    }

    public double calcularAreaCirculo(double radio){
        setArea(PI*Math.pow(radio, 2));
        return getArea();
    }

    public double convertirTemperatura(){
        setGrados((getGrados() * (9/5)) + 32);
        return getGrados();
    }

    public String promediarMaterias() {

        double[] calificaciones = getCalficaciones();
        double suma = 0;

        for (int i = 0; i < getCalficaciones().length; i++){
            suma = suma + calificaciones[i];
        }

        setPromedio(suma / getCalficaciones().length);


        return "Tu promedio es: " + getPromedio();
    }

    public String calcularInteres(double cantidad) {

        try {
            double interesAPagar = cantidad * TASA_INTERES;
            double interes = interesAPagar / PERIODO;
            double totalAPagar = cantidad + interesAPagar;
            double totalMensual = totalAPagar / PERIODO;

            return "Tu total a pagar será: " + df.format(totalAPagar) + "\nTu interés a pagar por el credito será: " + df.format(interesAPagar) + "\nPagando un interes mensual de: " + df.format(interes) + "\nCon mensualidades de: " + df.format(totalMensual);
        } catch (Exception except) {
            return String.valueOf(except);
        }
    }

    public String calcularPagoNeto(double hrsTrabjadas, double tarifa){

        double sueldo = 0, impuesto = 0, sueldoNeto = 0, incremento = 0;

        if (hrsTrabjadas > 40){
            sueldo = hrsTrabjadas * 40;
            incremento = tarifa * INCREMENTO;
            sueldo = sueldo + incremento;

            impuesto = sueldo * ISR;

            sueldoNeto = sueldo - impuesto;

        } else {
            sueldo = hrsTrabjadas * tarifa;
            impuesto = sueldo * ISR;
            sueldoNeto = sueldo - impuesto;
        }

        return "Tu sueldo neto es: " + df.format(sueldoNeto) + ".MXN" + "\n" +
                " Su desgloce es el siguiente\n\n" +
                "Sueldo: " + df.format(sueldo) + "\n" +
                "Descuento impuestos:" + df.format(impuesto);
    }

    public double calcularTiemposExtra(double hrsTrabjadas, double tarifa){
        double sueldo = 0, incremento = 0;

        if (hrsTrabjadas > 40){
            sueldo = hrsTrabjadas * 40;
            incremento = tarifa * INCREMENTO;
            sueldo = sueldo + incremento;
            //impuesto = sueldo * ISR;
            //sueldoNeto = sueldo - impuesto;
        } else {
            sueldo = hrsTrabjadas * tarifa;
            //impuesto = sueldo * ISR;
            //sueldoNeto = sueldo - impuesto;
        }
        return sueldo;
    }

    public String convertirMedidas(){
        setCm(getMts() * (100));
        setKm(getMts() / 100);
        setFt(getCm() / 30.48);
        setInch(getCm() / 2.54);

        String response = "Las conversiones de metros a cm: " + df.format(getCm()) + "\n" +
                "La conversion de metros a km: " + df.format(getKm()) + "\n" +
                "La conversion de metros a pies(ft): " + df.format(getFt()) + "\n" +
                "La conversion de metros a pulgadas(inch): " + df.format(getInch());

        return response;
    }

    public String calcularCostosTiempo(){
        double ltsGas, kmLts, costoKmLts,
                kmLts100, hrsToMinutos, velocidad,
                gastoCada100, speedMtsSeg, tiempoHrs;

        ltsGas = getGastoTotal() / getPrecioGas();

        kmLts = getKm() / ltsGas;
        costoKmLts = kmLts / getPrecioGas();
        kmLts100 = kmLts * 100; // CONSUMO POR CADA 100 KM
        gastoCada100 = (kmLts100 / getPrecioGas()) * 100; // GASTO POR CADA 100 KM
        // Revisado y correcto

        double[] hrsMinFinal = getHrsMin();
        hrsToMinutos = (hrsMinFinal[1] / 60);
        tiempoHrs = (hrsToMinutos +  (double) hrsMinFinal[0]);
        //System.out.println(tiempoHrs);
        velocidad = getKm() / tiempoHrs;
        speedMtsSeg = (getKm() * 1000) / (hrsMinFinal[0] * 3600);



        String response = "El rendimiento de tu combustible es: " + df.format(kmLts) + " \n" +
                "El rendimiento de tu combustible cada 100km es: " + df.format(kmLts100) + " \n" +
                "El costo por km recorrido es: " + df.format(costoKmLts) + " \n" +
                "El costo por cada 100km recorrido es: " + df.format(gastoCada100) + " \n" +
                "Tu velocidad promedio en km/hrs: " + df.format(velocidad) + " \n" +
                "Tu velocidad promedio en mts/seg: " + df.format(speedMtsSeg) + " \n";
        return response;
    }
    public String calcularDiasHrsMin() {

        setDias((int) (this.tiempo / 1440));
        setMin((int) (this.tiempo % 1440));
        setHrs(getMin() / 60);
        setMin(getMin() % 60);

        return "Tienes " + getDias() + ":" + getHrs() + ":" + getMin() + "\n\n FORMATO DIAS:HORAS:MINUTOS";
    }

}
