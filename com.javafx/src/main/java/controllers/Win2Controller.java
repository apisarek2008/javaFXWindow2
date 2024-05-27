package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class Win2Controller {

	

	@FXML
	private Pane MainStackPaneID;
	
	@FXML
	private Button btnBack;

	private mainController mainController;

	@FXML
	public void actBackToMainView() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
		StackPane MainStackPaneID = null;
		try {
			MainStackPaneID = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainController mC = loader.getController();
		mC.setWin2Controller(this);
		setScreen(MainStackPaneID);
	}

	private void setScreen(StackPane mainStackPaneID) {
		mainController.setScreen(mainStackPaneID);
		
	}

	public void setMainController(mainController mainController) {
		this.mainController = mainController;
	}

}
