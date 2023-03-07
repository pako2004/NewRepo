package ejerciciosClases;

public class pruebas {

    public static void main(String[] args) {
        
        int longitud = 5;
        
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String contra = "";
        for (int i = 0; i < longitud ; i++) {

            int random = (int)(Math.random()*61)+1;
            
            char c = alphabet.charAt(random);

            contra += c;
            
        }
        System.out.println(contra);
        
    }
    
}
