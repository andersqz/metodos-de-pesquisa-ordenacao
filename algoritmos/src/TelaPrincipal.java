
import java.util.ArrayList;


public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());
    
    Ordenacao ordenacao = new Ordenacao();
    private ArrayList<Integer> lista;
    private Arquivo arquivo;
    

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCaminho = new javax.swing.JTextField();
        cmbAlgoritmo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnExecutar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtQtdNumeros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtdTrocas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQtdComparacoes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Caminho do Arquivo");

        cmbAlgoritmo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolha" }));

        jLabel2.setText("Algorítmo");

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(this::btnExecutarActionPerformed);

        jLabel3.setText("Quantidade de números");

        txtQtdNumeros.setEditable(false);

        jLabel4.setText("Quantidade de trocas");

        txtQtdTrocas.setEditable(false);

        jLabel5.setText("Quantidade de comparações");

        txtQtdComparacoes.setEditable(false);
        txtQtdComparacoes.addActionListener(this::txtQtdComparacoesActionPerformed);

        jLabel6.setText("Tempo (Ms)");

        txtTempo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCaminho)
                    .addComponent(cmbAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtQtdNumeros)
                    .addComponent(txtQtdTrocas)
                    .addComponent(txtQtdComparacoes)
                    .addComponent(txtTempo))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(btnExecutar)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdTrocas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQtdComparacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdComparacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdComparacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdComparacoesActionPerformed

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        String caminho = txtCaminho.getText();
        
        arquivo = new Arquivo(caminho);
        lista = arquivo.leArquivo();
        
        String metodo = (String) cmbAlgoritmo.getSelectedItem();
        
        if (metodo.equals("Bolha")) {
            
            long tempoInicial = System.nanoTime();
            lista = ordenacao.Bolha(lista);
            long tempoFinal = System.nanoTime();
            
            double tempoExecucaoMs = (tempoFinal - tempoInicial) / 1_000_000.0;
            
            String qtdNumeros = String.valueOf(lista.size());
            String qtdTrocas = String.valueOf(ordenacao.getQtdTrocas());
            String qtdComparacoes = String.valueOf(ordenacao.getQtdComparacao());
            
            txtQtdNumeros.setText(qtdNumeros);
            txtQtdTrocas.setText(qtdTrocas);
            txtQtdComparacoes.setText(qtdComparacoes);
            txtTempo.setText(Double.toString(tempoExecucaoMs));
            
            System.out.println("qtd numeros: " + qtdNumeros);
            System.out.println("qtd trocas: " + ordenacao.getQtdTrocas());
            System.out.println("qtd comparacoes: " + ordenacao.getQtdComparacao());
            System.out.println("tempo (ms): " + tempoExecucaoMs);
        }
        
    }//GEN-LAST:event_btnExecutarActionPerformed
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JComboBox<String> cmbAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCaminho;
    private javax.swing.JTextField txtQtdComparacoes;
    private javax.swing.JTextField txtQtdNumeros;
    private javax.swing.JTextField txtQtdTrocas;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
