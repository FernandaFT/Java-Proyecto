
package parqueogeneral;

public class Espacio {
    private int id;
    private String tipo;
    private int cantidadEspacioOcupados;
    private int codigoUnico;
    
    //Constructor
    public Espacio(int id, String tipo, int cantidadEspacioOcupados) {
        this.id = id;
        this.tipo = tipo;
        this.cantidadEspacioOcupados = cantidadEspacioOcupados;
        this.codigoUnico = codigoUnico;
    }
    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadEspacioOcupados() {
        return cantidadEspacioOcupados;
    }

    public void setCantidadEspacioOcupados(int cantidadEspacioOcupados) {
        this.cantidadEspacioOcupados = cantidadEspacioOcupados;
    }  

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }
    
    
}

