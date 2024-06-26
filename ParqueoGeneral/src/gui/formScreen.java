/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import parqueogeneral.GestionarUsuario;
import parqueogeneral.Usuario;

/**
 *
 * @author fernandafajardo
 */
public class formScreen extends javax.swing.JFrame {
    
    private GestionarUsuario gestionarUsuarios;
    
    public formScreen(boolean isVisible) {
        initComponents();
        this.setVisible(isVisible);
        gestionarUsuarios = GestionarUsuario.getInstace();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        boxUsuario = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JLabel();
        boxCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boxPw = new javax.swing.JPasswordField();
        btnCreaCuenta = new javax.swing.JButton();
        txtApellido = new javax.swing.JLabel();
        boxApellido = new javax.swing.JTextField();
        labelErrorNombre = new javax.swing.JLabel();
        labelErrorApellidos = new javax.swing.JLabel();
        labelErrorUsuario = new javax.swing.JLabel();
        labelErrorCorreo = new javax.swing.JLabel();
        labelErrorPw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 51, 140));

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Ingrese sus datos para la creación de la cuenta");

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre Completo");

        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Nombre de Usuario");

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("Correo Electronico");

        boxCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCorreoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        btnCreaCuenta.setText("CREAR CUENTA");
        btnCreaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaCuentaActionPerformed(evt);
            }
        });

        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("Apellidos");

        boxApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxApellidoActionPerformed(evt);
            }
        });

        labelErrorNombre.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        labelErrorNombre.setForeground(new java.awt.Color(255, 218, 0));

        labelErrorApellidos.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        labelErrorApellidos.setForeground(new java.awt.Color(255, 218, 0));

        labelErrorUsuario.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        labelErrorUsuario.setForeground(new java.awt.Color(255, 218, 0));

        labelErrorCorreo.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        labelErrorCorreo.setForeground(new java.awt.Color(255, 218, 0));

        labelErrorPw.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        labelErrorPw.setForeground(new java.awt.Color(255, 218, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxNombre)
                            .addComponent(txtUsuario)
                            .addComponent(boxUsuario)
                            .addComponent(txtCorreo)
                            .addComponent(boxCorreo)
                            .addComponent(jLabel1)
                            .addComponent(boxPw)
                            .addComponent(txtApellido)
                            .addComponent(boxApellido)
                            .addComponent(labelErrorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelErrorApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelErrorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelErrorCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelErrorPw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnCreaCuenta)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtTitulo)
                .addGap(39, 39, 39)
                .addComponent(txtNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorUsuario)
                .addGap(10, 10, 10)
                .addComponent(txtCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorCorreo)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorPw)
                .addGap(18, 18, 18)
                .addComponent(btnCreaCuenta)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaCuentaActionPerformed
        
        boolean datosValidos = true;
                
        //Captura los datos del formulario
        String nombre = boxNombre.getText();
        String apellido = boxApellido.getText();
        String usuario = boxUsuario.getText().trim();
        String correo = boxCorreo.getText();
        String password = new String(boxPw.getPassword()).trim();
        
        // Inicializar las etiquetas de error
        labelErrorNombre.setText("");
        labelErrorApellidos.setText("");
        labelErrorUsuario.setText("");
        labelErrorCorreo.setText("");
        labelErrorPw.setText("");
        
        //Validar los campos y mostrar msj de error
        if(nombre.isEmpty()){
            labelErrorNombre.setText("El campo de 'Nombre Completo' es obligatirio.");
            datosValidos = false; 
        }
        if(apellido.isEmpty()){
            labelErrorApellidos.setText("El campo de 'Apellidos' es obligatirio.");
            datosValidos = false; 
        }
        if(usuario.isEmpty()){
            labelErrorUsuario.setText("El campo de 'Nombre de Usuario' es obligatirio.");
            datosValidos = false; 
        }
        if(correo.isEmpty()){
            labelErrorCorreo.setText("El campo de 'Correo Electronico' es obligatirio.");
            datosValidos = false; 
        }else{
           //Validación de formato de correo electronico
           String regexCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
           if(!correo.matches((regexCorreo))){
               labelErrorCorreo.setText("El formato del correo electrónico no es válido.");
               datosValidos = false;
           }
        }
        if(password.isEmpty()){
            labelErrorPw.setText("El campo de 'Contraseña' es obligatirio.");
            datosValidos = false; 
        }else{
            //Validar la contraseña
            if(password.length() < 8){
                labelErrorPw.setText("La contraseña debe de tener al menos 8 caracteres");
                datosValidos = false;
            }else{
                boolean tieneLetras = false;
                boolean tieneNumeros = false;
                
                for(char c : password.toCharArray()){
                    if(Character.isLetter(c)){
                        tieneLetras = true;
                    } else if(Character.isDigit(c)){
                        tieneNumeros = true;
                    }
                }
                
                if(!(tieneLetras && tieneNumeros)){
                    labelErrorPw.setText("La contraseña debe contener letras, números.");
                    datosValidos = false;
                }
            }
        }
        
        if(datosValidos){
            // Crear un nuevo objeto Usuario con estos datos:
            Usuario nuevoUsuario = new Usuario(nombre, apellido, usuario, correo, password, "Activo");
        
            // Se usa la instancia de Gestionar Usuario compartida
            GestionarUsuario gestionarUsuarios = GestionarUsuario.getInstace();
            gestionarUsuarios.anadirUsuario(nuevoUsuario);
            
            // Registro de depuración: Mostrar los datos del nuevo usuario - testeo
            System.out.println("Datos del nuevo usuario:");
            System.out.println("Nombre: " + nuevoUsuario.getNombre());
            System.out.println("Apellido: " + nuevoUsuario.getApellido());
            System.out.println("Usuario: " + nuevoUsuario.getUsuario());
            System.out.println("Password: " + nuevoUsuario.getPassword());
            System.out.println("Correo: " + nuevoUsuario.getCorreo());
            
            // Se cierra la ventana formScreen y muestra InfoScreen
            this.dispose();
            InfoScreen infoScreen = new InfoScreen();
            infoScreen.setVisible(true);
            infoScreen.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_btnCreaCuentaActionPerformed

    private void boxApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxApellidoActionPerformed

    private void boxCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxApellido;
    private javax.swing.JTextField boxCorreo;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JPasswordField boxPw;
    private javax.swing.JTextField boxUsuario;
    private javax.swing.JButton btnCreaCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrorApellidos;
    private javax.swing.JLabel labelErrorCorreo;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JLabel labelErrorPw;
    private javax.swing.JLabel labelErrorUsuario;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
