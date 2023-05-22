public class Cuadrilatero extends Figura {

    @Override
    public double calcularPerimetro() {
        double result = (2 * getX()) + (2 * getY());
        return result;
    }

    @Override
    public double calcularArea() {

        double result = getX() * getY();
        return result;
    }
}
