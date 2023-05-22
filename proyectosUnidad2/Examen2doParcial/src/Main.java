import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static UiExperience ui = new UiExperience();

    static ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
    static ArrayList<Vendedor> vendeoresList = new ArrayList<Vendedor>();
    static ArrayList<Producto> inventario = new ArrayList<Producto>();
    static int opc = 0;
    static boolean salir = false;


    public static void main(String[] args) {
        do {
            opc = 0;
            String nom = "";
            String apdPat = "";
            String apdMat = "";
            String fechaNam = "";
            String rfc = "";
            String address = "";
            String dpto = "";
            String descripcion = "";

            int id = 0, sueldo = 0, stock = 0, idProdSelect = 0, idVendedorSelect = 0;
            float precio = 0.0f, comision = 0.0f;

            Venta vtasHelper = new Venta();

            ui.menuPrincipal();
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingresa el nombre del cliente: ");
                    nom = scan.next();
                    System.out.println("Ingresa primer apellido del cliente: ");
                    apdPat = scan.next();
                    System.out.println("Ingresa segundo apellido del cliente: ");
                    apdMat = scan.next();
                    System.out.println("Ingresa fecha de nacimiento del cliente: \n FORMATO REQUERIDO ==> dia/mes/anio");
                    fechaNam = scan.next();
                    System.out.println("Ingresa el RFC de tu cliente: ");
                    rfc = scan.next();
                    System.out.println("Ingresa la domicilio de tu cliente: ");
                    address = scan.next();
                    clientesList.add(new Cliente(nom, apdPat, apdMat, fechaNam, rfc, address));

                    for (Cliente client : clientesList) {
                        if (client.getNombre().equals(nom)) {
                            System.out.println(
                                    "Numero de Cliente: " + client.getIdCliente() + "\n" +
                                            "Nombre completo: " + client.getNombre() + " " + client.getAppParteno() + " " + client.getAppMaterno() +
                                            "\nDomicilio: " + client.getDomicilio()
                            );
                        } else {
                            System.out.println("CLIENTE NO EXISTENTE");
                        }
                    }

                    break;
                case 2:

                    System.out.println("Ingresa el nombre del vendedor: ");
                    nom = scan.next();
                    System.out.println("Ingresa primer apellido del vendedor: ");
                    apdPat = scan.next();
                    System.out.println("Ingresa segundo apellido del vendedor: ");
                    apdMat = scan.next();
                    System.out.println("Ingresa fecha de nacimiento del vendedor: \n FORMATO REQUERIDO ==> dia/mes/anio");
                    fechaNam = scan.next();
                    System.out.println("Ingresa el Departamento del vendedor: ");
                    dpto = scan.next();
                    System.out.println("Ingresa la Comision por venta: ");
                    comision = scan.nextFloat();
                    System.out.println("Ingresa la Sueldo por venta: ");
                    sueldo = scan.nextInt();

                    vendeoresList.add(new Vendedor(nom, apdPat, apdMat, fechaNam, dpto, comision, sueldo));

                    for (Vendedor vendedor : vendeoresList) {
                        if (vendedor.getNombre().equals(nom)) {
                            System.out.println(
                                    "ID Cliente: " + vendedor.getIdVendedor() + "\n" +
                                            "Nombre completo: " + vendedor.getNombre() + " " + vendedor.getAppParteno() + " " + vendedor.getAppMaterno() +
                                            "\nDepartamento: " + vendedor.getArea()
                            );
                        } else {
                            System.out.println("VENDEDOR NO EXISTENTE");
                        }
                    }


                    break;
                case 3:
                    vtasHelper.agregarProductos(inventario, scan);
                    break;
                case 4:

                    System.out.println("PRODUCTOS DISPONIBLES");
                    for (Producto prod : inventario) {
                        System.out.println(
                                "ID PRODUCTO: " + prod.getId() +
                                        " Disponibles: " + prod.getStock() + "Uni. " +
                                        "Precio: $" + prod.getPrecio() + " MXN " +
                                        "Descripcion: " + prod.getDescripcion()
                        );
                    }

                    System.out.println("Ingresa el Numero de cliente: ");
                    id = scan.nextInt();
                    System.out.println("Ingresa tu Numero de vendedor: ");
                    idVendedorSelect = scan.nextInt();

                    Venta carrito = null;
                    Vendedor globalVendedor = null;


                    for (Vendedor vendedor : vendeoresList) {
                        if (vendedor.getIdVendedor() == idVendedorSelect) {
                            globalVendedor = vendedor;
                            carrito = new Venta(vendedor);
                        }
                    }
                    carrito.agregarProductoToCarrito(inventario, scan);
                    for (Cliente client : clientesList) {
                        if (client.getIdCliente() == id) {
                            System.out.println("Desea seguir comprando? \n 1.- Si \n 2.- Continuar a pagar");
                            opc = scan.nextInt();
                            if (opc == 2) {
                                System.out.println(client.comprar(globalVendedor, carrito.getCarrito()));
                            }
                        }
                    }


                    break;
                case 5:

                    System.out.println("Ingresa tu numero de cliente: ");
                    id = scan.nextInt();

                    for (Cliente cliente : clientesList) {
                        if (id == cliente.getIdCliente()) {
                            for (Venta vta : cliente.getHistorial()) {
                                System.out.println(
                                        "TOTAL: " + vta.getTotal() + "\n"
                                                + "Fecha Venta: " + vta.getDtVenta() + "\n"
                                );
                            }

                        }
                    }

                    break;
                case 6:
                    System.out.println("Ingresa tu numero de Vendedor: ");
                    id = scan.nextInt();

                    for (Vendedor vendedor : vendeoresList) {
                        if (id == vendedor.getIdVendedor()) {
                            System.out.println("Ventas en el mes: " + vendedor.getVtaRealizada());
                            System.out.println("COMISION DEL MES: " + vendedor.calcularComision(clientesList));
                            System.out.println("SALARIO BASE: " + vendedor.getSueldo());
                        }
                    }

            break;
            case 0:
                salir = true;
                break;
            default:
                System.out.println("OPCION NO DISPONIBLE O NO EXISTENTE");
                break;

        }

        }while(salir == false);

    }
}