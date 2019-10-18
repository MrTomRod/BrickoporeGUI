/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richardmleggett.brickopore;

/**
 *
 * @author leggettr
 */
public class ResultsDialog extends javax.swing.JDialog {
    private final static String COMMON_SEQUENCE     = "TGACCGAATTTCGCGG";
    private final static String POPPY_SEQUENCE      = "GCAATT";
    private final static String BLACKBERRY_SEQUENCE = "GCCCAA";
    private final static String BLUEBELL_SEQUENCE   = "TTAATT";
    
    /**
     * Creates new form ResultsDialog
     */
    public ResultsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getRootPane().setDefaultButton(okButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        sequencePanel = new richardmleggett.brickopore.SequencePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/richard-poppy.png"))); // NOI18N
        imageLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("This seems to be an exact match to...");

        javax.swing.GroupLayout sequencePanelLayout = new javax.swing.GroupLayout(sequencePanel);
        sequencePanel.setLayout(sequencePanelLayout);
        sequencePanelLayout.setHorizontalGroup(
            sequencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        sequencePanelLayout.setVerticalGroup(
            sequencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sequencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(imageLabel)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sequencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ResultsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultsDialog dialog = new ResultsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private int findHamming(String a, String b) {
        int distance = 0;
        
        if (a.length() != b.length()) {
            distance = a.length() > b.length() ? a.length():b.length();
        } else {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    distance++;
                }
            }
        }
        
        return distance;
    }
    
    private String reverseString(String s) {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    
    public void setSequence(String s) {
        boolean perfect = false;        
        boolean reversed = false;

        /* If we don't start with TGA, maybe it's been put in the wrong way round? */
        if (! s.startsWith("TGAC")) {
            if (s.endsWith("CAGT")) {
                s = reverseString(s);
                reversed = true;
                System.out.println("Reversed string");
            }
        }

        String start = s.substring(0, COMMON_SEQUENCE.length());
        String end = s.substring(COMMON_SEQUENCE.length());
        int h = findHamming(COMMON_SEQUENCE, start);

        SequencePanel sp = (SequencePanel)sequencePanel;
        System.out.println("Setting sequence "+s);
        sp.setSequence(s);
        sp.repaint();
        sp.invalidate();
                
        if (h == 0) {
            perfect = true;
            if (reversed == true) {
                messageLabel.setText("is an exact REVERSED match to...");
            } else {
                messageLabel.setText("is an exact match to...");
            }
        } else {
            if (reversed == true) {
                messageLabel.setText("is a CLOSE REVERSED match to...");            
            } else {
                messageLabel.setText("is a CLOSE match to...");
            }
        }
        
        if (h <= 2) {
            if (end.equals(POPPY_SEQUENCE)) {
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/richard-poppy.png")));
            } else if (end.equals(BLACKBERRY_SEQUENCE)) {
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/richard-blackberry.png")));
            } else if (end.equals(BLUEBELL_SEQUENCE)) {
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/richard-bluebell.png")));
            } else {
                messageLabel.setText("");
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomatch.png")));
            }
        } else {            
            messageLabel.setText("");
            imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomatch.png")));
        }
        
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton okButton;
    private richardmleggett.brickopore.SequencePanel sequencePanel;
    // End of variables declaration//GEN-END:variables
}
