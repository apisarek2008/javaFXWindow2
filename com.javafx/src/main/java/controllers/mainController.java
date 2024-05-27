package controllers;

import java.io.IOException;

import com.javafx.main.Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class mainController {

	private Win2Controller win2Controller;
	
	@FXML
	private StackPane MainStackPaneID;

	@FXML
	public void actOpenWin2() {
		openWindow2();
	}

	private void openWindow2() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Win2.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Win2Controller win2 = loader.getController();
		win2.setMainController(this);
		setScreen(pane);
	}

	public void setScreen(Pane pane) {
		MainStackPaneID.getChildren().clear();
		MainStackPaneID.getChildren().add(pane);
	}

	public void setWin2Controller(Win2Controller win2Controller) {
		this.win2Controller = win2Controller;
	}

}
