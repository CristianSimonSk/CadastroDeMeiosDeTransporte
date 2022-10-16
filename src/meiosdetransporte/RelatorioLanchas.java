package meiosdetransporte;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RelatorioLanchas extends javax.swing.JDialog {
    
    private MeiosDeTransporte DataBase;

    public RelatorioLanchas(java.awt.Frame parent, boolean modal, MeiosDeTransporte DataBase) {
        super(parent, modal);
        this.DataBase = DataBase;
        initComponents();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        relTabela = new javax.swing.JTable();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        relTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(relTabela);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(voltar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(voltar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tabela;
        String[][] infos;
        ArrayList<Lancha> Lanchas = DataBase.getLancha();
        titulo.setText("Relatório de Lanchas");
        String[] titulos = {"Modelo","Lugares","Comprimento","Ano","Cor","Motores","Marca"};
        infos = new String[Lanchas.size()][7];
        for(int i = 0; i < Lanchas.size(); i++){
            infos[i][0] = Lanchas.get(i).getModelo();
            infos[i][1] = String.valueOf(Lanchas.get(i).getNumLugares());
            infos[i][2] = String.valueOf(Lanchas.get(i).getComprimento());
            infos[i][3] = String.valueOf(Lanchas.get(i).getAno());
            infos[i][4] = Lanchas.get(i).getCor();
            infos[i][5] = String.valueOf(Lanchas.get(i).getNumMotores());
            infos[i][6] = Lanchas.get(i).getMarca();
        }
        tabela = new DefaultTableModel(infos, titulos);
        this.relTabela.setModel(tabela);          
    }//GEN-LAST:event_formWindowActivated

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable relTabela;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
