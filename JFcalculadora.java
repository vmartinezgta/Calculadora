
package Calculadora;
import java.applet.AudioClip;

public class JFcalculadora extends javax.swing.JFrame {
float n1,n2 = 0;
String op;    
    public JFcalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MOpcion = new javax.swing.JMenu();
        MNuevo = new javax.swing.JMenu();
        MHistorial = new javax.swing.JMenu();
        MAyuda = new javax.swing.JMenu();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultadoKeyReleased(evt);
            }
        });

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        MOpcion.setText("Opciones");

        MNuevo.setText("NUEVO");
        MNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNuevoActionPerformed(evt);
            }
        });
        MOpcion.add(MNuevo);

        MHistorial.setText("Historial");
        MOpcion.add(MHistorial);

        jMenuBar1.add(MOpcion);

        MAyuda.setText("Ayuda");
        jMenuBar1.add(MAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton del numero 1
//Toma el texto ingresado anterior mente (si lo hubiese) para concatenarlo con el numero segun el boton 
    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
      txtResultado.setText(txtResultado.getText()+"1");
    }//GEN-LAST:event_btnUnoActionPerformed
//txt que recibe los valores
    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
      
    }//GEN-LAST:event_txtResultadoActionPerformed
//Boton del numero 2
    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       txtResultado.setText(txtResultado.getText()+"2"); 
    }//GEN-LAST:event_btnDosActionPerformed
//Boton del numero3
    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtResultado.setText(txtResultado.getText()+"3");
    }//GEN-LAST:event_btnTresActionPerformed
//Boton del numero 4
    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        txtResultado.setText(txtResultado.getText()+"4");
    }//GEN-LAST:event_btnCuatroActionPerformed
//Boton del numero 5
    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtResultado.setText(txtResultado.getText()+"5");
    }//GEN-LAST:event_btnCincoActionPerformed
//Boton del numero 6
    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtResultado.setText(txtResultado.getText()+"6");
    }//GEN-LAST:event_btnSeisActionPerformed
//Boton del numero 7
    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        txtResultado.setText(txtResultado.getText()+"7");
    }//GEN-LAST:event_btnSieteActionPerformed
//Boton del numero 8
    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        txtResultado.setText(txtResultado.getText()+"8");
    }//GEN-LAST:event_btnOchoActionPerformed
//Boton del numero 9
    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtResultado.setText(txtResultado.getText()+"9");
    }//GEN-LAST:event_btnNueveActionPerformed
//Boton del numero 0
    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        txtResultado.setText(txtResultado.getText()+"0");
    }//GEN-LAST:event_btnCeroActionPerformed
//Boton signo suma
    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        n1 = Float.parseFloat(txtResultado.getText());  
        op = "+";
        txtResultado.setText("");
    }//GEN-LAST:event_btnSumaActionPerformed
//Boton signo resta
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        n1 = Float.parseFloat(txtResultado.getText());  
        op = "-";
        txtResultado.setText("");
    }//GEN-LAST:event_btnRestaActionPerformed
//Boton signo multiplicacion
    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        n1 = Float.parseFloat(txtResultado.getText());  
        op = "*";
        txtResultado.setText("");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed
//Boton signo division
    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        n1 = Float.parseFloat(txtResultado.getText());  
        op = "/";
        txtResultado.setText("");
    }//GEN-LAST:event_btnDivisionActionPerformed
//Boton signo Igual
    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        n2 = Float.parseFloat(txtResultado.getText());  //Toma el segundo valor ingresado
        switch(op){//Valida la operacion seleccionada para realizar la operacion 
            case "+": txtResultado.setText(Float.toString(n1+n2));
            break;
            case "-": txtResultado.setText(Float.toString(n1-n2));
            break;
            case "*": txtResultado.setText(Float.toString(n1*n2));
            break;
            case "/": txtResultado.setText(Float.toString(n1/n2));
            break;  
        }
    }//GEN-LAST:event_btnIgualActionPerformed
//Boton punto
    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        //Valida si el numero ingresado en la variable contiene un punto
        if(!txtResultado.getText().contains(".")){
            //En caso de no tenerlo, toma el texto ingresado y lo concatena con el punto
            txtResultado.setText((txtResultado.getText()+"."));        
        }
    }//GEN-LAST:event_btnPuntoActionPerformed
//evento para validar los valores que se agregan con el teclado 
    private void txtResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyReleased
        if(txtResultado.getText().matches("[0-9]{1,40}")){//valida que se ingresen digitos del 0-9
            String a = txtResultado.getText();
            txtResultado.setText(a);
    }else{//en caso de agregar los valores incorrectos hace el sonido de error y borra el texto
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("Error.wav"));
            sonido.play();
            txtResultado.setText("");
        }
    }//GEN-LAST:event_txtResultadoKeyReleased

    private void MNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNuevoActionPerformed
        txtResultado.setText("");
    }//GEN-LAST:event_MNuevoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFcalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAyuda;
    private javax.swing.JMenu MHistorial;
    private javax.swing.JMenu MNuevo;
    private javax.swing.JMenu MOpcion;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
