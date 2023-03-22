package colecciones.contenedores.ejer1Map;
import java.util.HashMap;
import java.util.Scanner;

class ExistenciaRepuesto {

    HashMap<String, Integer> productos = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;


        do{
         
            imprimirMenu();
            int opcion = sc.nextInt();


            String codigo;
            int stock;
            switch(opcion)
            {
                case 1:


                break;

                case 2:

                break;

                case 3:
                    System.out.println("Introduzca el codigo del producto que desea actualizat");
                    codigo = sc.nextLine();
                    System.out.println("Introduzca el nuevo stock");
                    stock = sc.nextInt();
                    productos.put(codigo, stock);
                break;
            }

        }while(!salir);
    
    }

    

    static void imprimirMenu()
    {
        System.out.println("*********************************************");
        System.out.println("Repuestos PAko");
        System.out.println("1) Dar de alta ");
        System.out.println("2) Dar de baja");
        System.out.println("3) Actualizar stock");
        System.out.println("************************************************");
    }

    static HashMap<String, Integer> darAlta(String codigo, int stock)
    {
        productos.put()

    }

}
