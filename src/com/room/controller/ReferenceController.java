
package com.room.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class ReferenceController implements Initializable {

    @FXML
    private Label mainlabel;
    @FXML
    private JFXComboBox<?> typeofroom;
    @FXML
    private JFXComboBox<?> noofrooms;
    @FXML
    private JFXDatePicker datefrom;
    @FXML
    private JFXDatePicker dateto;
    @FXML
    private JFXButton checkavailability;
    @FXML
    private JFXButton booking;
    @FXML
    private Label availablerooms;
    @FXML
    private Label noofavailablerooms;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void navtobooking(MouseEvent event) {
        
    }
    
}
