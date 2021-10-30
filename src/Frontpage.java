
import java.awt.Color;

public class Frontpage extends javax.swing.JFrame {

    public Frontpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        covidTestBtn = new javax.swing.JButton();
        onlineShoppingBtn = new javax.swing.JButton();
        dietBtn = new javax.swing.JButton();
        covidResponseBtn = new javax.swing.JButton();
        leisureBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        covidTestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/covitTestBtn.png"))); // NOI18N
        covidTestBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        covidTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covidTestBtnActionPerformed(evt);
            }
        });
        getContentPane().add(covidTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 100, 30));

        onlineShoppingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/shoppingBtn.png"))); // NOI18N
        onlineShoppingBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onlineShoppingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineShoppingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(onlineShoppingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 100, 30));

        dietBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/healthyDietBtn.png"))); // NOI18N
        dietBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dietBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dietBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 100, 30));

        covidResponseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/covidRresponseBtn.png"))); // NOI18N
        covidResponseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        covidResponseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covidResponseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(covidResponseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 100, 30));

        leisureBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/leisureTimeBtn.png"))); // NOI18N
        leisureBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leisureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leisureBtnActionPerformed(evt);
            }
        });
        getContentPane().add(leisureBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 100, 30));

        aboutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/aboutBtn.png"))); // NOI18N
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandemicVsWe/Images/Frontpage/frontpage-background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        setSize(new java.awt.Dimension(916, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void covidTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covidTestBtnActionPerformed
        // TODO add your handling code here:
        CovidTestUI cvdTestPage = new CovidTestUI();
        cvdTestPage.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_covidTestBtnActionPerformed

    private void covidResponseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covidResponseBtnActionPerformed
        // TODO add your handling code here:
        CovidResponse response = new CovidResponse();
        response.setVisible(true);
        dispose();
          
    }//GEN-LAST:event_covidResponseBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
        AboutPage abtPage = new AboutPage();
        abtPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void onlineShoppingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineShoppingBtnActionPerformed
        // TODO add your handling code here:
        ShoppingFrontPage shpFrntPage = new ShoppingFrontPage();
        shpFrntPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_onlineShoppingBtnActionPerformed

    private void leisureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leisureBtnActionPerformed
        // TODO add your handling code here:
        LeisureTime lt = new LeisureTime();
        lt.setVisible(true);
        dispose();
    }//GEN-LAST:event_leisureBtnActionPerformed

    private void dietBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietBtnActionPerformed
        // TODO add your handling code here:
        HealthDiet hltDiet = new HealthDiet();
        hltDiet.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_dietBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frontpage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton covidResponseBtn;
    private javax.swing.JButton covidTestBtn;
    private javax.swing.JButton dietBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton leisureBtn;
    private javax.swing.JButton onlineShoppingBtn;
    // End of variables declaration//GEN-END:variables
}
