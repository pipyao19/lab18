package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextField message;

    @FXML
    TextArea window;

    @FXML
    Button send;

    public void sendMessage(ActionEvent actionEvent) {
        try {
            String m = message.getText();
            window.appendText("Your message: " + m + "\n");
            message.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
