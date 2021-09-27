package ventanas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class entrada extends javax.swing.JFrame {

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

    private void limpiarcajas() {

        txtclave.setText(null);
        txttitular.setText(null);
        txttelefono.setText(null);
        txtcorreo.setText(null);
        txtequipo.setText(null);
        txtfecha.setText(null);
        cbxmantenimiento.setSelectedIndex(0);
    }

    public entrada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btningresar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        cbxmantenimiento = new javax.swing.JComboBox<>();
        txtfecha = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtequipo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txttitular = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        lblmantenimiento = new javax.swing.JLabel();
        lblequipo = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblclave = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbltitular = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        getContentPane().add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        cbxmantenimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Preventivo", "Correctivo" }));
        cbxmantenimiento.setToolTipText("");
        getContentPane().add(cbxmantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, -1));

        txtfecha.setToolTipText("\n");
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, -1));
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, -1));
        getContentPane().add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 200, -1));
        getContentPane().add(txttitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 200, -1));
        getContentPane().add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, -1));

        lblmantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmantenimiento.setText("Tipo de mantenimiento:");
        getContentPane().add(lblmantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 41));

        lblequipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblequipo.setText("Equipo:");
        getContentPane().add(lblequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfecha.setText("Fecha:");
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblclave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblclave.setText("Clave:");
        getContentPane().add(lblclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcorreo.setText("E-mail:");
        getContentPane().add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltelefono.setText("Telefono:");
        getContentPane().add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lbltitular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltitular.setText("Titular:");
        getContentPane().add(lbltitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo claro.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        Connection con = null;

        try {

            con = getConection();
            ps = con.prepareStatement("INSERT INTO laboratorio (clave,titular,telefono,correo,equipo,fechaingreso,mantenimiento) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, txtclave.getText());
            ps.setString(2, txttitular.getText());
            ps.setString(3, txttelefono.getText());
            ps.setString(4, txtcorreo.getText());
            ps.setString(5, txtequipo.getText());
            ps.setDate(6, Date.valueOf(txtfecha.getText()));
            ps.setString(7, cbxmantenimiento.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Equipo guardado");
                limpiarcajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al gauardar equipo");
                limpiarcajas();
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed

        principal principal = new principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    

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
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cbxmantenimiento;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblequipo;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblmantenimiento;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitular;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtequipo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttitular;
    // End of variables declaration//GEN-END:variables
}
