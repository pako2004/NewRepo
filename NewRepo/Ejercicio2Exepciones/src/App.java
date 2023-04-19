

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Primera cria");
        Gato padre = new Gato("Antonio", "Amarillo", "Hombre");
        Gato madre = new Gato("Antonia","Azul","Mujer");

        Gato hijo1 = padre.apareaCon(madre);

        System.out.println("Padre "+ padre);
        System.out.println("Madre "+madre);
        System.out.println("Hijo "+ hijo1);

        //Excepcion
        System.out.println();
        System.out.println("Segunda cria");
        Gato padre2 = new Gato("Antonie", "Roje", "Hombre");

        System.out.println("Padre "+padre);
        System.out.println("Padre/Madre "+padre2);
        Gato hijo2 = padre.apareaCon(padre2);
        System.out.println("Hijo2 "+hijo2);

    }
}
