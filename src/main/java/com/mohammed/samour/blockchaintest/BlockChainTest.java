package com.mohammed.samour.blockchaintest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BlockChainTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = FXMLLoader.load(ClassLoader.getSystemResource("fxml/BlockChainTest.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("BlockChain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(BlockChainTest.class, args);
	}

}