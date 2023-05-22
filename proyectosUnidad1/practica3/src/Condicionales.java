import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Condicionales {

    static final int SIZE_ARR = 3;
    static final float COMISION_3PER = .03F, COMISION_5PER = .05F;
    static final float INC_SINDI = .2F, INC_CONFI =.1F, INC_DIR = .05F, INC_EJE = .02F;
    static final DecimalFormat df = new DecimalFormat("#.##");

    private int edad, num;
    private float perIncrement;
    private double salario, precio;
    private int cat, opcNac, opcGen;
    private String nombre, nacionalidad, sexo;
    private double x, y;
    private int[] numeros = new int[SIZE_ARR];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPerIncrement() {
        return perIncrement;
    }

    public void setPerIncrement(float perIncrement) {
        this.perIncrement = perIncrement;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public int getOpcNac() {
        return opcNac;
    }

    public void setOpcNac(int opcNac) {
        this.opcNac = opcNac;
    }

    public int getOpcGen() {
        return opcGen;
    }

    public void setOpcGen(int opcGen) {
        this.opcGen = opcGen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros, int index) {
        this.numeros[index] = numeros;
    }

    public String checarSiMayorEdad(){
        if (getEdad() >= 18){
            return "Si eres mayor de edad";
        } else {
            return "No eres mayor de edad";
        }
    }

    public void menu(){
        StringBuffer sf = new StringBuffer();

        sf.append("=============== MENU PRINCIPAL ======================")
                .append("\n1.- MAYOR O MENOR DE EDAD")
                .append("\n2.- ETAPA DE LA VIDA DE UN SER HUMANO")
                .append("\n3.- EL MAYOR DE 3 NUMEROS")
                .append("\n4.- POSITIVOS, NEGATIVOS O NEUTROS")
                .append("\n5.- NUMERO PAR O IMPAR")
                .append("\n6.- CALCULA TU INCREMENTO RESPECTO A TU CATEGORIA")
                .append("\n7.- ERES APTO PARA EL SERVICIO MILITAR?")
                .append("\n8.- CALCULA TU COMISION DE VENTA")
                .append("\n9.- CALCULA TU AUMENTO SEGUN TU RANGO")
                .append("\n10.- CALCULAR EN FUNCION DE X")
                .append("\n0.- Salir");

        System.out.println(sf);
    }

    public String checarEtapaDeVida(){
        if (getEdad() >= 0 && getEdad() < 6) {
            return "Eres un infante";
        } else if (getEdad() >= 6 && getEdad() < 14) {
            return "Estas en la etapa de la niñez";
        } else if (getEdad() >= 14 && getEdad() < 19) {
            return "Estas en la pubertad y adolescencia";
        } else if (getEdad() >= 19 && getEdad() < 65) {
            return "Estás en la etapa de la adultez";
        } else {
            return "Estás en la 3ra etapa de edad";
        }
    }

    public StringBuffer determinarMayor(){
        int [] numerosHelper = getNumeros();
        StringBuffer msjRtn = new StringBuffer().append("El numero mayor es ");
        if (numerosHelper[0] < numerosHelper[1] && numerosHelper[0] < numerosHelper[2]) {
            if (numerosHelper[1] < numerosHelper[2]) {
                return msjRtn.append(numerosHelper[2]);
            } else {
                return msjRtn.append(numerosHelper[1]);
            }
        } else if (numerosHelper[0] > numerosHelper[1] && numerosHelper[0] < numerosHelper[2]) {
            if (numerosHelper[0] < numerosHelper[2]) {
                return msjRtn.append(numerosHelper[2]);
            } else {
                return msjRtn.append(numerosHelper[0]);
            }
        } else {
            if (numerosHelper[0] < numerosHelper[1]) {
                return msjRtn.append(numerosHelper[1]);
            } else {
                return msjRtn.append(numerosHelper[0]);
            }
        }
    }

    public String determinarPositivoNegativo() {
        if (getNum() > 0){
            return "Tu numero es Positivo";
        } else if (getNum() < 0) {
            return "Tu numero es negativo";
        } else {
            return "Tu numero es 0, por lo tanto es neutro";
        }
    }

    public String determinarParImpar(){
        if ( getNum() % 2 == 0)
            return "Es par";
        else
            return "Es impar";
    }

    public StringBuffer calcularIncrementoSalario(){

        double incremento = 0, salarioTotal = 0;

        if (getCat() == 1){
            incremento = getSalario() * .15;
            salarioTotal = getSalario() + incremento;
        } else if (getCat() == 2) {
            incremento = getSalario() * .1;
            salarioTotal = getSalario() + incremento;
        } else if (getCat() == 3) {
            incremento = getSalario() * .08;
            salarioTotal = getSalario() + incremento;
        } else {
            incremento = getSalario() * .07;
            salarioTotal = getSalario() + incremento;
        }

        return new StringBuffer()
                .append("Tu salario será : ").append(getSalario())
                .append("\nTu incremento fue de: ").append(incremento)
                .append("\nTu Salario total es de: ").append(salarioTotal);
    }

    public StringBuffer checarServicio(){

        if (getNacionalidad().length() != 0) {
            if (getSexo().length() != 0) {
                if (getNacionalidad().toUpperCase().equals("MEXICANA") && (getEdad() > 18 && getEdad() < 25) && getSexo().toUpperCase().equals("MASCULINO")){
                    return new StringBuffer("CIUDADANO").append(": Tu eres apto para el servicio militar");
                } else {
                    return new StringBuffer("CIUDADANO").append(": No eres apto");
                }
            } else {
                return new StringBuffer("CIUDADANO").append(": Ingresa correctamente los datos en SEXO");
            }
        } else {
            return new StringBuffer("CIUDADANO").append(": Ingresa correctamente los datos en NACIONALIDAD");
        }
    }

    public String tomarComision() {

        double comision;

        if (getPrecio() >= 1000){
            comision = getPrecio() * COMISION_5PER;
            return "Tu comisión es del " + (COMISION_5PER * 100) + " y tienes un " + df.format(comision) + "MXN en comisión de esta venta";
        } else {
            comision = getPrecio() * COMISION_3PER;
            return "Tu comisión es del " + (COMISION_3PER * 100) + " y tienes un " + df.format(comision) + "MXN en comisión de esta venta";
        }
    }

    public StringBuffer checarAumentos(){

        double aumento = 0;

        if (getCat() == 1) {
            aumento = getSalario() * INC_SINDI;
        } else if (getCat() == 2) {
            aumento = getSalario() * INC_CONFI;
        } else if (getCat() == 3) {
            aumento = getSalario() * INC_DIR;
        } else if (getCat() == 4) {
            aumento = getSalario() * INC_EJE;
        }

        return new StringBuffer("Tu nuevo salario es de: ")
                .append((int) (getSalario() + aumento))
                .append("\nEl aumneto es de: ")
                .append(aumento);
    }

    public StringBuffer calcularFunciones(){

        double x = 0;

        if (getNum() <= 11) {
            x = (3*getNum()) + 36;
        } else if (getNum() > 11 && getNum() <= 33) {
            x = Math.pow(getNum(), 2) - 10;
        } else if (getNum() > 33 && getNum() <= 64) {
            x = getNum() + 6;
        }


        return new StringBuffer("Los resultados de x en cada una de las funciones es: ")
                .append("\nf(x): ").append(x);
    }

}
