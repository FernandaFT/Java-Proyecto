
package parqueogeneral;

import javax.swing.JOptionPane;

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
    
    // Validar IDs
    public boolean agregarEspacioValido(int id, String tipo, int cantidadEspacioOcupados){
        if (id > 0) {
            switch (id) {
                case 1:
                    if (tipo.equals("General")) {
                        agregarEspacio(id, tipo, cantidadEspacioOcupados);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo incorrecto para el ID 1. Debe ser 'General'.");
                    }
                    break;
                case 2:
                    if (tipo.equals("Techado")) {
                        agregarEspacio(id, tipo, cantidadEspacioOcupados);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo incorrecto para el ID 2. Debe ser 'Techado'.");
                    }
                    break;
                case 3:
                    if (tipo.equals("Discapacitado")) {
                        agregarEspacio(id, tipo, cantidadEspacioOcupados);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo incorrecto para el ID 3. Debe ser 'Discapacitado'.");
                    }
                    break;
                case 4:
                    if (tipo.equals("Carga Electrica")) {
                        agregarEspacio(id, tipo, cantidadEspacioOcupados);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo incorrecto para el ID 4. Debe ser 'Carga Electrica'.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ID inválido.");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "ID no puede ser un número negativo.");
        }
        return false;
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
    
    
    //Método para editar los datos agregados
//    public void editarEspacio(int id, String tipo, int CantidadEspacioOcupados, int indice ){
//        if(indice >= 0 && indice < cantidadEspacios){
//            espacios[indice].setId(id);
//            espacios[indice].setTipo(tipo);
//            espacios[indice].setCantidadEspacioOcupados(CantidadEspacioOcupados);
//        }else {
//            System.out.println("Indice fuera de rango o el espacio no existe");
//        }
//    }
}
