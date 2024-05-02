/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.examplecsv.model;

/**
 *
 * @author galagarza
 */
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ucr.ac.cr.calculadora.model.Operation;

public class CSVHandler {

    public CSVHandler() {

    }

    // Método para leer objetos Person desde un archivo CSV
    public static ArrayList<Operation> leerCSV(String rutaArchivo) throws IOException {
        File file = new File(rutaArchivo);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
            // Configurar el lector CSV
            CsvToBean<Operation> csvToBean = new CsvToBeanBuilder<Operation>(reader)
                    .withType(Operation.class)
                    .build();

            // Leer las personas del archivo CSV
            return (ArrayList<Operation>) csvToBean.parse();
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo " + rutaArchivo + " no existe.");
            FileReader fileReader = new FileReader(rutaArchivo);
            return new ArrayList<>();  // Devuelve una lista vacía
        }
    }

    // Método para escribir una lista de objetos Person en un archivo CSV
    public static void escribirCSV(ArrayList<Operation> personas, String rutaArchivo) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
            // Configurar el escritor CSV
            StatefulBeanToCsv<Operation> beanToCsv = new StatefulBeanToCsvBuilder<Operation>(writer).build();

            try {
                // Escribir la lista de personas en el archivo CSV
                beanToCsv.write(personas);
            } catch (CsvDataTypeMismatchException ex) {

            } catch (CsvRequiredFieldEmptyException ex) {

            }
        }
    }

}
