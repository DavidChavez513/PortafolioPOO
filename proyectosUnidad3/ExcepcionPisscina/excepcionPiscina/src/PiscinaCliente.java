public class PiscinaCliente {
    public static boolean operacionesPiscina (){
        boolean fallo = false;
        Piscina alberca = new Piscina(5000);
        try {
            alberca.llenar((Math.random() * 100000));
            System.out.println("Llena con " + alberca.getNivel() + "LTS");
            alberca.vaciar((Math.random() * 100000));
            System.out.println("Vaciar a " + alberca.getNivel() + "LTS");
            fallo = false;
        } catch (PiscinaNivelException ex){
            System.out.println("Error: " + ex.toString() + " " + ex.nivel);
            fallo = true;
        }
        return fallo;
    }
    public static void main(String[] args) {
        boolean piscinaEnLimite = true;
        int contador = 0;
        while (piscinaEnLimite){
            System.out.println("Vuelta numero: " + contador);
            if (contador == 10){
               piscinaEnLimite = false;
            }else {
                operacionesPiscina();
            }
            contador++;
        }

    }
}
