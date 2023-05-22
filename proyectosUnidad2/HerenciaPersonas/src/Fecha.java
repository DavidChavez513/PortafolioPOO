class Fecha {
    private int dia = 0;
    private int mes = 0;
    private int anio = 0;

    public Fecha() {

    }

    public Fecha(int d, int m, int y) {
        this.dia = d;
        this.mes = m;
        this.anio = y;
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

    public Fecha DesglozaFecha(String fecha) {

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
        return getDia() + "/" + getMes() + "/" + getAnio();
    }

    public String toString(String format) {

        if (format == "y-m-d") {
            return getAnio() + "-" + getMes() + "-" + getDia();

        } else {
            return getDia() + "/" + getMes() + "/" + getAnio();
        }

    }

}

