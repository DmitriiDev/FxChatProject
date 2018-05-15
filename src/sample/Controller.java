package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea textArea;

    @FXML
    public TextField textField;

    private void send(){
        String str = textField.getText();
        textField.clear();
        textArea.appendText(str + "\n");
    }

    public void sendMessageOnBtnClick(ActionEvent actionEvent){
        this.send();
    }

    @FXML
    private void sendMessageOnEnter(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER))
            this.send();
    }
}
