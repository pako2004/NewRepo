package frioMijas_LuisRodriguez.Clases.personal;

public class Password {
    
    //Atributos 

    private int longitud;
    private String contraseña;


    //COnstructor
    
    public Password (int longitud)
    {
        this.longitud = longitud;
        this.contraseña = generarPassword(this.longitud);

    }

    public Password ()
    {
    this.longitud=8;
    this.contraseña = generarPassword(this.longitud);
    }

    //Metodos


    public String generarPassword(int longitud)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String contra = "";
        for (int i = 0; i < longitud ; i++) {

            int random = (int)(Math.random()*61)+1;
            
            char c = alphabet.charAt(random);

            contra += c;
            
        }
        return contra;
    }

    public boolean esFuerte(Jefe jefe)
    {   
        boolean fuerte = false;
        Password contra = jefe.getPassword();

        int mayus = 0;
        int minus = 0;
        int nums = 0;

        for (int i = 0; i < contra.getLongitud(); i++) {

            char caracter = contra.getContraseña().charAt(i);
            int ascii = (int)caracter;

            if(ascii >= 65 && ascii <= 90) // Es mayuscula?
            {
                mayus++;
            }else if(ascii >=97 && ascii <=122) //Es minuscula?
            {
                minus++;
            }else if(ascii >= 48 && ascii <= 57) //Es un numero?
            {
                nums++;
            }
            if(mayus > 2 && minus > 1 && nums > 5)
            {
                fuerte = true;
            }
        }    

        return fuerte;
    }

    public Password generarFuerte()
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String[] contraa = new String[10]; //Creo un array que va a contener los caracteres de la contraseña 
        String contra = "";
        // COntroladores
        int contMinus = 0;
        int contMayus = 0;
        int contNums = 0; 
        
        
        

        
        for (int i = 0; i < contraa.length; i++) { // Le pongo un identificador para decir que la posicion del array esta vacia
            contraa[i] = "?";
        }
        
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



        Password passFuerte = new Password(); // Creo la nueva contraseña
       
        passFuerte.longitud = 10;
        passFuerte.contraseña = contra;
        
        return passFuerte;

    }

    @Override
    public String toString()
    {   
        return this.contraseña;
    }

    //get
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }



    

    

}
