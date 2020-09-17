package Part1;




public class PizzaCost2 extends javax.swing.JFrame {
         int toppings;
         double inches, total, totaltop, totalinch;
         double labourcost = 1.50;
         double gascost = 0.75;
    
    public PizzaCost2() {
        initComponents();
    }

private void costActionPerformed(java.awt.event.ActionEvent evt) {                                           
        inches = Double.parseDouble(pbox.getText());
        toppings = Integer.parseInt(tbox.getText());
        totaltop = toppings * 0.75;
        totalinch = inches * 0.50;
        total = labourcost + gascost + totaltop + totalinch;
        lcost.setText("$"+labourcost);
        hucost.setText("$"+gascost);
        tcost.setText("$"+totaltop);
        bicost.setText("$"+totalinch);
        totalcost.setText("$"+total);
}
private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                           
        toppings = 0;
        inches = 0;
        labourcost=0;
        total=0;
        tcost.setText("$");
        bicost.setText("$");
        totalcost.setText("$");
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        psize = new javax.swing.JLabel();
        tamount = new javax.swing.JLabel();
        pbox = new javax.swing.JTextField();
        tbox = new javax.swing.JTextField();
        cost = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        lcost = new javax.swing.JLabel();
        hucost = new javax.swing.JLabel();
        tcost = new javax.swing.JLabel();
        bicost = new javax.swing.JLabel();
        ltotal = new javax.swing.JLabel();
        hutotal = new javax.swing.JLabel();
        ttotal = new javax.swing.JLabel();
        bitotal = new javax.swing.JLabel();
        tlbl = new javax.swing.JLabel();
        totalcost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        psize.setText("Enter Size of Pizza:");

        tamount.setText("Enter Number of Toppings:");

        tbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tboxActionPerformed(evt);
            }
        });

        cost.setText("Calculate Cost:");

        reset.setText("Reset");

        lcost.setText("Labour Cost (Fixed)");

        hucost.setText("Heat/Utilities (Fixed)");

        tcost.setText("Toppings Cost");

        bicost.setText("Base Ingredient Cost");

        ltotal.setText("$");

        hutotal.setText("$");

        ttotal.setText("$");

        bitotal.setText("$");

        tlbl.setText("Total Cost");

        totalcost.setBackground(new java.awt.Color(0, 0, 0));
        totalcost.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(psize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(cost)))
                    .addComponent(lcost)
                    .addComponent(hucost)
                    .addComponent(bicost)
                    .addComponent(tcost)
                    .addComponent(tlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(tbox)
                    .addComponent(pbox)
                    .addComponent(totalcost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hutotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ttotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psize)
                    .addComponent(pbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamount)
                    .addComponent(tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost)
                    .addComponent(reset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcost)
                    .addComponent(ltotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hucost)
                    .addComponent(hutotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcost)
                    .addComponent(ttotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bicost)
                    .addComponent(bitotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlbl)
                    .addComponent(totalcost))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tboxActionPerformed
        
    }//GEN-LAST:event_tboxActionPerformed

   
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
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaCost2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bicost;
    private javax.swing.JLabel bitotal;
    private javax.swing.JButton cost;
    private javax.swing.JLabel hucost;
    private javax.swing.JLabel hutotal;
    private javax.swing.JLabel lcost;
    private javax.swing.JLabel ltotal;
    private javax.swing.JTextField pbox;
    private javax.swing.JLabel psize;
    private javax.swing.JButton reset;
    private javax.swing.JLabel tamount;
    private javax.swing.JTextField tbox;
    private javax.swing.JLabel tcost;
    private javax.swing.JLabel tlbl;
    private javax.swing.JLabel totalcost;
    private javax.swing.JLabel ttotal;
    // End of variables declaration//GEN-END:variables
}
