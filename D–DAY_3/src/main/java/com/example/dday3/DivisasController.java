package com.example.dday3;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.Scanner;

import static currency.Conversor.convertirMoneda;

public class DivisasController {
    Scanner consola = new Scanner(System.in);
    private String combinacion = "MXNMXN";
    @FXML
    private ComboBox<String> comboBoxMonedas;
    @FXML
    private ComboBox<String> comboBoxMonedass;
    @FXML
    private TextField entrada;

    @FXML
    private TextField salida;

    @FXML
    private void initialize() {
        entrada.setText("0");
        comboBoxMonedas.getItems().addAll("MXN", "USD", "EUR");
        comboBoxMonedas.setValue("MXN");
        comboBoxMonedass.getItems().addAll("MXN", "USD", "EUR");
        comboBoxMonedass.setValue("MXN");

        // Listener para cambios de selección
        comboBoxMonedas.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {

            System.out.println("Moneda seleccionada: " + newValue);
            combinacion = newValue + combinacion.substring(3,6);
            System.out.println(combinacion);
        });

        comboBoxMonedass.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {

            System.out.println("Moneda seleccionada: " + newValue);
            combinacion = combinacion.substring(0,3) + newValue;
            System.out.println(combinacion);
        });

    }
    @FXML
    private void convertirTexto() {
        salida.setText(String.valueOf(convertirMoneda(combinacion, Float.parseFloat(entrada.getText()))));
    }
    @FXML
    private void limpiarTexto() {
        entrada.setText("0");
        salida.setText("");
    }

}