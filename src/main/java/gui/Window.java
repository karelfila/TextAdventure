package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window extends Application {
    public static Stage myStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/mainMenu.fxml"));
        Scene scene = new Scene(root);

        myStage = primaryStage;

        scene.getStylesheets().add("/styles/stylesheet.css");
        primaryStage.setResizable(false);
        primaryStage.setTitle("ADVENTURE Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

