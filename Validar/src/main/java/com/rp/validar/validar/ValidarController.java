package com.rp.validar.validar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Optional;

public class ValidarController {

    //Etiquetas id fx onAction del scene Builder que voy a usar.
    @FXML
    private TextField txt_apellido;
    @FXML
    private TextField txt_dni;
    @FXML
    private TextField txt_nombre;
    @FXML
    private Label lbl_salida;

    //Constructor
    public ValidarController() {    }

    //Instancio la clase usuario.
    Usuario usuario = new Usuario();

    //Métodos OnAction
    @FXML
    public void btn_enviar_action(ActionEvent actionEvent) {
        //System.out.println("enviar");
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String dni = txt_dni.getText();

        //Si falta algún dato le mostramos un mensaje indicándolo
        Alert alert;
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty()) {
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos...");
            alert.setHeaderText("Faltan datos por introducir en el formulario.");
            alert.setContentText("Debe introducir el nombre, apellido y dni.");
            txt_nombre.requestFocus();
        } else {
            //Setteo los datos del usuario
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setDni(dni);
            //Si el usuario ha introducido nombre y apellidos los mostramos en un mensaje
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario.");
            alert.setContentText("Nombre: " + nombre +
                    System.lineSeparator() + "Apellidos: " + apellido +
                    System.lineSeparator() + "DNI: " + dni);
            lbl_salida.setText(usuario.toString());
        }
        alert.showAndWait();
        lbl_salida.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
        txt_nombre.requestFocus();
    }

    @FXML
    public void btn_limpiar_action(ActionEvent actionEvent) {
        //System.out.println("limpiar");
        lbl_salida.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
        txt_nombre.requestFocus();
    }

    @FXML
    public void btn_salir_action(ActionEvent actionEvent) {
        //System.out.println("salir");

        //Mostramos mensaje de confirmación para cerrar la aplicación
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cerrar aplicación...");
        alert.setHeaderText(null);
        alert.setContentText("¿Desea cerrar la aplicación?");
        Optional<ButtonType> result = alert.showAndWait();
        //Si se ha pulsado el botón "Aceptar"
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else { //Si se ha pulsado el botón "Cancelar" enfocamos en el TextField Nombre
            txt_nombre.requestFocus();
        }
    }

}