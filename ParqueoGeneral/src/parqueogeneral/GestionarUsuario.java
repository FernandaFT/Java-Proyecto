
package parqueogeneral;

public class GestionarUsuario {
    //Array de los Usuarios
    public Usuario[] usuarios;
    public int numeroUsuarios;
    
    // Se declara la instancio como una variable estática para que
    // sea compartida entre diferentes clases y objetos sin necesidad de crear multiples instancias
    private static GestionarUsuario instance;
    
    // Constructor privado para evitar creacion de instancias externas
    private GestionarUsuario(int capacidad){
        usuarios = new Usuario[capacidad]; // inicializamos el Array
        numeroUsuarios = 0;
    }
    
    // Método para obtener la instancia única
    public static GestionarUsuario getInstace(){
        if(instance == null){
            instance = new GestionarUsuario(10000);
        }
        return instance;
    }
    
    // Agregar Usuarios
    public void anadirUsuario(Usuario usuario){
        if(numeroUsuarios < usuarios.length){
            usuarios[numeroUsuarios] = usuario; // si la condición se cumple añade el usuario en el parametro
            numeroUsuarios++;
            
            // Registro de depuración: Mostrar los datos del usuario agregado - testeo
            System.out.println("Usuario agregado:");
            System.out.println("Usuario: " + usuario.getUsuario());
            System.out.println("Password: " + usuario.getPassword());
        }else{
            // Anadir una alerta "esta lleno el registro de Usuarios"
        }
    }
    
    // Autenticar al Usuario
    public Usuario autenticarUsuario(String usuario, String password){
        
        for(int i = 0; i < numeroUsuarios; i++){
            if(usuarios[i].getUsuario().equals(usuario) && usuarios[i].getPassword().equals(password)){
                return usuarios[i];
            }
        }
        return null; // No se encontro el usuario
    }
    
}
