package view;

import controller.InsertionSort;
import controller.QuickSort;
import controller.SelectionSort;
import model.Results;
import model.Vetor;
import utils.Converte;

public class ProgramaPrincipal extends javax.swing.JFrame {
    
    private Vetor vetor;

    private Results resultsIS;
    private Results resultsQS;
    private Results resultsSS;

    public ProgramaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblImagemLogo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlQuick = new javax.swing.JPanel();
        lbQtdOrdanacoesQS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTempoAtualQS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTempoMedioQS = new javax.swing.JLabel();
        btnOrdenarQS = new javax.swing.JButton();
        pnlSelection = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbTempoAtualSS = new javax.swing.JLabel();
        lbTempoMedioSS = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbQtdOrdanacoesSS = new javax.swing.JLabel();
        btnOrdenarSS = new javax.swing.JButton();
        pnlInsertion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbTempoMedioIS = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbQtdOrdanacoesIS = new javax.swing.JLabel();
        lbTempoAtualIS = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnOrdenarIS = new javax.swing.JButton();
        pnlButtons = new javax.swing.JPanel();
        btnGerarVetor = new javax.swing.JButton();
        inputTamanhoVetor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenação de Dados");
        setBackground(java.awt.Color.lightGray);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addGroup(pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLogoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 55));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnlQuick.setBackground(java.awt.Color.gray);
        pnlQuick.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlQuick.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlQuickComponentAdded(evt);
            }
        });
        pnlQuick.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbQtdOrdanacoesQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesQS.setText("0");
        pnlQuick.add(lbQtdOrdanacoesQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 80, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Vezes ordenado:");
        jLabel1.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlQuick.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 150, -1));

        lbTempoAtualQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoAtualQS.setText("0ms");
        pnlQuick.add(lbTempoAtualQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 260, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("  Tempo de ordenação atual:");
        pnlQuick.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tempo Médio:");
        jLabel5.setPreferredSize(new java.awt.Dimension(144, 24));
        pnlQuick.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 120, -1));

        lbTempoMedioQS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioQS.setText("0ms");
        pnlQuick.add(lbTempoMedioQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 260, -1));

        btnOrdenarQS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarQS.setText("Ordenar");
        btnOrdenarQS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarQS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarQSActionPerformed(evt);
            }
        });
        pnlQuick.add(btnOrdenarQS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 30));

        jTabbedPane1.addTab("QuickSort", pnlQuick);

        pnlSelection.setBackground(java.awt.Color.gray);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("  Tempo de ordenação atual:");

        lbTempoAtualSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoAtualSS.setText("0ms");

        lbTempoMedioSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioSS.setText("0ms");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tempo Médio:");
        jLabel6.setPreferredSize(new java.awt.Dimension(144, 24));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vezes ordenado:");
        jLabel2.setPreferredSize(new java.awt.Dimension(144, 24));

        lbQtdOrdanacoesSS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesSS.setText("0");

        btnOrdenarSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarSS.setText("Ordenar");
        btnOrdenarSS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarSSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelectionLayout = new javax.swing.GroupLayout(pnlSelection);
        pnlSelection.setLayout(pnlSelectionLayout);
        pnlSelectionLayout.setHorizontalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectionLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectionLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(lbTempoAtualSS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSelectionLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbTempoMedioSS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSelectionLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbQtdOrdanacoesSS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSelectionLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnOrdenarSS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        pnlSelectionLayout.setVerticalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectionLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lbTempoAtualSS))
                .addGap(6, 6, 6)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTempoMedioSS))
                .addGap(6, 6, 6)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQtdOrdanacoesSS))
                .addGap(36, 36, 36)
                .addComponent(btnOrdenarSS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("SelectionSort", pnlSelection);

        pnlInsertion.setBackground(java.awt.Color.gray);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("  Tempo de ordenação atual:");

        lbTempoMedioIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoMedioIS.setText("0ms");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tempo Médio:");
        jLabel9.setPreferredSize(new java.awt.Dimension(144, 24));

        lbQtdOrdanacoesIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbQtdOrdanacoesIS.setText("0");

        lbTempoAtualIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTempoAtualIS.setText("0ms");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Vezes ordenado:");
        jLabel10.setPreferredSize(new java.awt.Dimension(144, 24));

        btnOrdenarIS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenarIS.setText("Ordenar");
        btnOrdenarIS.setPreferredSize(new java.awt.Dimension(107, 29));
        btnOrdenarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarISActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInsertionLayout = new javax.swing.GroupLayout(pnlInsertion);
        pnlInsertion.setLayout(pnlInsertionLayout);
        pnlInsertionLayout.setHorizontalGroup(
            pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertionLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInsertionLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(lbTempoAtualIS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertionLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbTempoMedioIS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertionLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbQtdOrdanacoesIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertionLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnOrdenarIS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        pnlInsertionLayout.setVerticalGroup(
            pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertionLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lbTempoAtualIS))
                .addGap(6, 6, 6)
                .addGroup(pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTempoMedioIS))
                .addGap(6, 6, 6)
                .addGroup(pnlInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQtdOrdanacoesIS))
                .addGap(36, 36, 36)
                .addComponent(btnOrdenarIS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("InsertionSort", pnlInsertion);

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        btnGerarVetor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGerarVetor.setText("Gerar vetor");
        btnGerarVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarVetorActionPerformed(evt);
            }
        });

        inputTamanhoVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamanhoVetorActionPerformed(evt);
            }
        });

        jLabel7.setText("Tamanho do Vetor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(btnGerarVetor)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTamanhoVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTamanhoVetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerarVetor)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlQuickComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlQuickComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlQuickComponentAdded

    private void  ResetResults() {
        this.resultsIS = new Results();
        this.resultsQS = new Results();
        this.resultsSS = new Results();
    }
    
    private void btnGerarVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarVetorActionPerformed
        this.ResetResults();
        
        int tamanhoVetor = Converte.textToValue(inputTamanhoVetor.getText());
        Vetor vetor = new Vetor(tamanhoVetor, 100); 
        System.out.println("Tamanho: "+vetor.getTamanho()+" elementos");
        this.setVetor(vetor);
        
        this.AtualizarLbIS();
        this.AtualizarLbSS();
        this.AtualizarLbQS();
    }//GEN-LAST:event_btnGerarVetorActionPerformed

    public Vetor getVetor() {
        return vetor;
    }

    public void setVetor(Vetor vetor) {
        this.vetor = vetor;
    }

    private void btnOrdenarQSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarQSActionPerformed
        int[] vetorQS = vetor.getElementos();
        long tempoInicialQuickSort = System.currentTimeMillis();
        QuickSort.quickSort(vetorQS, 0, vetorQS.length -1);
        long tempoQuickSort = System.currentTimeMillis() - tempoInicialQuickSort;
        this.vetor.printElementos();
        resultsQS.setTempoAtual(tempoQuickSort);
        
        this.AtualizarLbQS();
    }//GEN-LAST:event_btnOrdenarQSActionPerformed

    private void AtualizarLbQS() {
        this.lbTempoAtualQS.setText(resultsQS.getTempoAtual() + "ms");
        this.lbTempoMedioQS.setText(resultsQS.getTempoMedio() + "ms");
        this.lbQtdOrdanacoesQS.setText(resultsQS.getQtdOrdenacoes() + "");
    }
    
    private void inputTamanhoVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamanhoVetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamanhoVetorActionPerformed

    private void btnOrdenarSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarSSActionPerformed
        int[] vetorSS = vetor.getElementos();
        long tempoInicialSS = System.currentTimeMillis();
        SelectionSort.selectionSort(vetorSS);
        long tempoSS = System.currentTimeMillis() - tempoInicialSS;
        resultsSS.setTempoAtual(tempoSS);
        
        this.AtualizarLbSS();
    }//GEN-LAST:event_btnOrdenarSSActionPerformed

    private void AtualizarLbSS() {
        this.lbTempoAtualSS.setText(resultsSS.getTempoAtual() + "ms");
        this.lbTempoMedioSS.setText(resultsSS.getTempoMedio() + "ms");
        this.lbQtdOrdanacoesSS.setText(resultsSS.getQtdOrdenacoes() + "");
    }    
    
    private void btnOrdenarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarISActionPerformed
        int[] vetorSS = vetor.getElementos();
        long tempoInicialIS = System.currentTimeMillis();
        InsertionSort.insertionSort(vetorSS);
        long tempoIS = System.currentTimeMillis() - tempoInicialIS;
        resultsIS.setTempoAtual(tempoIS);
        
        this.AtualizarLbIS();
    }//GEN-LAST:event_btnOrdenarISActionPerformed

    private void AtualizarLbIS() {
        this.lbTempoAtualIS.setText(resultsIS.getTempoAtual() + "ms");
        this.lbTempoMedioIS.setText(resultsIS.getTempoMedio() + "ms");
        this.lbQtdOrdanacoesIS.setText(resultsIS.getQtdOrdenacoes() + "");
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
            java.util.logging.Logger.getLogger(ProgramaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaPrincipal().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarVetor;
    private javax.swing.JButton btnOrdenarIS;
    private javax.swing.JButton btnOrdenarQS;
    private javax.swing.JButton btnOrdenarSS;
    private javax.swing.JTextField inputTamanhoVetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbQtdOrdanacoesIS;
    private javax.swing.JLabel lbQtdOrdanacoesQS;
    private javax.swing.JLabel lbQtdOrdanacoesSS;
    private javax.swing.JLabel lbTempoAtualIS;
    private javax.swing.JLabel lbTempoAtualQS;
    private javax.swing.JLabel lbTempoAtualSS;
    private javax.swing.JLabel lbTempoMedioIS;
    private javax.swing.JLabel lbTempoMedioQS;
    private javax.swing.JLabel lbTempoMedioSS;
    private javax.swing.JLabel lblImagemLogo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlInsertion;
    private javax.swing.JPanel pnlQuick;
    private javax.swing.JPanel pnlSelection;
    // End of variables declaration//GEN-END:variables
}
