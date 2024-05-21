package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

	@FXML
	private Button button;

	public StackPaneController() {
		
	}

	@FXML
	void initialize() {
		button.setText("nowy Przycisk");
	}
	
	@FXML
	public void btnOnAction() {
		System.out.println("button pressed");
	}
	
	
}
