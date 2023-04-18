import utilCalculadora.Calculos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a probar con capturar excepciones");
        try{

        Calculos cal = new Calculos();

        //int multi = cal.multiplicacion(4, 6);
        int division = cal.division(100, 0);

        System.out.println("Resultado:" +division);

        

        }catch(Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
