package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLFormController {

    @FXML private Text actiontarget;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event){
        actiontarget.setText("Sign in button pressed, good job!");
    }
}
