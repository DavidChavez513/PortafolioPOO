import java.util.Calendar;

class Fecha {
    private int dia = 0;
    private int mes = 0;
    private int anio = 0;
    private int hrs = 0, min = 0, seg = 0;

    public Fecha() {

    }

    public Fecha(int d, int m, int y) {
        this.dia = d;
        this.mes = m;
        this.anio = y;
    }

    public Fecha(int d, int m, int y, int h, int minu, int s) {
        this.dia = d;
        this.mes = m;
        this.anio = y;
        this.hrs = h;
        this.min = minu;
        this.seg = s;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha desglozaFecha(String fecha) {

        String[] arrFecha;
        int dia = 0, mes = 0, anio = 0;

        if (fecha.contains("/") == true) {
            arrFecha = fecha.split("/");

            for (String fechas : arrFecha) {
                if ((Integer.parseInt(fechas) <= 12) && mes == 0) {
                    mes = Integer.parseInt(fechas);
                } else if ((Integer.parseInt(fechas) <= 31 || Integer.parseInt(fechas) <= 30) && dia == 0) {
                    dia = Integer.parseInt(fechas);
                } else {
                    anio = Integer.parseInt(fechas);
                }
            }

        }
        return new Fecha(dia, mes, anio);
    }

    public String toString() {

        if (this.hrs != 0 && this.min != 0 && this.seg != 0){
            return getDia() + "/" + getMes() + "/" + getAnio() + " " + getHrs() + ":" + getMin() + ":" + getSeg();
        } else {
            return getDia() + "/" + getMes() + "/" + getAnio();
        }

    }

    public String toString(String format) {

        if (format == "y-m-d") {
            return getAnio() + "-" + getMes() + "-" + getDia();

        } else {
            return getDia() + "/" + getMes() + "/" + getAnio();
        }

    }

    public static Fecha getTimestamp() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        String fechaHora = dia + "/" + mes + "/" + anio + " " + hora + ":" + minuto + ":" + segundo;
        return new Fecha(dia, mes, anio, hora, minuto, segundo);
    }

    public Fecha getFecha(){
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);

        return new Fecha(dia, mes,anio);
    }

}

