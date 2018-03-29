package fxml;

import utils.Item;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import utils.List;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField taskDes;
    @FXML
    private TextField taskLen;
    @FXML
    private ListView taskList;

    @FXML
    private void addTask(ActionEvent event) {
        Item item = new Item(taskDes.getText(), Integer.parseInt(taskLen.getText()));
        List.getInstance().getList().add(new CheckBox(item.toString()));
        label.setText("Task Added!");
    }

    @FXML
    private void completeTask(ActionEvent event) {
        if (!List.getInstance().getList().isEmpty() && !List.getInstance().getList().isEmpty()) {
            label.setText("Nothing Was Selected!");
            Iterator<CheckBox> it = List.getInstance().getList().iterator();
            while (it.hasNext()) {
                CheckBox box = it.next();
                if (box.isSelected()) {
                    it.remove();
                    label.setText("Task Completed!");
                }
            }
        } else if (List.getInstance().getList().isEmpty() && List.getInstance().getList().isEmpty()) {
            label.setText("There Are No Tasks!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        taskList.setItems(List.getInstance().getList());
        taskList.setMinWidth(700.0);
    }

}
