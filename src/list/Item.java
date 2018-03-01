package list;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Item {

    private String des;
    private final Date start;
    private Date end;

    public Item(String des, int days) {
        this.des = des;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        this.start = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); //getting todays date
        c.add(Calendar.DATE, days); // Adding days.
        this.end = c.getTime();
    }

    public String getEnd() {
        return new SimpleDateFormat("MM/dd/yyyy").format(end);
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

    public String getStart() {
        return new SimpleDateFormat("MM/dd/yyyy").format(start);
    }

    @Override
    public String toString() {
        return this.getDes() + " , start = " + this.getStart() + " , end = "
                + this.getEnd();
    }

}
