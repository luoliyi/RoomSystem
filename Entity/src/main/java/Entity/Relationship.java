package Entity;

import java.util.List;

public class Relationship {
    private int relationid;
    private int aid;
    private int rid;

    /*一对多 1个管理员管理多个房间*/
    List<Room> roomList;
    List<Administrators> administratorsList;

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Administrators> getAdministratorsList() {
        return administratorsList;
    }

    public void setAdministratorsList(List<Administrators> administratorsList) {
        this.administratorsList = administratorsList;
    }

    public Relationship() {    }
    public Relationship(int relationid, int aid, int rid) {
        this.relationid = relationid;
        this.aid = aid;
        this.rid = rid;
    }
    public Relationship(int aid, int rid) {
        this.aid = aid;
        this.rid = rid;
    }

    public int getRelationid() {
        return relationid;
    }

    public void setRelationid(int relationid) {
        this.relationid = relationid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "relationid=" + relationid +
                ", aid=" + aid +
                ", rid=" + rid +
                ", roomListid=" + roomList +
                ", administratorsList=" + administratorsList +
                '}';
    }
}
