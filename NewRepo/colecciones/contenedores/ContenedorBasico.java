package colecciones.contenedores;

public class ContenedorBasico<T> {
    
    private T object;

    public void insertar(T nuevo)
    {
        object = nuevo;

    }

    public T extraer()
    {   
        T resultado = object;
        object = null;
        return resultado;
    }


}
