package DAL;

import Entity.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class IRoomMapperTest {

    RoomDAL dal=null;
    @Before
    public void before(){
        dal=new RoomDAL();
    }

    @Test
    public void selectAllRoom() {
       List<Room> list=dal.selectAllRoom();
       for (Room room:list){
           System.out.println(room.toString());
       }

    }

    @Test
    public void selectAllCustomer() {
        List<Customer>list=dal.selectAllCustomer();
        for (Customer customer:list){
            System.out.println(customer.toString());
        }
    }

    @Test
    public void selectAllAdministrators() {
        List<Administrators>list=dal.selectAllAdministrators();
        for (Administrators administrators:list){
            System.out.println(administrators.toString());
        }
    }

    /* 1对1 */
    @Test
    public  void  selectAllCustomerAndRoom(){
        List<Customer>list=dal.selectAllCustomerAndRoom();
        for (Customer customer:list){
            System.out.println(customer.toString());
        }
    }
    @Test
    public  void  selectCustomerAndRoomByCid(){
        Customer customer=dal.selectCustomerAndRoomByCid(3);
        System.out.println(customer.toString());
    }

    @Test
    public  void selectAllRelationship(){
        List<Relationship> relationshipList=dal.selectAllRelationship();
        for (Relationship relationship:relationshipList){
            System.out.println(relationship.toString());
        }
    }

    /*查询管理员为1的管理员管理的房间*/
    @Test
    public void selectAllRelationshipByAid(){
        List<Relationship> relationshipList=dal.selectAllRelationshipByAid(1);
        for (Relationship relationship:relationshipList){
            System.out.println(relationship.toString());
        }
    }

    /*多对多查询 查询多个房间被多个管理员管理*/
    @Test
    public  void selectAllRelationshipMoreAndMore(){
        List<Relationship> relationshipList=dal.selectAllRelationshipMoreAndMore();
        for (Relationship relationship:relationshipList){
            System.out.println(relationship.toString());
        }
    }


    //修改
    @Test
    public void updateRoomByrid(){
        Room room=new Room();
        room.setRid(1);
        room.setRname("单人间min2");
        room.setRbednumber(2);
        //room.setRprice(202);
        int t=dal.updateRoomByrid(room);
        System.out.println(t);
    }


    //修改
    @Test
    public void updateRoomTypeBytid(){
        RoomType roomType=new RoomType(2,"多人间");
        int result=dal.updateRoomTypeBytid(roomType);
        System.out.println(result);
    }

    /*choose*/
    @Test
    public void selectRoomBynameOrBypriceOrByrid(){
        List<Room> roomList=dal.selectRoomBynameOrBypriceOrByrid("钟",200,1);
        for (Room room:roomList){
            System.out.println(room.toString());
        }
    }

    //trim
    @Test
    public void selectAllRoomWithTrim(){
        List<Room> roomList=dal.selectAllRoomWithTrim("单");
        for (Room room:roomList){
            System.out.println(room.toString());
        }
    }

    //activeInsertRoom
    @Test
    public void activeInsertRoom(){
        Room room=new Room("总统套房2",0,800,3);
        int result=dal.activeInsertRoom(room);
        System.out.println(result);
        Assert.assertEquals(1,result);
    }
}