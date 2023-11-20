
package parqueogeneral;

public class GestionarParqueo {
    
    //Array
    private Espacio [] espacios;
    
    //Constructor
    public GestionarParqueo() {
    }
    
    // Constructor que inicializa la lista de espacios
    public GestionarParqueo(int cantidadEspacios) {
        espacios = new Espacio[cantidadEspacios];
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
    
    // Método para adquirir un espacio en el parqueo
    public void adquirirEspacio(int id, String tipo, int cantidadEspaciosOcupados){
        int tipoID;
        switch(tipo) {
            case "General":
                tipoID = 1;
                break;
            case "Techado":
                tipoID = 2;
                break;
            case "Discapacitado":
                tipoID = 3;
                break;
            case "Carga Electrica":
                tipoID = 4;
                break;
            default:
                // Si el tipo no es ninguno de los esperados, aquí puedes manejar el error o lanzar una excepción
                // Por ejemplo:
                throw new IllegalArgumentException("Tipo de espacio inválido");
        }

        if (id != tipoID) {
            // Si el ID no coincide con el tipo asignado, puedes manejar el error o lanzar una excepción
            // Por ejemplo:
            throw new IllegalArgumentException("El ID no coincide con el tipo de espacio");
        }

        for(int i = 0; i < espacios.length; i++){
            if(espacios[i] == null){
                espacios[i] = new Espacio(id, tipo, cantidadEspaciosOcupados);
                break;
            }
        }
    }

}
