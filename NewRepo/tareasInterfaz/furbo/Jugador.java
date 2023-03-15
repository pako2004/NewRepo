package tareasInterfaz.furbo;

public class Jugador implements Comparable{
    
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
    public String toString() {
        
        return this.NombreCompleto +" ("+this.Apodo+")- Goles: "+this.numeroGoles+" - Faltas: "+numeroFaltas;
    }

    @Override
    public int compareTo(Object o) {

        Jugador j = (Jugador)o;
        int resultado = 0;


        if (this.Num_Licencia > j.Num_Licencia)
        {
            resultado = 1;
        }else if(this.Num_Licencia < j.Num_Licencia)
        {
            resultado = -1;
        }

        return resultado;

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
