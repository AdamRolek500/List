/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author adamr
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Calendar c = Calendar.getInstance();

        c.setTime(new Date()); // Now use today date.

        c.add(Calendar.DATE, 15); // Adds 15 days
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("Do it my dude", c.getTime()));
        System.out.println(list.get(0).toString());
        label.setText(list.get(0).toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
