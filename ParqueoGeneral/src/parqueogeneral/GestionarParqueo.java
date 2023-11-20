
package parqueogeneral;

public class GestionarParqueo {
    
    //Array
    private Espacio [] espacios;
    
    //Constructor
    public GestionarParqueo(){
//        espacios = new Espacio[cantidadEspacios];
    }
    
    //Mostrar espacios disponibles por dia
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
    
    //Metodo para adquirir un espacio en el parqueo
    public void adquirirEspacio(int id, String tipo, int cantidadEspaciosOcupados){
        for(int i = 0; i < espacios.length; i++){
            if(espacios[i] == null){
                espacios[i] = new Espacio(id, tipo, cantidadEspaciosOcupados);
                break;
            }
        }
    }
}
