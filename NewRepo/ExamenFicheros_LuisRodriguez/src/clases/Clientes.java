package clases;

public class Clientes {

    //Atributos
    private int codigo;
    private String nombre;
    private String direccion;
    private String email; 
    


    @Override
    public String toString() {

        return this.codigo +" "+this.nombre+" "+this.direccion + " "+this.email+" \n";
    }

    @Override
    public boolean equals(Object obj) {
        
        Clientes arg = (Clientes) obj;

        return this.nombre.equals(arg.nombre);
    }


    //---------------------------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Clientes()
    {
        
    }


    
}
