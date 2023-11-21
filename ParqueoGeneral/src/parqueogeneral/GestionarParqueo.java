
package parqueogeneral;

public class GestionarParqueo {
    
    //Array
    private Espacio[] espacios;
    private int cantidadEspacios; //Contador de espacios creados
    
    //Constructor
    public GestionarParqueo() {
    }
    
    // Constructor que inicializa la lista de espacios
    public GestionarParqueo(int cantidadMaximaEspacios) {
        espacios = new Espacio[cantidadMaximaEspacios];
        cantidadEspacios = 0;
    }
    
    
    //Mostrar espacios disponibles por dia (me salio que tenia que poner final despues de private - averguar eso)
    private final int[][] espaciosDisponibles = {
        // Lunes, Martes, Miércoles, Jueves, Viernes
        {10, 8, 12, 9, 11}, // Espacios disponibles para G
        {15, 13, 11, 10, 14}, // Espacios disponibles para T
        {20, 18, 22, 19, 21}, // Espacios disponibles para D
        {5, 4, 6, 7, 5} // Espacios disponibles para CE
    };

    public int mostrarEspaciosDisponibles(int dia, int tipoEspacio) {
        return espaciosDisponibles[tipoEspacio][dia - 1];
    }
    
    // Método para agregar un espacio en el parqueo
    public void agregarEspacio(int id, String tipo, int cantidadEspacioOcupados){
        if(cantidadEspacios < espacios.length){
            espacios[cantidadEspacios] = new Espacio(id, tipo, cantidadEspacioOcupados);
            cantidadEspacios++;
        }else {
                System.out.println("No se pudo agregar espacios");
        }
    }
    
    // Método para mostrar todos los espacios (depuracion)
    public void mostrarEspacios() {
        for (int i = 0; i < cantidadEspacios; i++) {
            System.out.println("ID: " + espacios[i].getId() +
                               ", Tipo: " + espacios[i].getTipo() +
                               ", Cantidad Ocupada: " + espacios[i].getCantidadEspacioOcupados());
        }
    }
}
