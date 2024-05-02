/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.calculadora.model.Operation;
import ucr.ac.cr.calculadora.model.OperationArray;
import ucr.ac.cr.calculadora.view.GUICalculator;
import ucr.ac.cr.calculadora.view.GUIReport;

/**
 *
 * @author Stephanie
 */
public class ControllerCalculator implements ActionListener {

    private GUICalculator guiCalculator;
    private OperationArray operationArray;
    private GUIReport guiReport;

    public ControllerCalculator() {
        this.guiCalculator = new GUICalculator();
        this.operationArray = new OperationArray();

        this.guiCalculator.setCbOperations();
        this.guiCalculator.listen(this);
        this.guiCalculator.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Perform Operation":
               
                Operation operationAux = this.guiCalculator.getNumbersOperation();
                if (operationAux != null) {
                    this.guiCalculator.setResult(this.operationArray.getResult(operationAux));
                }
                break;

            case "Report":
                this.guiReport = new GUIReport();
                guiReport.setDataTable(this.operationArray.getMatrixData(), Operation.TBL_LABELS);
                guiReport.setVisible(true);
                break;

            case "Clear":
                this.guiCalculator.clean();
                break;

        }
    }

}
