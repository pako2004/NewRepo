import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class EjercicioNumeros {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("src/recursos/numeros.txt");
            BufferedReader bf = new BufferedReader(fr);
            String fuap = bf.readLine();
            int totalLinea1 = 0;
            String num = "";
            while(fuap != null)
            {      
                totalLinea1 = 0;
                System.out.println(fuap);
                for (int i = 0; i < fuap.length(); i++) {
                    
                    
                    if(fuap.charAt(i) != ' ')
                    {
                        num +=(fuap.charAt(i));
                    }else if(fuap.charAt(i) == ' ' || i == fuap.length()-1){
                        totalLinea1 += Integer.parseInt(num);
                        num = "";
                        System.out.println(totalLinea1);
                    }
                }
                /* 
                System.out.print(fuap);
                if(fuap != " ")
                {
                    num = ""+fuap;
                
                }else if(fuap == " " )
                {   
                    int numero = Integer.parseInt(num);
                    totalLinea1 += numero;
                }*/
                fuap = bf.readLine();                
            }
            System.out.println();
            

        } catch (IOException ex) {
            // TODO: handle exception
        }


    }
    
}
