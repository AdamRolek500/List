package utils;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;

public class List {
    
    private static final List INSTANCE = new List();
    private final ObservableList<CheckBox> list
            = FXCollections.observableArrayList();
    
    public static List getInstance(){
        return INSTANCE;
    }
    
    public ObservableList<CheckBox> getList(){
        return list;
    }
    
}
