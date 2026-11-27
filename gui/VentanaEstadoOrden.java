package help.gui;

/**
 *
 * @author Nazir
 */
public class VentanaEstadoOrden extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaEstadoOrden.class.getName());

    public VentanaEstadoOrden() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        txt_menu = new javax.swing.JLabel();
        txt_estadoOrden = new javax.swing.JLabel();
        input_estadoOrden = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        txt_menu.setText("Menú EstadoOrden");

        txt_estadoOrden.setBackground(new java.awt.Color(0, 0, 0));
        txt_estadoOrden.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txt_estadoOrden.setText("Ingresa el estado de la orden:");

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_buscar.setText("  Buscar  ");

        btn_ordenarAscendente.setBackground(new java.awt.Color(204, 204, 204));
        btn_ordenarAscendente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ordenarAscendente.setText("Ordenar (A)↓");

        btn_actualizar.setBackground(new java.awt.Color(204, 204, 204));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");

        btn_eliminar.setBackground(new java.awt.Color(204, 204, 204));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");

        btn_mostrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_mostrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_mostrar.setText("Mostrar");

        btn_adicionar.setBackground(new java.awt.Color(204, 204, 204));
        btn_adicionar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_adicionar.setText("Adicionar");

        btn_copiar.setBackground(new java.awt.Color(204, 204, 204));
        btn_copiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_copiar.setText("Copiar");

        btn_ordenarDescendente.setBackground(new java.awt.Color(204, 204, 204));
        btn_ordenarDescendente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ordenarDescendente.setText("Ordenar (D)↑");

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
                .addGap(15, 15, 15)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_estadoOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_estadoOrden, javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_estadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_estadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        java.awt.EventQueue.invokeLater(() -> new VentanaEstadoOrden().setVisible(true));
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
    private javax.swing.JButton btn_ordenarDescendente;
    private javax.swing.JTextField input_estadoOrden;
    private javax.swing.JLabel txt_estadoOrden;
    private javax.swing.JLabel txt_menu;
    // End of variables declaration//GEN-END:variables
}
