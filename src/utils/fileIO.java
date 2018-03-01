/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import list.Item;

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

    public void taskOut(ArrayList<Item> list) {
        try {
            int i = 0;
            for (Item list1 : list) {
                out.print(list1.getDes() + " " + list1.getStart() + " "
                        + list1.getEnd() + "\r\n");
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
