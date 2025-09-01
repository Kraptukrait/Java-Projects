
import java.awt.Color;


/**
 *
 * @author KraptuKrait
 */
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        setTitle("Color Chart");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroupColors = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        radioButtonBlack = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        radioButtonWhite = new javax.swing.JRadioButton();
        radioButtonBlue = new javax.swing.JRadioButton();
        radioButtonRed = new javax.swing.JRadioButton();
        radioButtonCyan = new javax.swing.JRadioButton();
        radioButtonDarkGray = new javax.swing.JRadioButton();
        radioButtonGray = new javax.swing.JRadioButton();
        radioButtonGreen = new javax.swing.JRadioButton();
        radioButtonMagenta = new javax.swing.JRadioButton();
        radioButtonOrange = new javax.swing.JRadioButton();
        radioButtonPink = new javax.swing.JRadioButton();
        radioButtonYellow = new javax.swing.JRadioButton();
        panelPrintColor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("Color chart");

        buttonGroupColors.add(radioButtonBlack);
        radioButtonBlack.setText("black");
        radioButtonBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorBlack(evt);
            }
        });

        jLabel2.setText("colors:");

        buttonGroupColors.add(radioButtonWhite);
        radioButtonWhite.setText("white");
        radioButtonWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorWhite(evt);
            }
        });

        buttonGroupColors.add(radioButtonBlue);
        radioButtonBlue.setText("blue");
        radioButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorBlue(evt);
            }
        });

        buttonGroupColors.add(radioButtonRed);
        radioButtonRed.setText("red");
        radioButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorRed(evt);
            }
        });

        buttonGroupColors.add(radioButtonCyan);
        radioButtonCyan.setText("cyan");
        radioButtonCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorCyan(evt);
            }
        });

        buttonGroupColors.add(radioButtonDarkGray);
        radioButtonDarkGray.setText("dark gray");
        radioButtonDarkGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorDarkGray(evt);
            }
        });

        buttonGroupColors.add(radioButtonGray);
        radioButtonGray.setText("gray");
        radioButtonGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorGray(evt);
            }
        });

        buttonGroupColors.add(radioButtonGreen);
        radioButtonGreen.setText("green");
        radioButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorGreen(evt);
            }
        });

        buttonGroupColors.add(radioButtonMagenta);
        radioButtonMagenta.setText("magenta");
        radioButtonMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorMagenta(evt);
            }
        });

        buttonGroupColors.add(radioButtonOrange);
        radioButtonOrange.setText("orange");
        radioButtonOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorOrange(evt);
            }
        });

        buttonGroupColors.add(radioButtonPink);
        radioButtonPink.setText("pink");
        radioButtonPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorPink(evt);
            }
        });

        buttonGroupColors.add(radioButtonYellow);
        radioButtonYellow.setText("yellow");
        radioButtonYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorYellow(evt);
            }
        });

        javax.swing.GroupLayout panelPrintColorLayout = new javax.swing.GroupLayout(panelPrintColor);
        panelPrintColor.setLayout(panelPrintColorLayout);
        panelPrintColorLayout.setHorizontalGroup(
            panelPrintColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrintColorLayout.setVerticalGroup(
            panelPrintColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonMagenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonOrange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonPink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonYellow))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonBlack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonWhite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonBlue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonRed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonCyan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonDarkGray)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonGray)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonGreen))
                            .addComponent(panelPrintColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonBlack)
                    .addComponent(radioButtonWhite)
                    .addComponent(radioButtonBlue)
                    .addComponent(radioButtonRed)
                    .addComponent(radioButtonCyan)
                    .addComponent(radioButtonDarkGray)
                    .addComponent(radioButtonGray)
                    .addComponent(radioButtonGreen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonMagenta)
                    .addComponent(radioButtonOrange)
                    .addComponent(radioButtonPink)
                    .addComponent(radioButtonYellow))
                .addGap(37, 37, 37)
                .addComponent(panelPrintColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void buttonColorBlack(java.awt.event.ActionEvent evt) {                                  
        this.panelPrintColor.setBackground(Color.black);
    }                                 

    private void buttonColorWhite(java.awt.event.ActionEvent evt) {                                  
        this.panelPrintColor.setBackground(Color.white);
    }                                 

    private void buttonColorBlue(java.awt.event.ActionEvent evt) {                                 
        this.panelPrintColor.setBackground(Color.blue);
    }                                

    private void buttonColorRed(java.awt.event.ActionEvent evt) {                                
        this.panelPrintColor.setBackground(Color.red);
    }                               

    private void buttonColorCyan(java.awt.event.ActionEvent evt) {                                 
        this.panelPrintColor.setBackground(Color.cyan);
    }                                

    private void buttonColorDarkGray(java.awt.event.ActionEvent evt) {                                     
        this.panelPrintColor.setBackground(Color.darkGray);
    }                                    

    private void buttonColorGray(java.awt.event.ActionEvent evt) {                                 
        this.panelPrintColor.setBackground(Color.gray);
    }                                

    private void buttonColorGreen(java.awt.event.ActionEvent evt) {                                  
        this.panelPrintColor.setBackground(Color.green);
    }                                 

    private void buttonColorMagenta(java.awt.event.ActionEvent evt) {                                    
        this.panelPrintColor.setBackground(Color.magenta);
    }                                   

    private void buttonColorOrange(java.awt.event.ActionEvent evt) {                                   
        this.panelPrintColor.setBackground(Color.orange);
    }                                  

    private void buttonColorPink(java.awt.event.ActionEvent evt) {                                 
        this.panelPrintColor.setBackground(Color.pink);
    }                                

    private void buttonColorYellow(java.awt.event.ActionEvent evt) {                                   
        this.panelPrintColor.setBackground(Color.yellow);
    }                                  

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroupColors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelPrintColor;
    private javax.swing.JRadioButton radioButtonBlack;
    private javax.swing.JRadioButton radioButtonBlue;
    private javax.swing.JRadioButton radioButtonCyan;
    private javax.swing.JRadioButton radioButtonDarkGray;
    private javax.swing.JRadioButton radioButtonGray;
    private javax.swing.JRadioButton radioButtonGreen;
    private javax.swing.JRadioButton radioButtonMagenta;
    private javax.swing.JRadioButton radioButtonOrange;
    private javax.swing.JRadioButton radioButtonPink;
    private javax.swing.JRadioButton radioButtonRed;
    private javax.swing.JRadioButton radioButtonWhite;
    private javax.swing.JRadioButton radioButtonYellow;
    // End of variables declaration                   
}
