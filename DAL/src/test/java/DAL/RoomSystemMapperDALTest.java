package DAL;

import Entity.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RoomSystemMapperDALTest {

    RoomSystemMapperDAL dal=null;
    @Before
    public  void  before(){
        dal=new RoomSystemMapperDAL();
    }

    @Test
    public void selectAllRoom() {
        List<Room> rooms=dal.selectAllRoom();
        System.out.println(rooms);
    }
    @Test
    public void selectRoomByrid(){
        Room room=dal.selectRoomByrid(3);
        System.out.println(room.toString());
    }

    @Test
    public void selectAllCustomer() {
    }

    @Test
    public void selectAllAdministrators() {
    }

    @Test
    public void selectAllCustomerAndRoom() {
    }

    @Test
    public void selectCustomerAndRoomByCid() {
    }

    @Test
    public void selectAllRelationship() {
    }

    @Test
    public void selectAllRelationshipByAid() {
    }

    @Test
    public void selectAllRelationshipMoreAndMore() {
    }

    @Test
    public void updateRoomByrid() {
    }

    @Test
    public void updateRoomTypeBytid() {
    }

    @Test
    public void selectRoomBynameOrBypriceOrByrid() {
    }

    @Test
    public void selectAllRoomWithTrim() {
    }

    @Test
    public void activeInsertRoom() {
    }
}