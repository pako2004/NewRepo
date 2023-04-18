import clase.utiles.LecturaTeclado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LecturaTeclado sc = new LecturaTeclado();
        int maximo = 0;

        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random()*3);
            
            System.out.println("Introduce un numeroi");
            int numero = sc.leerInt();
            if(numero > maximo)
            {
                maximo = numero;
            }
        }
        System.out.println("El maximo es : "+maximo);
    }
}
