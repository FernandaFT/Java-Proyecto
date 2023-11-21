
package parqueogeneral;

import java.util.Random;

public class GestionarParqueo {
    
    //Array
    private Espacio[] espacios;
    private int cantidadEspacios; //Contador de espacios creados
    private boolean[] codigosUtilizados; //muestra los codigos
    private int ultimoCodigoGenerado; // almacena el ultimo codigo
    
    
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
            ultimoCodigoGenerado = codigo; // Almacena el último código generado
            espacios[cantidadEspacios] = new Espacio(codigo, tipo, cantidadEspacioOcupados);
            cantidadEspacios++;
            // Registro de depuración: Mostrar los datos de ID - Tipo y Cantidad
            System.out.println("Espacio agregado: Código: " + codigo + ", Tipo: " + tipo + ", Cantidad de espacios ocupados: " + cantidadEspacioOcupados);
            return codigo; // Devolver el código generado
        } else {
            System.out.println("No se pudo agregar espacios");
            return -1; // Indicar que no se pudo agregar el espacio
        }
    }
    
    //Metodo para obtener el ultimo codigo generado
    public int obtenerUltimoCodigoGenerado(){
        return ultimoCodigoGenerado;
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
    public void editarEspacio(int codigo, String nuevoTipo, int nuevaCantidadEspacioOcupados) {
        for (int i = 0; i < cantidadEspacios; i++) {
            if (espacios[i].getCodigoUnico() == codigo) {
                espacios[i].setTipo(nuevoTipo);
                espacios[i].setCantidadEspacioOcupados(nuevaCantidadEspacioOcupados);
                System.out.println("Espacio con Código " + codigo + " actualizado: Tipo: " + nuevoTipo + ", Cantidad de espacios ocupados: " + nuevaCantidadEspacioOcupados);
                return;
            }
        }
        System.out.println("No se encontró ningún espacio con el Código " + codigo);
    }
}
