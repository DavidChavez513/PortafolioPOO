public class Triangulo extends Figura{

    private double[] lados = new double[3];

    public void setLados(double valor, int index) {
        this.lados[index] = valor;
    }

    @Override
    public double calcularArea() {
        double result = (getX() * getY()) / 2;
        return result;
    }

    @Override
    public double calcularPerimetro() {
        double result = lados[0] + lados[1] + lados[2];
        return result;
    }
}
