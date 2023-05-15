package Graficos;
import Audio.Audio;

public class Gato extends javax.swing.JFrame 
{
    private boolean jugador;
    private String[][] movimientos;
    private Audio audio;
    
    public Gato() 
    {
        jugador = true; //se inicializa en el jujador 1 que son X
        movimientos = new String[3][3];
        llenarMatriz();
        audio = new Audio();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del gato  - Giuhel_Dev");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(boton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(169, 101, 35));

        jLabel1.setFont(new java.awt.Font("Sakkal Majalla", 1, 18)); // NOI18N
        jLabel1.setText("Juego del GATO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 12)); // NOI18N
        jLabel2.setText("Reiniciar juego");

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("s a l i r");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 0, 240, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
       
       if(jugador && movimientos[0][0].equals("i"))
       {
           boton1.setText("X");
           setMovimiento(0,0,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[0][0].equals("i"))
       {
           boton1.setText("O");
           setMovimiento(0,0,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       if(jugador && movimientos[0][1].equals("i"))
       {
           boton2.setText("X");
           setMovimiento(0,1,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[0][1].equals("i"))
       {
           boton2.setText("O");
           setMovimiento(0,1,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
       if(jugador && movimientos[0][2].equals("i"))
       {
           boton3.setText("X");
           setMovimiento(0,2,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[0][2].equals("i"))
       {
           boton3.setText("O");
           setMovimiento(0,2,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
       if(jugador && movimientos[1][0].equals("i"))
       {
           boton4.setText("X");
           setMovimiento(1,0,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[1][0].equals("i"))
       {
           boton4.setText("O");
           setMovimiento(1,0,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
       if(jugador && movimientos[1][1].equals("i"))
       {
           boton5.setText("X");
           setMovimiento(1,1,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[1][1].equals("i"))
       {
           boton5.setText("O");
           setMovimiento(1,1,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
       if(jugador && movimientos[1][2].equals("i"))
       {
           boton6.setText("X");
           setMovimiento(1,2,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[1][2].equals("i"))
       {
           boton6.setText("O");
           setMovimiento(1,2,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
       if(jugador && movimientos[2][0].equals("i"))
       {
           boton7.setText("X");
           setMovimiento(2,0,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[2][0].equals("i"))
       {
           boton7.setText("O");
           setMovimiento(2,0,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
       if(jugador && movimientos[2][1].equals("i"))
       {
           boton8.setText("X");
           setMovimiento(2,1,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[2][1].equals("i"))
       {
           boton8.setText("O");
           setMovimiento(2,1,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
         if(jugador && movimientos[2][2].equals("i"))
       {
           boton9.setText("X");
           setMovimiento(2,2,"X");
           jugador = false;
           imprimirMatriz();
           if(ganador1())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado!!");
       }
       else if(!jugador && movimientos[2][2].equals("i"))
       {
           boton9.setText("O");
           setMovimiento(2,2,"O");
           jugador = true;
           imprimirMatriz();
           if(ganador2())
               javax.swing.JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!!");
       }
    }//GEN-LAST:event_boton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarMatriz();
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
        boton7.setText("");
        boton8.setText("");
        boton9.setText("");
        jugador = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public boolean ganador1()
    {
        if( ((movimientos[0][0].equals("X")) && (movimientos[0][1].equals("X")) && (movimientos[0][2].equals("X")))
                || ((movimientos[1][0].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[1][2].equals("X")))
                || ((movimientos[2][0].equals("X")) && (movimientos[2][1].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][0].equals("X")) && (movimientos[1][0].equals("X")) && (movimientos[2][0].equals("X")))
                || ((movimientos[0][1].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][1].equals("X")))
                || ((movimientos[0][2].equals("X")) && (movimientos[1][2].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][0].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][2].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][0].equals("X"))))
                return true;
                
         else
            return false;
    }
    
    public boolean ganador2()
    {
        if( ((movimientos[0][0].equals("O")) && (movimientos[0][1].equals("O")) && (movimientos[0][2].equals("O")))
                || ((movimientos[1][0].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[1][2].equals("O")))
                || ((movimientos[2][0].equals("O")) && (movimientos[2][1].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][0].equals("O")) && (movimientos[1][0].equals("O")) && (movimientos[2][0].equals("O")))
                || ((movimientos[0][1].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][1].equals("O")))
                || ((movimientos[0][2].equals("O")) && (movimientos[1][2].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][0].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][2].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][0].equals("O"))))
                return true;
                
         else
            return false;
    }
    
    public void setMovimiento(int i, int j, String m)
    {
        movimientos[i][j] = m;
    }
    public void llenarMatriz()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                movimientos[i][j] = "i";
            }
        }
    }
    
    public void imprimirMatriz()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(movimientos[i][j]);
            }
            System.out.print("\n");
        }
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
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gato().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
