package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;

public class StackPaneController {

    @FXML
    private Button button;

    @FXML
    private Button idRightButton;
    
    @FXML
    private CheckBox chkBox;

    @FXML
    void btnOnAction(ActionEvent wypisz_btn_action) {
    	System.out.println("Button on Action ");
    }

    @FXML
    void btnText(ActionEvent wypisz_btnText) {
    	System.out.println("btnText");
    }
    
    @FXML
    void klikChkBox(ActionEvent event) {
    	System.out.println("Kli checkBox");
    	if (chkBox.isPressed()) {
    		System.out.println("CheckBox pressed");
    	}
    }

}

