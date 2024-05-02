/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.calculadora.model;

import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author Stephanie
 */
public class Operation {

    @CsvBindByName
    private double number1;
    @CsvBindByName
    private double number2;
    @CsvBindByName
    private double result;
    @CsvBindByName
    private String operationType;
    
    
    public static final String[] TBL_LABELS = {"Number1", "Number2", "Result", "Operation"};

    public String getData(int colum) {
        switch (colum) {
            case 0:
                return Double.toString(this.getNumber1());
            case 1:
                return Double.toString(this.getNumber2());
            case 2:
                return Double.toString(this.getResult());
            case 3:
                return this.getOperationType();

        }
        return "";
    }

    public Operation() {
    }

    public Operation(double number1, double number2, String operationType) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationType = operationType;
    }

    public Operation(double number1, double number2, double result, String operationType) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
        this.operationType = operationType;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

}
