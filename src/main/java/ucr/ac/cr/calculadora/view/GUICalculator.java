/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.calculadora.view;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import ucr.ac.cr.calculadora.model.Operation;

/**
 *
 * @author Stephanie
 */
public class GUICalculator extends javax.swing.JFrame {

    /**
     * Creates new form GUICalculator
     */
    public GUICalculator() {
        initComponents();
    }

    public static void setMessage(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public void listen(ActionListener controller) {
        this.btnPerformOperation.addActionListener(controller);
        this.btnReport.addActionListener(controller);
        this.btnClear.addActionListener(controller);

    }

    public void setCbOperations() {
        this.cbOperations.setModel(new DefaultComboBoxModel<>(new String[]{"Sum", "Subtraction", "Multiplication", "Division"}));
    }

    public Operation getNumbersOperation() {
        if (!this.txtNumber1.getText().isBlank() || !this.txtNumber2.getText().isBlank()) {
            try {// verificar que no esten vacios)
                return new Operation(Double.parseDouble(this.txtNumber1.getText()), Double.parseDouble(this.txtNumber2.getText()), this.cbOperations.getSelectedItem().toString());

            } catch (NumberFormatException e) {
               GUICalculator.setMessage("The number1 or number2 field is not a valid number");
            }
        }
        return null;
    }

    public void setResult(double result) {
        this.txtResult.setText(Double.toString(result));
    }

    public double getResult() {
        return Double.parseDouble(this.txtResult.getText());
    }

    public void clean() {
        this.txtNumber1.setText("");
        this.txtNumber2.setText("");
        this.txtResult.setText("");
        this.cbOperations.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbOperations = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnPerformOperation = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Operations log");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        jLabel2.setText("Number 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 111, -1, -1));

        jLabel3.setText("Number 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 151, -1, -1));
        getContentPane().add(txtNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 108, 110, -1));
        getContentPane().add(txtNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 148, 110, -1));

        jLabel4.setText("Operation");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 111, -1, -1));

        cbOperations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 108, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Result");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 188, -1, -1));
        getContentPane().add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 192, 110, -1));

        btnPerformOperation.setText("Perform Operation");
        getContentPane().add(btnPerformOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 172, -1, -1));

        btnReport.setText("Report");
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 236, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPerformOperation;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cbOperations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
