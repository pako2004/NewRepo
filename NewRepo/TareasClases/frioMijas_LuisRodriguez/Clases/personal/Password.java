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
        //26 minus
        //26 mayus
        //10 nums
        String contra = "";
        // COntroladores
        int contMinus = 0;
        int contMayus = 0;
        int contNums = 0; 


        //soluciona esta vaina caebseguevo


        Password passFuerte = new Password(); // Creo la nueva contraseña
        for (int i = 0; i < 10;) {
            int random = 0;
            int tipoChar = (int)(Math.random()*2)+1;    

            //Seleccionador de tipo de caracter
            
            if(tipoChar == 1 &&contMinus < 1)
            {
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
                contNums++;
                i++;
            }
        
            char c = alphabet.charAt(random);
            contra += c;
            
        }
        passFuerte.longitud = 10;
        passFuerte.contraseña = contra;
        
        return passFuerte;
        //Primera opcion, Que se repita todo hasta que salga una fuerte 
        //Segunda Opcion, hacer un random de tres opciones que decida que tipo de caracter va a ser
        //Cuando se cumpla alguna condicion, se quita la opcion de que vuelva a salir ese mismo tipo de caracter


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
