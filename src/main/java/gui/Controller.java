//  textArea.setText("You entered another room. In this room there is a troll awaiting you with a riddle, if you complete this riddle " +
//                "he will let you go on. The riddle is: The more you take, the more you leave behind. What am I?");
//        answerText.setText("");
package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import logic.Map;
import logic.Room;

import java.util.Scanner;

public class Controller {
    @FXML
    public Text textArea;
    @FXML
    public TextField answerText;
    @FXML
    public ImageView backImg;

    private boolean firstStart = true;


    @FXML
    public void initialize() {
        backImg.setImage(new Image("Background.jpg"));

        if (firstStart) {
            Map.generateMap();
            System.out.println("We statrted");
            firstStart = false;
        }

    }


    @FXML
    public void onClickLeft(ActionEvent actionEvent) throws Exception {
        System.out.println("123");
        for (Room i : Map.getRooms().values()) {
            if (i.isPlayerInside()) {
                System.out.println("now in room:" + i.getRiddle());
                if (i.getNearRooms()[0] == null) {                       // player vyhrál
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setTitle("Alert");
                    alert.setContentText("You have found a staircase and you escaped the dungeon.");
                    ButtonType okButton = new ButtonType("OK");
                    alert.getButtonTypes().setAll(okButton);
                    alert.show();
                } else if (!Map.getRooms().get(i.getAnswer()).isGuarded()) {

                    //i -*> current

                    Map.getRooms().get(i.getAnswer()).setPlayerInside(false);
                    Map.getRooms().get(i.getAnswer()).getNearRooms()[0].setPlayerInside(true);
                    Map.getRooms().get(i.getAnswer()).getNearRooms()[0].setGuarded(false);
                    Map.getRooms().get(i.getAnswer()).setGuarded(true);
                    Map.getRooms().get(i.getAnswer()).getNearRooms()[1].setGuarded(true);
                    Map.getRooms().get(i.getAnswer()).getNearRooms()[2].setGuarded(true);
                    /*
                    System.out.println("yur mama");//player bude přesunut do o roomku do leva
                    i.setPlayerInside(false);
                    i.getNearRooms()[0].setPlayerInside(true);
                    i.getNearRooms()[0].setGuarded(false);
                    i.setGuarded(true);
                    i.getNearRooms()[1].setGuarded(true);
                    i.getNearRooms()[2].setGuarded(true);
                    textArea.setText(i.getNearRooms()[0].getRiddle());
                    System.out.println(i.isPlayerInside() + " - " + i.getNearRooms()[0].isPlayerInside() + "- 2");

                     */
                } else {
                    System.out.println(i.isPlayerInside() + " - " + i.getNearRooms()[0].isPlayerInside());
                }
                break;
            }
        }
    }

    @FXML
    public void clickEnter(ActionEvent actionEvent) {
        System.out.println("123");
        textArea.getText();

        if (answerText.getText().equals("Footsteps") || answerText.getText().equals("Footprints")) {
            textArea.setText("Good job. You solved the riddle you may continue");
            answerText.setText("");
        } else {
            textArea.setText("Oh no you failed! But you can try again. The riddle is: The more you take, the more you leave behind. What am I?");
            answerText.setText("");
        }
    }

}

