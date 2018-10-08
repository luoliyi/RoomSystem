package DAL;

import Entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRoomMapper {

    /*单表*/
    List<Room>selectAllRoom();
    List<Customer>selectAllCustomer();
    List<Administrators>selectAllAdministrators();

    /*1对1*/
    List<Customer> selectAllCustomerAndRoom();

    /*1对1 加条件*/
    Customer selectCustomerAndRoomByCid(@Param("customerid") int cid);

    /*1对多*/
    List<Relationship> selectAllRelationship();

    /*1对多加条件*/
    List<Relationship> selectAllRelationshipByAid(@Param("aid") int aid);

    /*多对多*/
    List<Relationship> selectAllRelationshipMoreAndMore();

    /*修改*/
    int updateRoomByrid(Room room);

    int updateRoomTypeBytid(RoomType roomType);
}
