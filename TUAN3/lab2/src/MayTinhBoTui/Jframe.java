/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MayTinhBoTui;

/**
 *
 * @author KHA
 */
public class Jframe extends javax.swing.JFrame {

    private long a=0;
    private String pheptoan="";
    public Jframe() {
        super("Calculator");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        can2 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        phantram = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        phanso = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        soam = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        bang = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        showkq = new javax.swing.JLabel();
        hienThi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 5));

        so1.setBackground(new java.awt.Color(102, 102, 102));
        so1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        so1.setForeground(new java.awt.Color(240, 240, 240));
        so1.setText("1");
        so1.setToolTipText("");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel1.add(so1);

        so2.setBackground(new java.awt.Color(102, 102, 102));
        so2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so2.setForeground(new java.awt.Color(240, 240, 240));
        so2.setText("2");
        so2.setToolTipText("");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });
        jPanel1.add(so2);

        so3.setBackground(new java.awt.Color(102, 102, 102));
        so3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so3.setForeground(new java.awt.Color(240, 240, 240));
        so3.setText("3");
        so3.setToolTipText("");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        jPanel1.add(so3);

        chia.setBackground(new java.awt.Color(102, 102, 102));
        chia.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        chia.setForeground(new java.awt.Color(240, 240, 240));
        chia.setText("/");
        chia.setToolTipText("");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });
        jPanel1.add(chia);

        can2.setBackground(new java.awt.Color(102, 102, 102));
        can2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        can2.setForeground(new java.awt.Color(240, 240, 240));
        can2.setText("sqrt");
        can2.setToolTipText("");
        can2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                can2ActionPerformed(evt);
            }
        });
        jPanel1.add(can2);

        so4.setBackground(new java.awt.Color(102, 102, 102));
        so4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so4.setForeground(new java.awt.Color(240, 240, 240));
        so4.setText("4");
        so4.setToolTipText("");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        jPanel1.add(so4);

        so5.setBackground(new java.awt.Color(102, 102, 102));
        so5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so5.setForeground(new java.awt.Color(240, 240, 240));
        so5.setText("5");
        so5.setToolTipText("");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        jPanel1.add(so5);

        so6.setBackground(new java.awt.Color(102, 102, 102));
        so6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so6.setForeground(new java.awt.Color(240, 240, 240));
        so6.setText("6");
        so6.setToolTipText("");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        jPanel1.add(so6);

        nhan.setBackground(new java.awt.Color(102, 102, 102));
        nhan.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nhan.setForeground(new java.awt.Color(240, 240, 240));
        nhan.setText("*");
        nhan.setToolTipText("");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel1.add(nhan);

        phantram.setBackground(new java.awt.Color(102, 102, 102));
        phantram.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phantram.setForeground(new java.awt.Color(240, 240, 240));
        phantram.setText("%");
        phantram.setToolTipText("");
        phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phantramActionPerformed(evt);
            }
        });
        jPanel1.add(phantram);

        so7.setBackground(new java.awt.Color(102, 102, 102));
        so7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so7.setForeground(new java.awt.Color(240, 240, 240));
        so7.setText("7");
        so7.setToolTipText("");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        jPanel1.add(so7);

        so8.setBackground(new java.awt.Color(102, 102, 102));
        so8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so8.setForeground(new java.awt.Color(240, 240, 240));
        so8.setText("8");
        so8.setToolTipText("");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        jPanel1.add(so8);

        so9.setBackground(new java.awt.Color(102, 102, 102));
        so9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so9.setForeground(new java.awt.Color(240, 240, 240));
        so9.setText("9");
        so9.setToolTipText("");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        jPanel1.add(so9);

        tru.setBackground(new java.awt.Color(102, 102, 102));
        tru.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tru.setForeground(new java.awt.Color(240, 240, 240));
        tru.setText("-");
        tru.setToolTipText("");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });
        jPanel1.add(tru);

        phanso.setBackground(new java.awt.Color(102, 102, 102));
        phanso.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phanso.setForeground(new java.awt.Color(240, 240, 240));
        phanso.setText("1/x");
        phanso.setToolTipText("");
        phanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phansoActionPerformed(evt);
            }
        });
        jPanel1.add(phanso);

        so0.setBackground(new java.awt.Color(102, 102, 102));
        so0.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        so0.setForeground(new java.awt.Color(240, 240, 240));
        so0.setText("0");
        so0.setToolTipText("");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        jPanel1.add(so0);

        soam.setBackground(new java.awt.Color(102, 102, 102));
        soam.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        soam.setForeground(new java.awt.Color(240, 240, 240));
        soam.setText("+/-");
        soam.setToolTipText("");
        soam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soamActionPerformed(evt);
            }
        });
        jPanel1.add(soam);

        clear.setBackground(new java.awt.Color(102, 102, 102));
        clear.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(240, 240, 240));
        clear.setText("C");
        clear.setToolTipText("");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);

        cong.setBackground(new java.awt.Color(102, 102, 102));
        cong.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cong.setForeground(new java.awt.Color(240, 240, 240));
        cong.setText("+");
        cong.setToolTipText("");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });
        jPanel1.add(cong);

        bang.setBackground(new java.awt.Color(102, 102, 102));
        bang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bang.setForeground(new java.awt.Color(240, 240, 240));
        bang.setText("=");
        bang.setToolTipText("");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        jPanel1.add(bang);

        showkq.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        showkq.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        hienThi.setBackground(java.awt.Color.darkGray);
        hienThi.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        hienThi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hienThi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showkq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(hienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(showkq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(hienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so1.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so1ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
            // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so2.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
            // TODO add your handling code here:
            String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so3.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so4.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so5.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so6.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so7.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so8.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so9.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so9ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
        // TODO add your handling code here:
        String ht=this.hienThi.getText();
        if(ht.length()<12)
        {
            if(ht.equals("0")) ht="";
            long so=Long.parseLong(ht+so0.getText());
            this.hienThi.setText(String.valueOf(so));
            
        }
    }//GEN-LAST:event_so0ActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
        // TODO add your handling code here:
        this.a=Long.parseLong(this.hienThi.getText());
        if(this.a!=0)
        {
            this.pheptoan="/";
            this.hienThi.setText("");

        }
    }//GEN-LAST:event_chiaActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        // TODO add your handling code here:
        this.a=Long.parseLong(this.hienThi.getText());
            this.pheptoan="*";
            this.hienThi.setText("");


    }//GEN-LAST:event_nhanActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        // TODO add your handling code here:
        this.a=Long.parseLong(this.hienThi.getText());
            this.pheptoan="-";
            this.hienThi.setText("");

  
    }//GEN-LAST:event_truActionPerformed

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        // TODO add your handling code here:
        this.a=Long.parseLong(this.hienThi.getText());
       
            this.pheptoan="+";
            this.hienThi.setText("");
            
       
    }//GEN-LAST:event_congActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        // TODO add your handling code here:
        if(this.pheptoan.length()>0)
        {
            long b=Long.parseLong(this.hienThi.getText());
             if(this.pheptoan.equals("+"))
            {
                long kq=this.a+b;
                this.showkq.setText(String.valueOf(a)+"+"+String.valueOf(b));
                this.hienThi.setText(String.valueOf(kq));
               
            
            } else if(this.pheptoan.equals("-"))
            {
                long kq=this.a-b;
                this.showkq.setText(String.valueOf(a)+"-"+String.valueOf(b));
                this.hienThi.setText(String.valueOf(kq));
            }else if(this.pheptoan.equals("*"))
            {
                long kq=this.a*b; 
                this.showkq.setText(String.valueOf(a)+"*"+String.valueOf(b));
                this.hienThi.setText(String.valueOf(kq));
            }else if(this.pheptoan.equals("/"))
            {  
                    float kq  = (float)this.a/b;
                    this.showkq.setText(String.valueOf(a)+"/"+String.valueOf(b));
                    this.hienThi.setText(String.valueOf(kq));
            }else if (this.pheptoan.equals("sqrt("))
            {
                    float kq=(float) Math.sqrt(a);
                    this.showkq.setText("sqrt("+a+")");
                    this.hienThi.setText(String.valueOf(kq));
            }
            
        }
      this.pheptoan="";this.a=0;
    }//GEN-LAST:event_bangActionPerformed

    private void can2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_can2ActionPerformed
        // TODO add your handling code here:
          this.a=Long.parseLong(this.hienThi.getText());
        if(this.a!=0)
        {
            this.pheptoan="sqrt(";
           
        }
    }//GEN-LAST:event_can2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
         this.pheptoan="";this.hienThi.setText(""); this.showkq.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phantramActionPerformed
        // TODO add your handling code here:
        this.a=Long.parseLong(this.hienThi.getText())/100;
        this.hienThi.setText(String.valueOf(a));
        
    }//GEN-LAST:event_phantramActionPerformed

    private void phansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phansoActionPerformed
        // TODO add your handling code here:
         if(this.a!=0)
        this.a=1/Long.parseLong(this.hienThi.getText());
          this.hienThi.setText(String.valueOf(a)); 
        
    }//GEN-LAST:event_phansoActionPerformed

    private void soamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soamActionPerformed
           // TODO add your handling code here:
           this.a=-Long.parseLong(this.hienThi.getText());
           this.hienThi.setText(String.valueOf(a));
    }//GEN-LAST:event_soamActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.JButton can2;
    private javax.swing.JButton chia;
    private javax.swing.JButton clear;
    private javax.swing.JButton cong;
    private javax.swing.JLabel hienThi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nhan;
    private javax.swing.JButton phanso;
    private javax.swing.JButton phantram;
    private javax.swing.JLabel showkq;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton soam;
    private javax.swing.JButton tru;
    // End of variables declaration//GEN-END:variables
}
