public class PiscinaNivelException extends Exception{

    int nivel;
    public PiscinaNivelException(String message, int nivel) {
        super(message);
        this.nivel = nivel;
    }

}
