
package meiosdetransporte;

public class mainPage extends javax.swing.JFrame {

    private MeiosDeTransporte DataBase = new MeiosDeTransporte();
    private CadastrarCarro cadCarros = new CadastrarCarro(new java.awt.Frame(), true, DataBase);
    private CadastrarLancha cadLanchas = new CadastrarLancha(new java.awt.Frame(), true, DataBase);
    private CadastrarAviao cadAvioes = new CadastrarAviao(new java.awt.Frame(), true, DataBase);
    //private RelatorioCarros relCarros = new RelatorioCarros(new java.awt.Frame(), true, DataBase);
    //private RelatorioAvioes relAvioes = new RelatorioAvioes(new java.awt.Frame(), true, DataBase);
    //private RelatorioLanchas relLanchas = new RelatorioLanchas(new java.awt.Frame(), true, DataBase);
    private Relatorios relCarros = new Relatorios(new java.awt.Frame(), true,0, DataBase);
    private Relatorios relAvioes = new Relatorios(new java.awt.Frame(), true,1, DataBase);
    private Relatorios relLanchas = new Relatorios(new java.awt.Frame(), true, 2, DataBase);
    
    public mainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadCarro = new javax.swing.JMenuItem();
        cadAviao = new javax.swing.JMenuItem();
        cadLancha = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        relCarro = new javax.swing.JMenuItem();
        relAviao = new javax.swing.JMenuItem();
        relLancha = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("MEIOS DE TRANSPORTE");

        jMenu1.setText("Cadastros");

        cadCarro.setText("Cadastrar Carro");
        cadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCarroActionPerformed(evt);
            }
        });
        jMenu1.add(cadCarro);

        cadAviao.setText("Cadastrar Avião");
        cadAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAviaoActionPerformed(evt);
            }
        });
        jMenu1.add(cadAviao);

        cadLancha.setText("Cadastrar Lancha");
        cadLancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadLanchaActionPerformed(evt);
            }
        });
        jMenu1.add(cadLancha);

        Menu.add(jMenu1);

        jMenu2.setText("Relatórios");

        relCarro.setText("Relatório de Carros");
        relCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCarroActionPerformed(evt);
            }
        });
        jMenu2.add(relCarro);

        relAviao.setText("Relatório de Aviões");
        relAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relAviaoActionPerformed(evt);
            }
        });
        jMenu2.add(relAviao);

        relLancha.setText("Relatório de Lanchas");
        relLancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relLanchaActionPerformed(evt);
            }
        });
        jMenu2.add(relLancha);

        Menu.add(jMenu2);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCarroActionPerformed
        cadCarros.setVisible(true);
    }//GEN-LAST:event_cadCarroActionPerformed

    private void cadAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAviaoActionPerformed
        cadAvioes.setVisible(true);
    }//GEN-LAST:event_cadAviaoActionPerformed

    private void cadLanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadLanchaActionPerformed
        cadLanchas.setVisible(true);
    }//GEN-LAST:event_cadLanchaActionPerformed

    private void relCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCarroActionPerformed
        relCarros.setVisible(true);
    }//GEN-LAST:event_relCarroActionPerformed

    private void relAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relAviaoActionPerformed
        relAvioes.setVisible(true);
    }//GEN-LAST:event_relAviaoActionPerformed

    private void relLanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relLanchaActionPerformed
        relLanchas.setVisible(true);
    }//GEN-LAST:event_relLanchaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem cadAviao;
    private javax.swing.JMenuItem cadCarro;
    private javax.swing.JMenuItem cadLancha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem relAviao;
    private javax.swing.JMenuItem relCarro;
    private javax.swing.JMenuItem relLancha;
    // End of variables declaration//GEN-END:variables
}
