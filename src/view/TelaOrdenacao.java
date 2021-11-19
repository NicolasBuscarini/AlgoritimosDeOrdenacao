package view;

import controller.InsertionSort;
import controller.QuickSort;
import controller.SelectionSort;
import javax.swing.JOptionPane;
import model.Results;
import model.Vetor;
import utils.LimitaJTextField;
import utils.Converte;

public class TelaOrdenacao extends javax.swing.JFrame {
    
    private Results resultsIS, resultsQS, resultsSS;

    public TelaOrdenacao() {
        initComponents();
        setLocationRelativeTo(null);
        inputTamanhoVetor.setDocument(new LimitaJTextField());  // Limita apenas numeros e limite de 7 caracteres.
        this.ResetResults();
        inputTamanhoVetor.setText("10000");   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblImagemLogo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlQuick = new javax.swing.JPanel();
        lbResultadoQtdOrdanacoesQS = new javax.swing.JLabel();
        lbQtdOrdanacoesQS = new javax.swing.JLabel();
        lbResultadoTempoOrdenacaoQS = new javax.swing.JLabel();
        lbTempoOrdenacaoQS = new javax.swing.JLabel();
        lbTempoMedioQS = new javax.swing.JLabel();
        lbResultadoTempoMedioQS = new javax.swing.JLabel();
        btnOrdenarQS = new javax.swing.JButton();
        pnlSelection = new javax.swing.JPanel();
        lbTempoOrdenacaoSS = new javax.swing.JLabel();
        lbResultadoTempoOrdenacaoSS = new javax.swing.JLabel();
        lbResultadoTempoMedioSS = new javax.swing.JLabel();
        lbTempoMedioSS = new javax.swing.JLabel();
        lbQtdOrdanacoesSS = new javax.swing.JLabel();
        lbResultadoQtdOrdanacoesSS = new javax.swing.JLabel();
        btnOrdenarSS = new javax.swing.JButton();
        pnlInsertion = new javax.swing.JPanel();
        lbTempoOrdenacaoIS = new javax.swing.JLabel();
        lbResultadoTempoMedioIS = new javax.swing.JLabel();
        lbTempoMedioIS = new javax.swing.JLabel();
        lbResultadoQtdOrdanacoesIS = new javax.swing.JLabel();
        lbResultadoTempoOrdenacaoIS = new javax.swing.JLabel();
        lbQtdOrdanacoesIS = new javax.swing.JLabel();
        btnOrdenarIS = new javax.swing.JButton();
        pnlButtons = new javax.swing.JPanel();
        inputTamanhoVetor = new javax.swing.JTextField();
        lbTamanhoVetor = new javax.swing.JLabel();
        lbAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenação de Dados");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLogo.setForeground(java.awt.Color.lightGray);

        lblLogo.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Ordenação de Dados");

        lblImagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gears-set.png"))); // NOI18N

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblImagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(pnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 735, 151));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 55));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnlQuick.setBackground(java.awt.Color.gray);
        pnlQuick.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlQuick.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlQuickComponentAdded(evt);
            }
        });
        pnlQuick.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbResultadoQtdOrdanacoesQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoQtdOrdanacoesQS.setText("0");
        pnlQuick.add(lbResultadoQtdOrdanacoesQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 137, -1));

        lbQtdOrdanacoesQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesQS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQtdOrdanacoesQS.setText("Vezes ordenado:");
        lbQtdOrdanacoesQS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlQuick.add(lbQtdOrdanacoesQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, -1));

        lbResultadoTempoOrdenacaoQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoOrdenacaoQS.setText("0 ms");
        pnlQuick.add(lbResultadoTempoOrdenacaoQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 137, -1));

        lbTempoOrdenacaoQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoOrdenacaoQS.setText("  Tempo de ordenação atual:");
        lbTempoOrdenacaoQS.setToolTipText("");
        pnlQuick.add(lbTempoOrdenacaoQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 230, -1));

        lbTempoMedioQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioQS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTempoMedioQS.setText("Tempo Médio:");
        lbTempoMedioQS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlQuick.add(lbTempoMedioQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        lbResultadoTempoMedioQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoMedioQS.setText("0 ms");
        pnlQuick.add(lbResultadoTempoMedioQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 137, -1));

        btnOrdenarQS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarQS.setText("Ordenar");
        btnOrdenarQS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarQS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarQSActionPerformed(evt);
            }
        });
        pnlQuick.add(btnOrdenarQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 30));

        jTabbedPane1.addTab("QuickSort", pnlQuick);

        pnlSelection.setBackground(java.awt.Color.gray);
        pnlSelection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTempoOrdenacaoSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoOrdenacaoSS.setText("  Tempo de ordenação atual:");
        pnlSelection.add(lbTempoOrdenacaoSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lbResultadoTempoOrdenacaoSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoOrdenacaoSS.setText("0 ms");
        pnlSelection.add(lbResultadoTempoOrdenacaoSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 137, -1));

        lbResultadoTempoMedioSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoMedioSS.setText("0 ms");
        pnlSelection.add(lbResultadoTempoMedioSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 137, -1));

        lbTempoMedioSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioSS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTempoMedioSS.setText("Tempo Médio:");
        lbTempoMedioSS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlSelection.add(lbTempoMedioSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        lbQtdOrdanacoesSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesSS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQtdOrdanacoesSS.setText("Vezes ordenado:");
        lbQtdOrdanacoesSS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlSelection.add(lbQtdOrdanacoesSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, -1));

        lbResultadoQtdOrdanacoesSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoQtdOrdanacoesSS.setText("0");
        pnlSelection.add(lbResultadoQtdOrdanacoesSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 137, -1));

        btnOrdenarSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarSS.setText("Ordenar");
        btnOrdenarSS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarSSActionPerformed(evt);
            }
        });
        pnlSelection.add(btnOrdenarSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 30));

        jTabbedPane1.addTab("SelectionSort", pnlSelection);

        pnlInsertion.setBackground(java.awt.Color.gray);
        pnlInsertion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInsertion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTempoOrdenacaoIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoOrdenacaoIS.setText("  Tempo de ordenação atual:");
        pnlInsertion.add(lbTempoOrdenacaoIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        lbTempoOrdenacaoIS.getAccessibleContext().setAccessibleDescription("");

        lbResultadoTempoMedioIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoMedioIS.setText("0 ms");
        pnlInsertion.add(lbResultadoTempoMedioIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 137, -1));

        lbTempoMedioIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioIS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTempoMedioIS.setText("Tempo Médio:");
        lbTempoMedioIS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlInsertion.add(lbTempoMedioIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        lbResultadoQtdOrdanacoesIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoQtdOrdanacoesIS.setText("0");
        pnlInsertion.add(lbResultadoQtdOrdanacoesIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 137, -1));

        lbResultadoTempoOrdenacaoIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbResultadoTempoOrdenacaoIS.setText("0 ms");
        pnlInsertion.add(lbResultadoTempoOrdenacaoIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 137, -1));

        lbQtdOrdanacoesIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesIS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQtdOrdanacoesIS.setText("Vezes ordenado:");
        lbQtdOrdanacoesIS.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlInsertion.add(lbQtdOrdanacoesIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, -1));

        btnOrdenarIS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarIS.setText("Ordenar");
        btnOrdenarIS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarISActionPerformed(evt);
            }
        });
        pnlInsertion.add(btnOrdenarIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 30));

        jTabbedPane1.addTab("InsertionSort", pnlInsertion);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, 735, 285));

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        getContentPane().add(pnlButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 448, -1, -1));

        inputTamanhoVetor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputTamanhoVetor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTamanhoVetor.setToolTipText("");
        inputTamanhoVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamanhoVetorActionPerformed(evt);
            }
        });
        inputTamanhoVetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTamanhoVetorKeyPressed(evt);
            }
        });
        getContentPane().add(inputTamanhoVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 460, 108, -1));

        lbTamanhoVetor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTamanhoVetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTamanhoVetor.setText("Tamanho do Vetor:");
        getContentPane().add(lbTamanhoVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 464, -1, -1));

        lbAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 153, 0));
        lbAviso.setText("(Cuidado!! Se digitar um tamanho muito grande, poderá demorar para ordenar o vetor.)");
        getContentPane().add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 616, 52));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlQuickComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlQuickComponentAdded
    }//GEN-LAST:event_pnlQuickComponentAdded

    private void ResetResults() {
        this.resultsIS = new Results();
        this.resultsQS = new Results();
        this.resultsSS = new Results();
    }
    
    private int[] CriarVetor() {
        int tamanhoVetor = Converte.textToValue(inputTamanhoVetor.getText());
        Vetor vetor = new Vetor(tamanhoVetor, 100);
        
        return vetor.getElementos();
    }
    
    //PRINTAR VETOR NO CONSOLE
    private void printElementos(int elemento[]) {
        System.out.println("\n\n\n Vetor Ordenado \n ------------------");
            System.out.print("{ ");
            for(int i=0; i < elemento.length; i++ ) {
                System.out.print(elemento[i] + ", ");
                if(i != 0)
                    if ((i % 40) == 0)
                        System.out.print("\n");
            }
            System.out.print("} \n\n");
    }
    
    private void btnOrdenarQSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarQSActionPerformed
        try {
            int[] elementos = this.CriarVetor(); 

            long tempoInicialQuickSort = System.currentTimeMillis();
            QuickSort.quickSort(elementos, 0, elementos.length -1);
            long tempoQuickSort = System.currentTimeMillis() - tempoInicialQuickSort;

            resultsQS.setTempoAtual(tempoQuickSort);
            this.AtualizarLbQS();
            this.printElementos(elementos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tamanho do vetor incorreto", "Atenção", JOptionPane.WARNING_MESSAGE); 
            inputTamanhoVetor.requestFocus();
        }        
    }//GEN-LAST:event_btnOrdenarQSActionPerformed

    private void AtualizarLbQS() {
        this.lbResultadoTempoOrdenacaoQS.setText(resultsQS.getTempoAtual() + " ms");
        this.lbResultadoTempoMedioQS.setText(resultsQS.getTempoMedio() + " ms");
        this.lbResultadoQtdOrdanacoesQS.setText(resultsQS.getQtdOrdenacoes() + "");
    }
   
    private void inputTamanhoVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamanhoVetorActionPerformed
   
    }//GEN-LAST:event_inputTamanhoVetorActionPerformed

    private void btnOrdenarSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarSSActionPerformed
        try {
            int[] elementos = this.CriarVetor();
        
            long tempoInicialSS = System.currentTimeMillis();
            SelectionSort.selectionSort(elementos);
            long tempoSS = System.currentTimeMillis() - tempoInicialSS;

            resultsSS.setTempoAtual(tempoSS);        
            this.AtualizarLbSS();
            this.printElementos(elementos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tamanho do vetor incorreto", "Atenção", JOptionPane.WARNING_MESSAGE); 
            inputTamanhoVetor.requestFocus();
        }  
    }//GEN-LAST:event_btnOrdenarSSActionPerformed

    private void AtualizarLbSS() {
        this.lbResultadoTempoOrdenacaoSS.setText(resultsSS.getTempoAtual() + " ms");
        this.lbResultadoTempoMedioSS.setText(resultsSS.getTempoMedio() + " ms");
        this.lbResultadoQtdOrdanacoesSS.setText(resultsSS.getQtdOrdenacoes() + "");
    }    
    
    private void btnOrdenarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarISActionPerformed
        try {    
            int[] vetor = this.CriarVetor(); 

            long tempoInicialIS = System.currentTimeMillis();
            InsertionSort.insertionSort(vetor);
            long tempoIS = System.currentTimeMillis() - tempoInicialIS;

            resultsIS.setTempoAtual(tempoIS);        
            this.AtualizarLbIS();
            this.printElementos(vetor);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Tamanho do vetor incorreto", "Atenção", JOptionPane.WARNING_MESSAGE); 
            inputTamanhoVetor.requestFocus();
        }  
    }//GEN-LAST:event_btnOrdenarISActionPerformed

    private void inputTamanhoVetorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamanhoVetorKeyPressed
        this.ResetResults();
        this.AtualizarLbIS();
        this.AtualizarLbSS();
        this.AtualizarLbQS();
    }//GEN-LAST:event_inputTamanhoVetorKeyPressed

    private void AtualizarLbIS() {
        this.lbResultadoTempoOrdenacaoIS.setText(resultsIS.getTempoAtual() + " ms");
        this.lbResultadoTempoMedioIS.setText(resultsIS.getTempoMedio() + " ms");
        this.lbResultadoQtdOrdanacoesIS.setText(resultsIS.getQtdOrdenacoes() + "");
    } 
    
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
            java.util.logging.Logger.getLogger(TelaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrdenacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenarIS;
    private javax.swing.JButton btnOrdenarQS;
    private javax.swing.JButton btnOrdenarSS;
    private javax.swing.JTextField inputTamanhoVetor;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbQtdOrdanacoesIS;
    private javax.swing.JLabel lbQtdOrdanacoesQS;
    private javax.swing.JLabel lbQtdOrdanacoesSS;
    private javax.swing.JLabel lbResultadoQtdOrdanacoesIS;
    private javax.swing.JLabel lbResultadoQtdOrdanacoesQS;
    private javax.swing.JLabel lbResultadoQtdOrdanacoesSS;
    private javax.swing.JLabel lbResultadoTempoMedioIS;
    private javax.swing.JLabel lbResultadoTempoMedioQS;
    private javax.swing.JLabel lbResultadoTempoMedioSS;
    private javax.swing.JLabel lbResultadoTempoOrdenacaoIS;
    private javax.swing.JLabel lbResultadoTempoOrdenacaoQS;
    private javax.swing.JLabel lbResultadoTempoOrdenacaoSS;
    private javax.swing.JLabel lbTamanhoVetor;
    private javax.swing.JLabel lbTempoMedioIS;
    private javax.swing.JLabel lbTempoMedioQS;
    private javax.swing.JLabel lbTempoMedioSS;
    private javax.swing.JLabel lbTempoOrdenacaoIS;
    private javax.swing.JLabel lbTempoOrdenacaoQS;
    private javax.swing.JLabel lbTempoOrdenacaoSS;
    private javax.swing.JLabel lblImagemLogo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlInsertion;
    private javax.swing.JPanel pnlQuick;
    private javax.swing.JPanel pnlSelection;
    // End of variables declaration//GEN-END:variables
}
