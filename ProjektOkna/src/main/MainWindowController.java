package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    Label labelText;
    @FXML
    Button button1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelText.setText("Program wystarował");
    }
    public void buttonClicked(){
        labelText.setText("Button zostal klikniety");
    }
}
