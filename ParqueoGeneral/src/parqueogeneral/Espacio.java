
package parqueogeneral;

public class Espacio {
    private int identificador;
    private String tipo;
    private int capacidad;
    private boolean disponible;

    // Constructor
    public Espacio(int identificador, String tipo, int capacidad, boolean disponible) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }
    
    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }      
}

