import clase.utiles.LecturaTeclado;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LecturaTeclado sc = new LecturaTeclado();

        int entero = sc.leerInt();
        System.out.println("Entero:"+entero);

        double numeroDouble = sc.leerDouble();
        System.out.println("double: "+numeroDouble);

        float numeroFloat = sc.leerFloat();
        System.out.println("Float: "+numeroFloat);
    }
}
