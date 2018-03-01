package list;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable, TaskInterface {

    @FXML
    private Label label;
    @FXML
    private TextField taskDes;
    @FXML
    private TextField taskLen;
    @FXML
    private ListView<CheckBox> taskList;
    private final ObservableList<CheckBox> buttons
            = FXCollections.observableArrayList();

    @FXML
    private void addTask(ActionEvent event) {
        TaskInterface.LIST.add(new Item(taskDes.getText(), Integer.parseInt(taskLen.getText())));
        label.setText("Task Added!");
        buttons.clear();
        for (int i = 0; i < TaskInterface.LIST.size(); i++) {
            CheckBox c = new CheckBox(TaskInterface.LIST.get(i).toString());
            buttons.add(c);
        }
    }

    @FXML
    private void completeTask(ActionEvent event) {
        if (!TaskInterface.LIST.isEmpty() && !buttons.isEmpty()) {
            label.setText("Nothing Was Selected!");
            for (int i = 0; i < buttons.size(); i++) {
                if (buttons.get(i).isSelected()) {
                    buttons.remove(i);
                    TaskInterface.LIST.remove(i);
                    label.setText("Task Completed!");
                }
            }
        } else if (TaskInterface.LIST.isEmpty() && buttons.isEmpty()) {
            label.setText("There Are No Tasks!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        taskList.setItems(buttons);
        taskList.setMinWidth(700.0);
    }

}
