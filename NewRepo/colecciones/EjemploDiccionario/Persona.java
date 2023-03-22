package colecciones.EjemploDiccionario;

class Persona {
    private  String nombre;
    private int edad;
    Persona(String nombre)
    {
        this.nombre = nombre;
        this.edad = 0;
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
