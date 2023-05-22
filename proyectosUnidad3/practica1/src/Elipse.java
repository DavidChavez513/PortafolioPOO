public class Elipse extends Figura{

    static final float PI = 3.141592654f;

    @Override
    public double calcularArea() {
        double result = getX() * getY() * PI;
        return result;
    }

    @Override
    public double calcularPerimetro() {
        double result = (2 * PI) * (Math.sqrt((Math.pow(getX(), 2) + Math.pow(getY(), 2))/2));

        return result;
    }
}
