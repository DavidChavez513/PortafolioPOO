public class Circulo extends Figura{

    static final float PI = 3.141592654f;

    @Override
    public double calcularArea() {
        double result = PI * Math.pow(getX(), 2);
        return result;
    }

    @Override
    public double calcularPerimetro() {

        double result = PI * (getX() * 2);

        return result;
    }

}
