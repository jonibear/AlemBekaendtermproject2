package JavaProjectEndterm;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jAll = new javax.swing.JButton();
        jSmartphone = new javax.swing.JButton();
        jBeauty = new javax.swing.JButton();
        jCars = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSearch = new javax.swing.JButton();
        jCart = new javax.swing.JButton();
        jHome = new javax.swing.JButton();
        jClothing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Catagories");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        jAll.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jAll.setText("All");
        jAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAllMouseClicked(evt);
            }
        });
        jAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAllActionPerformed(evt);
            }
        });

        jSmartphone.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jSmartphone.setText("Smartphone & Accessories");
        jSmartphone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSmartphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSmartphoneActionPerformed(evt);
            }
        });

        jBeauty.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jBeauty.setText("Beauty");
        jBeauty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeautyActionPerformed(evt);
            }
        });

        jCars.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jCars.setText("Cars");
        jCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jAll, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSmartphone, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCars, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBeauty, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeauty, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCars, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSmartphone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAll, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buy-Sell");

        jSearch.setText("Search");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jCart.setText("CART");
        jCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337)
                .addComponent(jCart, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jHome.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jHome.setText("Home Appliances");
        jHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeActionPerformed(evt);
            }
        });

        jClothing.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jClothing.setText("Clothing");
        jClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClothingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jHome, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSmartphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSmartphoneActionPerformed
        // TODO add your handling code here:
        JavaProjectEndterm.Smartphones sp= new JavaProjectEndterm.Smartphones();
        sp.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jSmartphoneActionPerformed

    private void jAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAllActionPerformed
        // TODO add your handling code here:
        JavaProjectEndterm.Allproducts ap= new JavaProjectEndterm.Allproducts();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jAllActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:

        JavaProjectEndterm.Search s21= new JavaProjectEndterm.Search();
      s21.setVisible(true);
      this.dispose();
        
    }                                     
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        HomePage hhh= new HomePage();
        hhh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSearchActionPerformed

    private void jHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeActionPerformed
        // TODO add your handling code here:
        JavaProjectEndterm.HomeAppliances h= new JavaProjectEndterm.HomeAppliances();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jHomeActionPerformed

    private void jClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClothingActionPerformed
        // TODO add your handling code here:
        Clothing cl= new Clothing();
        cl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jClothingActionPerformed

    private void jCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarsActionPerformed
        // TODO add your handling code here:

        JavaProjectEndterm.Cars c= new JavaProjectEndterm.Cars();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCarsActionPerformed

    private void jBeautyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeautyActionPerformed
        // TODO add your handling code here:
        JavaProjectEndterm.Beauty b= new JavaProjectEndterm.Beauty();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBeautyActionPerformed

    private void jAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAllMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAllMouseClicked

    private void jCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCartActionPerformed
        // TODO add your handling code here:
        Cart crt= new Cart ();
        crt.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jCartActionPerformed
    
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
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAll;
    private javax.swing.JButton jBeauty;
    private javax.swing.JButton jCars;
    private javax.swing.JButton jCart;
    private javax.swing.JButton jClothing;
    private javax.swing.JButton jHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSearch;
    private javax.swing.JButton jSmartphone;
    // End of variables declaration//GEN-END:variables
    
    private boolean findInString(String string, String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
