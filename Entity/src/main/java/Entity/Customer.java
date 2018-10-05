package Entity;

public class Customer {
    private int cid;
    private String cname;
    private String csex;
    private String cphone;
    private String  ccard;
    private int rid;

    /*房间*/
    private Room room;
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer() {    }

    public Customer(String cname, String csex, String cphone, String ccard, int rid) {
        this.cname = cname;
        this.csex = csex;
        this.cphone = cphone;
        this.ccard = ccard;
        this.rid = rid;
    }

    public Customer(int cid, String cname, String csex, String cphone, String ccard, int rid) {
        this.cid = cid;
        this.cname = cname;
        this.csex = csex;
        this.cphone = cphone;
        this.ccard = ccard;
        this.rid = rid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCcard() {
        return ccard;
    }

    public void setCcard(String ccard) {
        this.ccard = ccard;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", csex='" + csex + '\'' +
                ", cphone='" + cphone + '\'' +
                ", ccard='" + ccard + '\'' +
                ", rid=" + rid +
                ", roomid=" + room.getRid() +
                ", roomname=" + room.getRname() +
                '}';
    }
}
