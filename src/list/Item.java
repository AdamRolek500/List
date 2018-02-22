package list;

import java.util.Date;

public class Item {
    private String des;
    private final Date start;
    private Date end;

    public Item(String des, Date end) {
        this.des = des;
        this.start = new Date();
        this.end = end;
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
        return "Item{" + "des=" + des + ", start=" + start + ", end=" + end + '}';
    }
    
}
