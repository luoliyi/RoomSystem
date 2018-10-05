package Entity;

public class Room {
    private int rid;
    private String rname;
    private int rbednumber;
    private double rprice;
    private int tid;

    public Room(){}

    public Room( String rname, int rbednumber, double rprice, int tid) {
        this.rname = rname;
        this.rbednumber = rbednumber;
        this.rprice = rprice;
        this.tid = tid;
    }
    public Room(int rid, String rname, int rbednumber, double rprice, int tid) {
        this.rid = rid;
        this.rname = rname;
        this.rbednumber = rbednumber;
        this.rprice = rprice;
        this.tid = tid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getRbednumber() {
        return rbednumber;
    }

    public void setRbednumber(int rbednumber) {
        this.rbednumber = rbednumber;
    }

    public double getRprice() {
        return rprice;
    }

    public void setRprice(double rprice) {
        this.rprice = rprice;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rbednumber=" + rbednumber +
                ", rprice=" + rprice +
                ", tid=" + tid +
                '}';
    }
}
