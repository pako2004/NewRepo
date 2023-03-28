package tareasInterfaz.furbo;

public class Jugador implements Comparable, Jugar_I {
    
    private String NombreCompleto;
    private String Apodo;
    private int Num_Licencia;
    private int numeroGoles;
    private int numeroFaltas;
    private static int aux = 1000;
    

    public Jugador(String Completo, String Apodo)
    {
        aux++;
        this.NombreCompleto = Completo;
        this.Apodo = Apodo;
        this.Num_Licencia = aux;
    }

    @Override
    public boolean equals(Object o) {
        
        Jugador j = (Jugador)o;
        boolean igual = false;

        if(this.Num_Licencia == j.Num_Licencia)
        {
            igual = true;
        }
        return igual;
        

    }

    @Override
    public int compareTo(Object o) {
        Jugador jug = (Jugador)o;
        return this.Num_Licencia - jug.Num_Licencia;
    }

    
    @Override
    public void HacerGol(Jugador jugador) {
      System.out.println(this.NombreCompleto+" ha metido gol");
      System.out.println("Goles de "+this.NombreCompleto+": "+this.numeroGoles);
      this.numeroGoles++;
    }

    @Override
    public void cometerFalta(Jugador jugador) {
     System.out.println(this.NombreCompleto+" ha hecho falta");
     System.out.println("Numero de faltas de "+ this.NombreCompleto+": "+this.numeroFaltas);
     this.numeroFaltas++;
    }

 



 //*********************************************************************************************** */
    public int getNum_Licencia() {
        return Num_Licencia;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

public void setApodo(String apodo) {
        Apodo = apodo;
    }

    public void setNum_Licencia(int num_Licencia) {
        Num_Licencia = num_Licencia;
    }

    @Override
    public String toString() {
        
        return this.NombreCompleto +" ("+this.Apodo+")- Goles: "+this.numeroGoles+" - Faltas: "+numeroFaltas;
    }


    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public String getApodo() {
        return Apodo;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }



}
