
import javax.swing.JOptionPane;

public class cadastroVIEW extends javax.swing.JFrame {

    public cadastroVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sistemaDeLeiloes = new javax.swing.JLabel();
        cadastreUmNovoProduto = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        separadorUm = new javax.swing.JSeparator();
        separadorDois = new javax.swing.JSeparator();
        botaoCadastrar = new javax.swing.JButton();
        botaoConsultarProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sistemaDeLeiloes.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        sistemaDeLeiloes.setText("Sistema de Leilões");

        cadastreUmNovoProduto.setText("Cadastre um novo produto");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome:");

        valor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valor.setText("Valor:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(153, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoConsultarProdutos.setText("Consultar Produtos");
        botaoConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(botaoCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(sistemaDeLeiloes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoConsultarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadorDois, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(cadastreUmNovoProduto))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nome)
                                .addComponent(valor))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome)
                                .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(separadorUm, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(sistemaDeLeiloes)
                .addGap(30, 30, 30)
                .addComponent(separadorDois, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastreUmNovoProduto)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botaoCadastrar)
                .addGap(18, 18, 18)
                .addComponent(separadorUm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botaoConsultarProdutos)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
        ProdutosDAO produtosDao = new ProdutosDAO();
        ProdutosDTO produtos = new ProdutosDTO();

        String nome = txtNome.getText();
        int valor = Integer.parseInt(txtValor.getText());

            produtos.setNome(nome);
            produtos.setValor(valor);

        int resposta = produtosDao.cadastrarProduto(produtos);

        if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso.");

            txtNome.setText("");
            txtValor.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto.");
        }

    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, "Erro: formato numérico inválido.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
    }
        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarProdutosActionPerformed
        listagemVIEW listagem = new listagemVIEW(); 
        listagem.setVisible(true);
    }//GEN-LAST:event_botaoConsultarProdutosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsultarProdutos;
    private javax.swing.JLabel cadastreUmNovoProduto;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separadorDois;
    private javax.swing.JSeparator separadorUm;
    private javax.swing.JLabel sistemaDeLeiloes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
