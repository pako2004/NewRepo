package frioMijas_LuisRodriguez.Clases.personal;

public class Password {
    
    //Atributos 

    private int longitud;
    private String contraseña;


    //COnstructor
    
    public Password (int longitud)
    {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);

    }

    public Password ()
    {
    this.longitud=8;
    this.contraseña = generarPassword(longitud);
    }

    //Metodos


    public String generarPassword(int longitud)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String contra = "";
        for (int i = 0; i == longitud ; i++) {

            int random = (int)(Math.random()*61)+1;
            
            char c = alphabet.charAt(random);

            contra += c;
            
        }
        return contra;
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
