package help.gui;

import help.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Janin
 */
public class VentanaComputador extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaComputador.class.getName());

    public VentanaComputador() {
        initComponents();
    }
    
    public static boolean buscar = true;
    public static int criterio;
    public int posicionActualizar = -1;
    
    private void habilitarCampos() {

        input_marcaComputador.setEnabled(true);
        input_modeloComputador.setEnabled(true);
        input_ramComputador.setEnabled(true);
        input_valorComputador.setEnabled(true);

        input_marcaComputador.setText("");
        input_modeloComputador.setText("");
        input_ramComputador.setText("");
        input_valorComputador.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ordenarAscendente1 = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        txt_menú = new javax.swing.JLabel();
        txt_marcaComputador = new javax.swing.JLabel();
        input_marcaComputador = new javax.swing.JTextField();
        txt_modeloComputador = new javax.swing.JLabel();
        input_modeloComputador = new javax.swing.JTextField();
        txt_ramComputador = new javax.swing.JLabel();
        input_ramComputador = new javax.swing.JTextField();
        txt_valorComputador = new javax.swing.JLabel();
        input_valorComputador = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_ordenarAscendente = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_adicionar = new javax.swing.JButton();
        btn_copiar = new javax.swing.JButton();
        btn_ordenarDescendente = new javax.swing.JButton();
        btn_importar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();

        btn_ordenarAscendente1.setBackground(new java.awt.Color(204, 204, 204));
        btn_ordenarAscendente1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ordenarAscendente1.setText("Ordenar (A)↓");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        txt_menú.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        txt_menú.setText("Menú");

        txt_marcaComputador.setBackground(new java.awt.Color(0, 0, 0));
        txt_marcaComputador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_marcaComputador.setText("Ingresa la marca del computador: ");

        txt_modeloComputador.setBackground(new java.awt.Color(0, 0, 0));
        txt_modeloComputador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_modeloComputador.setText("Ingresa el modelo del computador: ");

        txt_ramComputador.setBackground(new java.awt.Color(0, 0, 0));
        txt_ramComputador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_ramComputador.setText("Ingresa la cantidad de RAM que tiene el computador :");

        txt_valorComputador.setBackground(new java.awt.Color(0, 0, 0));
        txt_valorComputador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_valorComputador.setText("Ingresa el valor que tiene el computador:");

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_buscar.setText("  Buscar  ");
        btn_buscar.addActionListener(this::btn_buscarActionPerformed);

        btn_ordenarAscendente.setBackground(new java.awt.Color(204, 204, 204));
        btn_ordenarAscendente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ordenarAscendente.setText("Ordenar (A)↓");
        btn_ordenarAscendente.addActionListener(this::btn_ordenarAscendenteActionPerformed);

        btn_actualizar.setBackground(new java.awt.Color(204, 204, 204));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(this::btn_actualizarActionPerformed);

        btn_eliminar.setBackground(new java.awt.Color(204, 204, 204));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(this::btn_eliminarActionPerformed);

        btn_mostrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_mostrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(this::btn_mostrarActionPerformed);

        btn_adicionar.setBackground(new java.awt.Color(204, 204, 204));
        btn_adicionar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(this::btn_adicionarActionPerformed);

        btn_copiar.setBackground(new java.awt.Color(204, 204, 204));
        btn_copiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_copiar.setText("Copiar");
        btn_copiar.addActionListener(this::btn_copiarActionPerformed);

        btn_ordenarDescendente.setBackground(new java.awt.Color(204, 204, 204));
        btn_ordenarDescendente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ordenarDescendente.setText("Ordenar (D)↑");
        btn_ordenarDescendente.addActionListener(this::btn_ordenarDescendenteActionPerformed);

        btn_importar.setBackground(new java.awt.Color(204, 204, 204));
        btn_importar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_importar.setText("Importar ");

        btn_exportar.setBackground(new java.awt.Color(204, 204, 204));
        btn_exportar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_exportar.setText(" Exportar");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(txt_menú)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_modeloComputador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marcaComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_modeloComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_valorComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ramComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(input_ramComputador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(input_valorComputador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_ordenarAscendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_ordenarDescendente, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(btn_importar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(btn_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(input_marcaComputador)
                        .addGap(39, 39, 39))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_menú, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_marcaComputador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_marcaComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_modeloComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_modeloComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txt_ramComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_ramComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txt_valorComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_valorComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar)
                    .addComponent(btn_mostrar)
                    .addComponent(btn_buscar)
                    .addComponent(btn_actualizar))
                .addGap(28, 28, 28)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ordenarAscendente)
                    .addComponent(btn_ordenarDescendente)
                    .addComponent(btn_copiar)
                    .addComponent(btn_eliminar))
                .addGap(28, 28, 28)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exportar)
                    .addComponent(btn_importar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        String marca = input_marcaComputador.getText();
        String modelo = input_modeloComputador.getText();
        int ram = Integer.parseInt(input_ramComputador.getText());
        double precio = Double.parseDouble(input_valorComputador.getText());

        Principal.adicionar(marca, modelo, ram, precio);
        JOptionPane.showMessageDialog(null, "Listo :)");
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        Principal.mostrarComputador();
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (buscar) {

            String dato = "";

            criterio = Principal.pedirCriterio();

            switch (criterio) {
                case 1:
                dato = JOptionPane.showInputDialog(null, "Ingresa la marca que deseas buscar");
                input_marcaComputador.setEnabled(false);
                break;

                case 2:
                dato = JOptionPane.showInputDialog(null, "Ingresa el modelo que deseas buscar");
                input_modeloComputador.setEnabled(false);
                break;

                case 3:
                dato = JOptionPane.showInputDialog(null, "Ingresa la cantidad de RAM del computador que deseas buscar");
                input_ramComputador.setEnabled(false);
                break;

                case 4:
                dato = JOptionPane.showInputDialog(null, "Ingresa el precio del computador que deseas buscar");
                input_valorComputador.setEnabled(false);
                break;
            }

            posicionActualizar = Principal.buscarX(criterio, dato);

            if (posicionActualizar != -1) {

                JOptionPane.showMessageDialog(null, "Computador encontrado. Ingresa los nuevos valores en los campos habilitados y presiona actualizar nuevamente :)");

                buscar = false;
                btn_buscar.setEnabled(false);

            } else {

                JOptionPane.showMessageDialog(null,"No encontramos ningún computador con los criterios de búsqueda");
                habilitarCampos();
            }

        } else {

            Principal.actualizarComputador(posicionActualizar, criterio, input_marcaComputador.getText(), input_modeloComputador.getText(), input_ramComputador.getText(), input_valorComputador.getText());

            habilitarCampos();

            buscar = true;
            posicionActualizar = -1;

            btn_buscar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (buscar) {

            criterio = Principal.pedirCriterio();

            switch (criterio) {
                case 1:
                    input_modeloComputador.setEnabled(false);
                    input_ramComputador.setEnabled(false);
                    input_valorComputador.setEnabled(false);
                break;

                case 2:
                    input_marcaComputador.setEnabled(false);
                    input_ramComputador.setEnabled(false);
                    input_valorComputador.setEnabled(false);
                break;

                case 3:
                    input_marcaComputador.setEnabled(false);
                    input_modeloComputador.setEnabled(false);
                    input_valorComputador.setEnabled(false);
                break;

                case 4:
                    input_marcaComputador.setEnabled(false);
                    input_modeloComputador.setEnabled(false);
                    input_ramComputador.setEnabled(false);
                break;
            }

            JOptionPane.showMessageDialog(null, "Ingresa el valor en el campo correspondiente y presiona buscar de nuevo :)");

            btn_actualizar.setEnabled(false);
            buscar = false;

        } else {
            String dato = "";

            switch (criterio) {
                case 1:
                dato = input_marcaComputador.getText();
                break;

                case 2:
                dato = input_modeloComputador.getText();
                break;

                case 3:
                dato = input_ramComputador.getText();
                break;

                case 4:
                dato = input_valorComputador.getText();
                break;
            }

            JOptionPane.showMessageDialog(null, Principal.buscarComputador(criterio, dato));

            habilitarCampos();

            btn_actualizar.setEnabled(true);

            buscar = true;
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_ordenarAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarAscendenteActionPerformed
        Principal.ordenarAscendente();

        Principal.mostrarComputador();
    }//GEN-LAST:event_btn_ordenarAscendenteActionPerformed

    private void btn_ordenarDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarDescendenteActionPerformed
        Principal.ordenarDescendente();

        Principal.mostrarComputador();
    }//GEN-LAST:event_btn_ordenarDescendenteActionPerformed

    private void btn_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiarActionPerformed
        Principal.copiarComputador();
    }//GEN-LAST:event_btn_copiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        String dato = "";

        criterio = Principal.pedirCriterio();

        switch (criterio) {
            case 1:
                dato = JOptionPane.showInputDialog(null, "Ingresa la marca que deseas buscar");
            break;

            case 2:
                dato = JOptionPane.showInputDialog(null, "Ingresa el modelo que deseas buscar");
            break;

            case 3:
                dato = JOptionPane.showInputDialog(null, "Ingresa la cantidad de RAM del computador que deseas buscar");
            break;

            case 4:
                dato = JOptionPane.showInputDialog(null, "Ingresa el precio del computador que deseas buscar");
            break;
        }

        if (dato.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            habilitarCampos();
            return;
        }

        posicionActualizar = Principal.buscarX(criterio, dato);

        if (posicionActualizar != -1) {

            Principal.eliminarComputador(posicionActualizar);


        } else {

            JOptionPane.showMessageDialog(null, "No encontramos ningún computador con esos criterios.");

            habilitarCampos();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaComputador().setVisible(true));
        
        Principal.adicionar("Lenovo", "mimimi", 16, 2000);
        Principal.adicionar("Asus", "Gaming", 32, 1500);
        Principal.adicionar("Samsung", "TUF", 8, 2500);
        Principal.adicionar("Acer", "Pro", 2, 3000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_copiar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_ordenarAscendente;
    private javax.swing.JButton btn_ordenarAscendente1;
    private javax.swing.JButton btn_ordenarDescendente;
    private javax.swing.JTextField input_marcaComputador;
    private javax.swing.JTextField input_modeloComputador;
    private javax.swing.JTextField input_ramComputador;
    private javax.swing.JTextField input_valorComputador;
    private javax.swing.JLabel txt_marcaComputador;
    private javax.swing.JLabel txt_menú;
    private javax.swing.JLabel txt_modeloComputador;
    private javax.swing.JLabel txt_ramComputador;
    private javax.swing.JLabel txt_valorComputador;
    // End of variables declaration//GEN-END:variables
}
