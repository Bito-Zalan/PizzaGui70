
package pizzarendeles;

import javax.swing.JOptionPane;


public class PizzaRendelo extends javax.swing.JFrame {

   
    public PizzaRendelo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        BtnRendeles = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSzoszSonkas = new javax.swing.JLabel();
        lblMeretSonkas = new javax.swing.JLabel();
        spinnerSonkas = new javax.swing.JSpinner();
        lblSonkasKukoricas = new javax.swing.JLabel();
        cmbSzoszSonkas = new javax.swing.JComboBox<>();
        rdbSonkas60cm = new javax.swing.JRadioButton();
        rdbSonkas32cm = new javax.swing.JRadioButton();
        rdbSonkas45cm = new javax.swing.JRadioButton();
        BtnMegse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSzoszSzalamis = new javax.swing.JLabel();
        lblMeretSzalamis = new javax.swing.JLabel();
        spinnerSzalamis = new javax.swing.JSpinner();
        lblSzalamis = new javax.swing.JLabel();
        cmbSzoszSzalamis = new javax.swing.JComboBox<>();
        rdbSzalamis60cm = new javax.swing.JRadioButton();
        rdbSzalamis32cm = new javax.swing.JRadioButton();
        rdbSzalamis45cm = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        lblSzoszSonkas2 = new javax.swing.JLabel();
        lblMeretSonkas2 = new javax.swing.JLabel();
        spinnerSonkas2 = new javax.swing.JSpinner();
        lblSonkasKukoricas2 = new javax.swing.JLabel();
        cmbSzoszSonkas2 = new javax.swing.JComboBox<>();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BtnRendeles.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BtnRendeles.setText("Rendelés leadása");
        BtnRendeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRendelesMouseEntered(evt);
            }
        });
        BtnRendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRendelesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Megjegyzés:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel5.setText("Pizza Gui");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblSzoszSonkas.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSzoszSonkas.setText("Szósz:");

        lblMeretSonkas.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblMeretSonkas.setText("Méret");

        spinnerSonkas.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        spinnerSonkas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinnerSonkas.setBorder(null);

        lblSonkasKukoricas.setText("Sonkás kukoricás");

        cmbSzoszSonkas.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cmbSzoszSonkas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alapszósz: Paradicsomos", "Fokhagymás szósz", "Tzaziki szósz" }));
        cmbSzoszSonkas.setBorder(null);

        buttonGroup1.add(rdbSonkas60cm);
        rdbSonkas60cm.setText("60 cm");

        buttonGroup1.add(rdbSonkas32cm);
        rdbSonkas32cm.setText("32 cm");

        buttonGroup1.add(rdbSonkas45cm);
        rdbSonkas45cm.setText("45 cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSonkasKukoricas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinnerSonkas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSzoszSonkas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSzoszSonkas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbSonkas32cm)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbSonkas45cm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(rdbSonkas60cm))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblMeretSonkas)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSonkas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSonkasKukoricas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMeretSonkas)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSonkas60cm)
                    .addComponent(rdbSonkas32cm)
                    .addComponent(rdbSonkas45cm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSzoszSonkas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSzoszSonkas))
                .addContainerGap())
        );

        BtnMegse.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BtnMegse.setText("Mégse");
        BtnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMegseActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PizzaKepek/sonka kukorica 3.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PizzaKepek/magyaros 3.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PizzaKepek/szalámis.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblSzoszSzalamis.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSzoszSzalamis.setText("Szósz:");

        lblMeretSzalamis.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblMeretSzalamis.setText("Méret");

        spinnerSzalamis.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        spinnerSzalamis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinnerSzalamis.setBorder(null);

        lblSzalamis.setText("Szalámis sajtos");

        cmbSzoszSzalamis.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cmbSzoszSzalamis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alapszósz: Paradicsomos", "Fokhagymás szósz", "Tzaziki szósz" }));
        cmbSzoszSzalamis.setBorder(null);

        buttonGroup2.add(rdbSzalamis60cm);
        rdbSzalamis60cm.setText("60 cm");

        buttonGroup2.add(rdbSzalamis32cm);
        rdbSzalamis32cm.setText("32 cm");

        buttonGroup2.add(rdbSzalamis45cm);
        rdbSzalamis45cm.setText("45 cm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblSzalamis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinnerSzalamis, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblSzoszSzalamis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSzoszSzalamis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rdbSzalamis32cm)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rdbSzalamis45cm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(rdbSzalamis60cm))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblMeretSzalamis)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSzalamis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSzalamis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMeretSzalamis)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSzalamis60cm)
                    .addComponent(rdbSzalamis32cm)
                    .addComponent(rdbSzalamis45cm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSzoszSzalamis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSzoszSzalamis))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblSzoszSonkas2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSzoszSonkas2.setText("Szósz:");
        lblSzoszSonkas2.setEnabled(false);

        lblMeretSonkas2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblMeretSonkas2.setText("Méret");
        lblMeretSonkas2.setEnabled(false);

        spinnerSonkas2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        spinnerSonkas2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinnerSonkas2.setBorder(null);
        spinnerSonkas2.setEnabled(false);

        lblSonkasKukoricas2.setText("Magyaros");
        lblSonkasKukoricas2.setEnabled(false);

        cmbSzoszSonkas2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cmbSzoszSonkas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alapszósz: Paradicsomos", "Fokhagymás szósz", "Tzaziki szósz" }));
        cmbSzoszSonkas2.setBorder(null);
        cmbSzoszSonkas2.setEnabled(false);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("60 cm");
        jRadioButton7.setEnabled(false);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("32 cm");
        jRadioButton8.setEnabled(false);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("45 cm");
        jRadioButton9.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblSonkasKukoricas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinnerSonkas2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblSzoszSonkas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSzoszSonkas2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jRadioButton7))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblMeretSonkas2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSonkas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSonkasKukoricas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMeretSonkas2)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSzoszSonkas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSzoszSonkas2))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Ártábla");

        jLabel6.setText("32 cm Pizza: 1290 Ft");

        jLabel7.setText("45 cm Pizza: 3290 Ft");

        jLabel9.setText("60 cm Pizza: 4290 Ft");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnRendeles)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BtnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRendelesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRendelesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRendelesMouseEntered

    private void BtnRendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRendelesActionPerformed
        
         
        int mennyisegSonka = (int)spinnerSonkas.getValue();
        int mennyisegSzalami = (int)spinnerSzalamis.getValue();
        int eredmeny = 0;
        int ar32cm = 1290;
        int ar45cm = 3290;
        int ar60cm = 4290;
        
        
        if (mennyisegSonka == 0 &&  mennyisegSzalami == 0){
        JOptionPane.showMessageDialog(rootPane, "0 db pizzát nem lehet rendelni!");
    }else
        if (rdbSonkas32cm.isSelected()) {
            eredmeny += ar32cm;
        } else if (rdbSonkas45cm.isSelected()) {
            eredmeny += ar45cm;
        } else if (rdbSonkas60cm.isSelected()) {
            eredmeny += ar60cm;
        } 
        if (rdbSzalamis32cm.isSelected()) {
            eredmeny += ar32cm;
        } else if (rdbSzalamis45cm.isSelected()) {
            eredmeny += ar45cm;
        } else if (rdbSzalamis60cm.isSelected()) {
            eredmeny += ar60cm;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Kötelező méretet választani!");
        }
        
        JOptionPane.showMessageDialog(rootPane, "Rendelés leadva! Végösszeg: " + (eredmeny * (mennyisegSonka + mennyisegSzalami)) + " Ft.");
        
        
        
        
    }//GEN-LAST:event_BtnRendelesActionPerformed

    private void BtnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMegseActionPerformed

        System.exit(0);
    }//GEN-LAST:event_BtnMegseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaRendelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMegse;
    private javax.swing.JButton BtnRendeles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbSzoszSonkas;
    private javax.swing.JComboBox<String> cmbSzoszSonkas2;
    private javax.swing.JComboBox<String> cmbSzoszSzalamis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMeretSonkas;
    private javax.swing.JLabel lblMeretSonkas2;
    private javax.swing.JLabel lblMeretSzalamis;
    private javax.swing.JLabel lblSonkasKukoricas;
    private javax.swing.JLabel lblSonkasKukoricas2;
    private javax.swing.JLabel lblSzalamis;
    private javax.swing.JLabel lblSzoszSonkas;
    private javax.swing.JLabel lblSzoszSonkas2;
    private javax.swing.JLabel lblSzoszSzalamis;
    private javax.swing.JRadioButton rdbSonkas32cm;
    private javax.swing.JRadioButton rdbSonkas45cm;
    private javax.swing.JRadioButton rdbSonkas60cm;
    private javax.swing.JRadioButton rdbSzalamis32cm;
    private javax.swing.JRadioButton rdbSzalamis45cm;
    private javax.swing.JRadioButton rdbSzalamis60cm;
    private javax.swing.JSpinner spinnerSonkas;
    private javax.swing.JSpinner spinnerSonkas2;
    private javax.swing.JSpinner spinnerSzalamis;
    // End of variables declaration//GEN-END:variables
}
