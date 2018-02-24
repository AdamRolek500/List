package list;

import java.util.Calendar;
import java.util.Date;

public class Item {
    private String des;
    private final Date start;
    private Date end;

    public Item(String des, int days) {
        this.des = des;
        this.start = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); //getting todays date
        c.add(Calendar.DATE, days); // Adding days.
        this.end = c.getTime();
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getStart() {
        return start;
    }

    @Override
    public String toString() {
        String s = start.toString().substring(0, start.toString().indexOf(' ', 
                1 + start.toString().indexOf(' ', 1 + start.toString()
                        .indexOf(' ')))); // long ass confusing shit
        String e = end.toString().substring(0, end.toString().indexOf(' ', 1 + 
                end.toString().indexOf(' ', 1 + end.toString().indexOf(' '))));
                // more long ass confusing shit
                // Used to remove timestamp from date string
        return des + " , start = " + s + " , end = " + e;
        //return start.toString();
    }
    
}
