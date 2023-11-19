
package parqueogeneral;

public class Parqueo {
   // Array de espacios en el parqueo 
   private Espacio [] espacios;
   
   private int cantidadEspacios;
   private int cantidadDiscapacitados;
   private int cantidadCargaElectrica;
   private int cantidadTechados;
   private int cantidadRegulares;

   
   // Constructor
   public Parqueo(int cantidadEspacios){
       this.espacios = new Espacio[cantidadEspacios];
       this.cantidadEspacios = 0;
       this.cantidadDiscapacitados = 0;
       this.cantidadCargaElectrica = 0;
       this.cantidadRegulares = 0;
       this.cantidadTechados = 0;
       
   }          
}
//