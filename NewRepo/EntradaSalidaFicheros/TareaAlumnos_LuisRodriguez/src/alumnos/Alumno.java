package alumnos;

import java.util.Comparator;

public class Alumno implements Comparator {


    //Atributos
    String sexo;
    int edad; 
    double estatura;
    int puntuacion1;
    int puntuacion2;
    String calificacion;

    public Alumno(String sexo, int edad, double estatura, int puntuacion1, int puntuacion2, String calificacion)
    {
        this.sexo = sexo;
        this.edad = edad; 
        this.estatura = estatura;
        this.puntuacion1 = puntuacion1;
        this.puntuacion2 = puntuacion2;
        this.calificacion = calificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getCalificacion() {
        return calificacion;
    }

  
/* 
    @Override
    public int compare(Object arg0, Object arg1) {

        Alumno a1 = (Alumno)arg0;
        Alumno a2 = (Alumno)arg1;

        return a1.edad;
    }
*/
@Override
public int compare(Object arg0, Object arg1) {

    Alumno a1 = (Alumno)arg0;
    Alumno a2 = (Alumno)arg1;

    return a1.edad - a2.edad;
}

@Override
public String toString() {
    
    return this.sexo +" "+this.edad + " "+ this.calificacion;
}

}
