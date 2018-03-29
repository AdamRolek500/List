package fxml;

import javafx.scene.control.CheckBox;
import utils.Item;

public class Row {
    
    private Item item;
    private CheckBox box;

    public Row(Item item) {
        this.item = item;
        box = new CheckBox(item.toString());
    }
    
    public Item getItem() {
        return item;
    }

    public boolean isSelected() {
        return box.isSelected();
    }
    
    public CheckBox getBox(){
        return box;
    }
    
}
