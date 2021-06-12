package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class mainMenuController {
    @FXML
    public Button startBtn;
    @FXML
    public Button endBtn;
    public ImageView backImg;

    @FXML
    public void onClickStart(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/mainWindow.fxml")
        );

        Scene scene = new Scene(root);

        Window.myStage.setScene(scene);
    }
    @FXML
    public void initialize() {
        backImg.setImage(new Image("Background.jpg"));
    }

    @FXML
    public void onClickEnd(ActionEvent actionEvent) {
        System.exit(0);
    }
}
