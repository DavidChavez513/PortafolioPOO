public class Piscina {

    private int nivel;
    public final int MAX_LEVEL = 150000;

    public Piscina(){

    }
    public Piscina(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) throws Exception {
        this.nivel = nivel;
        if (nivel <= 0) {
            throw new Exception("Necesitamos que este numero sea mayor que 0");
        }

    }

    public void vaciar(double litros) throws PiscinaNivelException{

        if (this.nivel - litros < 0){
            throw new PiscinaNivelException("No podemos vaciar tantos litros, el nivel minimo es de 0 lts, valor esperado: ", (this.nivel - (int) litros));
        } else {
            this.nivel -= litros;
        }
    }

    public void llenar(double litros) throws PiscinaNivelException{

        if (this.nivel + litros >= MAX_LEVEL) {
            throw new PiscinaNivelException("CAPACIDAD EXCEDIDA POR: ", MAX_LEVEL - (int) (this.nivel + litros));
        } else {
            this.nivel+= litros;
        }

    }
}
