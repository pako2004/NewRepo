public class Gato {
    
    //Atributos

    String sexo;
    String nombre;
    String raza;
    


    public Gato(String nombre, String raza, String sexo)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }
    public Gato()
    {

    }

    public Gato apareaCon(Gato pareja)
    {   
        Gato cria = new Gato();
        try {
            if(this.sexo.equals(pareja.sexo))
            {
                throw new ExepcionApareamientoImposible();
            }else{
                cria = new Gato(this.nombre, pareja.raza, this.sexo);
            }
        } catch (ExepcionApareamientoImposible epa) {

            System.out.println(epa);

        }

        return cria;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.raza+" "+this.sexo;
    }
}
