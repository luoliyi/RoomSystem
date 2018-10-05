package Entity;

public class Administrators {
    private int aid;
    private String aname;
    private String asex;
    private String apassword;
    private int deptid;

    //类型
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Administrators() {    }

    public Administrators(String aname, String asex, String apassword, int deptid) {
        this.aname = aname;
        this.asex = asex;
        this.apassword = apassword;
        this.deptid = deptid;
    }

    public Administrators(int aid, String aname, String asex, String apassword, int deptid) {
        this.aid = aid;
        this.aname = aname;
        this.asex = asex;
        this.apassword = apassword;
        this.deptid = deptid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Administrators{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", apassword='" + apassword + '\'' +
                ", deptid=" + deptid +
                ", deptid=" + dept.getDeptid() +
                ", deptname=" + dept.getDeptname()+
                '}';
    }
}
