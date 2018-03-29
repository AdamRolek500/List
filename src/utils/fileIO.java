package utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;

/**
 *
 * @author adamr
 */
public class fileIO {

    private PrintWriter out = null;

    public fileIO() {
        try {
            out = new PrintWriter("SavedTasks.txt");
        } catch (FileNotFoundException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void taskOut(ObservableList<CheckBox> list) {
        try {
            int i = 0;
            for (CheckBox list1 : list) {
                out.print(list1.toString() + "\r\n");
                i++;
            }
            out.print(i);
            out.close();
        } catch (Exception e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
    
    public void TaskIn (ArrayList<Item> list){
        
    }

}
