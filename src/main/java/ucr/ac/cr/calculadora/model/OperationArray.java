/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.calculadora.model;

import java.io.IOException;
import java.util.ArrayList;
import static ucr.ac.cr.examplecsv.model.CSVHandler.escribirCSV;
import static ucr.ac.cr.examplecsv.model.CSVHandler.leerCSV;

/**
 *
 * @author Stephanie
 */
public class OperationArray {

    private ArrayList<Operation> listOperations;

    public OperationArray() {
    }

    public double getResult(Operation operation) {
        double number1 = operation.getNumber1();
        double number2 = operation.getNumber2();
        double result = 0;

        switch (operation.getOperationType()) {
            case "Sum":
                result = number1 + number2;
                operation.setResult(result);
                this.add(operation);
                break;

            case "Subtraction":
                result = number1 - number2;
                operation.setResult(result);
                this.add(operation);
                break;

            case "Multiplication":
                result = number1 * number2;
                operation.setResult(result);
                this.add(operation);
                break;

            case "Division":
                if (number2 != 0) {
                    result = number1 / number2;
                    operation.setResult(result);
                    this.add(operation);
                } else {
                    System.out.println("Error: Cant divide by zero");
                }
                break;
        }

        return result;
    }

    public void add(Operation operation) {
        try {
            this.listOperations = leerCSV("operation.csv");

            listOperations.add(operation);

            escribirCSV(listOperations, "operation.csv");

        } catch (IOException ex) {
            System.err.println("Error al escribir");
        }

    }

    public String[][] getMatrixData() {
        String[][] matrixDataSongs = new String[this.listOperations.size()][Operation.TBL_LABELS.length];
        if (listOperations != null) {
            for (int f = 0; f < matrixDataSongs.length; f++) {
                for (int c = 0; c < matrixDataSongs[0].length; c++) {
                    matrixDataSongs[f][c] = this.listOperations.get(f).getData(c);
                }

            }
            return matrixDataSongs;
        }
        return null;
    }
}
