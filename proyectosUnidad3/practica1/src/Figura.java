public abstract class Figura {
    protected double x, y;

    public Figura(){

    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double calcularArea(){

        return 0;
    }
    public abstract double calcularPerimetro();

}
