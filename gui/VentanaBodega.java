package help.gui;

/**
 *
 * @author Nazir
 */
public class VentanaBodega extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaBodega.class.getName());

    public VentanaBodega() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        txt_menu = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JLabel();
        input_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        txt_ubicacion = new javax.swing.JLabel();
        input_ubicacion = new javax.swing.JTextField();
        btn_importar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        txt_menu.setText("Menú Bodega");

        txt_codigo.setBackground(new java.awt.Color(0, 0, 0));
        txt_codigo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_codigo.setText("Ingresa el código de la bodega:");

        txt_nombre.setBackground(new java.awt.Color(0, 0, 0));
        txt_nombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_nombre.setText("Ingresa el nombre de la bodega:");

        txt_ubicacion.setBackground(new java.awt.Color(0, 0, 0));
        txt_ubicacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_ubicacion.setText("Ingresa la ubicación de la bodega:");

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
                .addGap(175, 175, 175)
                .addComponent(txt_menu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_ubicacion, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btn_importar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_importar)
                    .addComponent(btn_exportar))
                .addContainerGap(36, Short.MAX_VALUE))
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

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(() -> new VentanaBodega().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_ubicacion;
    private javax.swing.JLabel txt_codigo;
    private javax.swing.JLabel txt_menu;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_ubicacion;
    // End of variables declaration//GEN-END:variables
}
