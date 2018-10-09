package DAL;

import Entity.*;
import MyBatisUtils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class RoomSystemMapperDAL implements IRoomSystemMapper {
    static  SqlSession session=MyBatisUtil.openSqlSession(true);
    static IRoomSystemMapper mapper=session.getMapper(IRoomSystemMapper.class);

    public List<Room> selectAllRoom() {
        List<Room> roomList=mapper.selectAllRoom();
        return roomList;
    }

    public List<Customer> selectAllCustomer() {
        return null;
    }

    public List<Administrators> selectAllAdministrators() {
        return null;
    }

    public Room selectRoomByrid(int rid) {
        Room room=mapper.selectRoomByrid(rid);
        return  room;
    }

    public List<Customer> selectAllCustomerAndRoom() {
        return null;
    }

    public Customer selectCustomerAndRoomByCid(int cid) {
        return null;
    }

    public List<Relationship> selectAllRelationship() {
        return null;
    }

    public List<Relationship> selectAllRelationshipByAid(int aid) {
        return null;
    }

    public List<Relationship> selectAllRelationshipMoreAndMore() {
        return null;
    }

    public int updateRoomByrid(Room room) {
        return 0;
    }

    public int updateRoomTypeBytid(RoomType roomType) {
        return 0;
    }

    public List<Room> selectRoomBynameOrBypriceOrByrid(String rname, double rprice, int rid) {
        return null;
    }

    public List<Room> selectAllRoomWithTrim(String rname) {
        return null;
    }

    public int activeInsertRoom(Room room) {
        return 0;
    }
}
