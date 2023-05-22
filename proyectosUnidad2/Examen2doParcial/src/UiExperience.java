public class UiExperience {
    public void menuPrincipal(){
        StringBuffer sf = new StringBuffer();

        sf.append("========= MENU PRINCIPAL ============ \n")
                .append("1.- ALTA CLIENTE\n")
                .append("2.- ALTA VENDEDOR\n")
                .append("3.- ALTA PRODUCTO\n")
                .append("4.- VENDER\n")
                .append("5.- HISTORIAL COMPRAS CLIENTES\n")
                .append("6.- HISTORIAL VENTAS VENDEDOR\n")
                .append("0.- SALIR\n");


        System.out.println(sf);

    }
}
