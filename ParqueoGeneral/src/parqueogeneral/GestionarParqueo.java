
package parqueogeneral;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GestionarParqueo {
    
    //Array
    private Espacio[] espacios;
    private int cantidadEspacios; //Contador de espacios creados
    private boolean[] codigosUtilizados; //muestra los codigos
    private Map<Integer, Espacio> mapaEspacios; // Mapa para guardar códigos y espacios

    // Se declara la instancio como una variable estática para que
    // sea compartida entre diferentes clases y objetos sin necesidad de crear multiples instancias
    private static GestionarParqueo instance;
    
    // Método estático para obtener la instancia única
    public static GestionarParqueo obtenerInstancia(int cantidadMaximaEspacios) {
        if (instance == null) {
            instance = new GestionarParqueo(cantidadMaximaEspacios);
        }
        return instance;
    }
    
    //Constructor
    public GestionarParqueo() {
    }
    
    // Constructor que inicializa la lista de espacios
    public GestionarParqueo(int cantidadMaximaEspacios) {
        espacios = new Espacio[cantidadMaximaEspacios];
        codigosUtilizados = new boolean[1000]; // rango de codigos 3 digitos
        cantidadEspacios = 0;
        mapaEspacios = new HashMap<>();
    }
    
    
    //Mostrar espacios disponibles por dia (me salio que tenia que poner final despues de private - averiguar eso)
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
    public int agregarEspacio(String tipo, int cantidadEspacioOcupados) {
        if (cantidadEspacios < espacios.length) {
            int codigo = generarCodigoUnico(); // Obtener un código único
            Espacio nuevoEspacio = new Espacio(codigo, tipo, cantidadEspacioOcupados);
            espacios[cantidadEspacios] = nuevoEspacio;
            cantidadEspacios++;
            mapaEspacios.put(codigo, nuevoEspacio); // Guardar en el mapa
            System.out.println("Espacio agregado: Código: " + codigo + ", Tipo: " + tipo + ", Cantidad de espacios ocupados: " + cantidadEspacioOcupados);
            return codigo; // Devolver el código generado
        } else {
            System.out.println("No se pudo agregar espacios");
            return -1; // Indicar que no se pudo agregar el espacio
        }
    }

    //Metodo para generar un codigo unico 
    private Random random = new Random();
    private int generarCodigoUnico(){
        int min = 100;
        int max = 999;
        int codigoAleatorio;
        
        do{
            codigoAleatorio = random.nextInt(max - min + 1) + min;
        
        }while (codigosUtilizados[codigoAleatorio]);
            codigosUtilizados[codigoAleatorio] = true;
            return codigoAleatorio;
    }
    
    //Método para editar los datos agregados
    public boolean editarEspacio(int codigo, String nuevoTipo, int nuevaCantidadEspacioOcupados) {
        if (mapaEspacios.containsKey(codigo)) {
            Espacio espacio = mapaEspacios.get(codigo);
            espacio.setTipo(nuevoTipo);
            espacio.setCantidadEspacioOcupados(nuevaCantidadEspacioOcupados);
            mapaEspacios.put(codigo, espacio); // Actualizar en el mapa
            System.out.println("Espacio editado con éxito: Código: " + codigo);
            return true; // Indicar que se editó exitosamente
        } else {
            System.out.println("No se encontró el espacio con el código: " + codigo);
            return false; // Indicar que no se encontró el espacio
        }
    }
}
