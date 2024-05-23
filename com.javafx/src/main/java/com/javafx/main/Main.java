package com.javafx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
		StackPane sPane = loader.load();
		Scene scene = new Scene(sPane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Apka");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public void init() {
		
	}

}
