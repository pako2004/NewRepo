package ejerciciosClases;

public class pruebas {

    public static void main(String[] args) {
        
        int longitud = 5;
        
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String[] contraa = new String[10];
        int contMayus = 0;
        int contMinus = 0;
        int contNums = 0;
        

        
        for (int i = 0; i < contraa.length; i++) { // Le pongo un identificador para decir que la posicion del array esta vacia
            contraa[i] = "?";
        }
    
        //Creo un array que va a contener los caracteres de la contraseña 
        String contra = "";
        for (int pos = 0; pos < contraa.length; pos++) 
        {   

            if(contMayus <= 2 ) //Para las mayusculas
            {     
                if(contraa[pos].equals("?"))
                {
                int random = (int)(Math.random()*25)+27;//Numero aleatorio del string que contiene los caracteres
                char c = alphabet.charAt(random);
                contraa[pos] = ""+c;//Agrego el caracter al array
                contMayus++;
                   
                }
            }
            if(contMinus <= 1 ){     //Minus
                if(contraa[pos].equals("?"))
                {
                int random = (int)(Math.random()*25)+1;
                
                contraa[pos] = ""+alphabet.charAt(random);
                contMinus++;
                    
                }
             }
            if(contNums <= 5 ) // NUmeros
                 {     
                if(contraa[pos].equals("?"))
                {
                    int random = (int)(Math.random()*8)+1;
                    ;
                    contraa[pos] = ""+random;
                    contNums++;
                   
                }
            }
        } 
        // Desordeno la contraseña
        for (int i = contraa.length - 1; i > 0; i--)
        {   
            int random = (int)(Math.random()*8)+1;
                String aux = contraa[i];
                contraa[i] = contraa[random];
                contraa[random] = aux;
                
        }
        //Coloco los caracteres del array en un string
        for (int j = 0; j < contraa.length; j++) {
            contra += contraa[j];
        }

        System.out.println(contra);
                
                


        /* 
        random = (int)(Math.random()*25)+1;
                contMinus++;
                i++;
            }else if(tipoChar == 2 &&contMayus < 2)
            {
                random = (int)(Math.random()*25)+27;
                contMayus++;
                i++;
            }if(tipoChar == 3 &&contNums < 5)
            {
                random = (int)(Math.random()*9)+53;
                */
        
    }
    
}
