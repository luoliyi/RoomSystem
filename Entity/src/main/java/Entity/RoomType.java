package Entity;

public class RoomType {
    private int tid;
    private String tname;

    public RoomType(){}

    public RoomType( String tname) {
        this.tname = tname;
    }
    public RoomType(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
