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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

/**
 *
 * @author adamr
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField taskDes;
    @FXML
    private TextField taskLen;
    @FXML
    private ListView<CheckBox> taskList;
    private ArrayList<Item> list = new ArrayList<>();
    private ObservableList<CheckBox> buttons
            = FXCollections.observableArrayList();

    @FXML
    private void addTask(ActionEvent event) {
        list.add(new Item(taskDes.getText(), Integer.parseInt(taskLen.getText())));
        label.setText("Task Added!");
        buttons.clear();
        for (int i = 0; i < list.size(); i++) {
            CheckBox c = new CheckBox(list.get(i).toString());
            buttons.add(c);
        }
    }

    @FXML
    private void completeTask(ActionEvent event) {
        label.setText("Nothing Was Selected!");
        if (!list.isEmpty() && !buttons.isEmpty()) {
            for (int i = 0; i < buttons.size(); i++) {
                if (buttons.get(i).isSelected()) {
                    buttons.remove(i);
                    list.remove(i);
                    label.setText("Task Completed!");
                }
            }
        }else if (list.isEmpty() && buttons.isEmpty()){
            label.setText("There Are No Tasks!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        taskList.setItems(buttons);
        taskList.setMinWidth(700.0);
    }

}
