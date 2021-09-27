

package ventanas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class nuevaalta extends javax.swing.JFrame {

   public static final String URL = "jdbc:mysql://localhost:3306/sirsh";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "nathanael-24";
    
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
    
    private void limpiarcajas(){
        
        txtclave.setText(null);
        txttitular.setText(null);
        txttelefono.setText(null);
        txtcorreo.setText(null);
        txtequipo.setText(null);
        txtfechaingreso.setText(null);
        txtfechasalida.setText(null);
        cbxmantenimiento.setSelectedIndex(0);
    }
    
    
    public nuevaalta() {
        initComponents();
        txtidlaboratorio.setVisible(false);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidlaboratorio = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtclave = new javax.swing.JTextField();
        lblclave = new javax.swing.JLabel();
        txttitular = new javax.swing.JTextField();
        lbltitular = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        lblcorreo = new javax.swing.JLabel();
        txtequipo = new javax.swing.JTextField();
        lblequipo = new javax.swing.JLabel();
        txtfechaingreso = new javax.swing.JTextField();
        lblfechaingreso = new javax.swing.JLabel();
        txtfechasalida = new javax.swing.JTextField();
        lblfechasalida = new javax.swing.JLabel();
        cbxmantenimiento = new javax.swing.JComboBox<>();
        lblmantenimiento = new javax.swing.JLabel();
        btnalta = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtidlaboratorio.setEnabled(false);
        txtidlaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidlaboratorioActionPerformed(evt);
            }
        });
        getContentPane().add(txtidlaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 77, -1));

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 99, -1));

        lblclave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblclave.setText("Clave:");
        getContentPane().add(lblclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(txttitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 203, -1));

        lbltitular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltitular.setText("Titular:");
        getContentPane().add(lbltitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 203, -1));

        lbltelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltelefono.setText("Telefono:");
        getContentPane().add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 203, -1));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcorreo.setText("E-mail");
        getContentPane().add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        getContentPane().add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 203, -1));

        lblequipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblequipo.setText("Equipo:");
        getContentPane().add(lblequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(txtfechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 203, -1));

        lblfechaingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfechaingreso.setText("Fecha ingreso:");
        getContentPane().add(lblfechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(txtfechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 203, -1));

        lblfechasalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfechasalida.setText("Fecha salida:");
        getContentPane().add(lblfechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cbxmantenimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Preventivo", "Correctivo" }));
        getContentPane().add(cbxmantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 203, -1));

        lblmantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmantenimiento.setText("Tipo de mantenimiento:");
        getContentPane().add(lblmantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnalta.setText("Alta");
        btnalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltaActionPerformed(evt);
            }
        });
        getContentPane().add(btnalta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 75, -1));

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo claro.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM laboratorio WHERE clave = ?");
            ps.setString(1, txtclave.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtidlaboratorio.setText(rs.getString("idlaboratorio"));
               txttitular.setText(rs.getString("titular"));
               txttelefono.setText(rs.getString("telefono"));
               txtcorreo.setText(rs.getString("correo"));
               txtequipo.setText(rs.getString("equipo"));
               txtfechaingreso.setText(rs.getString("fechaingreso"));
               cbxmantenimiento.setSelectedItem(rs.getString("mantenimiento"));
            } else{
                JOptionPane.showMessageDialog(null, "No existe un equipo con esa clave");
            }
            
            } catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        
        principal principal = new principal();
        principal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltaActionPerformed
        
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("INSERT INTO altas (clave,titular,telefono,correo,equipo,fechaalta,mantenimiento) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, txtclave.getText());
            ps.setString(2, txttitular.getText());
            ps.setString(3, txttelefono.getText());
            ps.setString(4, txtcorreo.getText());
            ps.setString(5, txtequipo.getText());
            ps.setDate(6, Date.valueOf(txtfechasalida.getText()));
            ps.setString(7, cbxmantenimiento.getSelectedItem().toString());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Equipo dado de alta con exito");
                limpiarcajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al dar equipo de alta");
                limpiarcajas();
            }
            
           
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM laboratorio WHERE idlaboratorio=?");
            ps.setInt(1, Integer.parseInt(txtidlaboratorio.getText ()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Equipo fuera de laboratorio");
                limpiarcajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al sacar de laboratorio");
                limpiarcajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnaltaActionPerformed

    private void txtidlaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidlaboratorioActionPerformed
        
        
        
    }//GEN-LAST:event_txtidlaboratorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nuevaalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaalta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalta;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cbxmantenimiento;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblequipo;
    private javax.swing.JLabel lblfechaingreso;
    private javax.swing.JLabel lblfechasalida;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblmantenimiento;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitular;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtequipo;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txtfechasalida;
    private javax.swing.JTextField txtidlaboratorio;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttitular;
    // End of variables declaration//GEN-END:variables
}
