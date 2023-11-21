
package parqueogeneral;

import gui.InfoScreen;

public class ParqueoGeneral {

    public static void main(String[] args) {
        
//        GestionarParqueo parqueo = new GestionarParqueo(50); // Define el tamaño máximo de espacios como 50
        
        // Ejectur la pantalla de inicio
        InfoScreen screen = new InfoScreen();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);

    }
    
}