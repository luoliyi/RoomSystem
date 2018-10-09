package DAL;

import Entity.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class RoomDAL implements IRoomMapper {

    //初始化
    InputStream stream=RoomDAL.class.getClassLoader().getResourceAsStream("mybatisconf.xml");
    SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(stream);
    SqlSession session=ssf.openSession();
    /*初始化一个映射文件*/
    IRoomMapper mapper=session.getMapper(IRoomMapper.class);

    /*注意，别关闭session.否则报错Executor was closed.*/

    public List<Room> selectAllRoom() {
        return mapper.selectAllRoom();
    }

    public List<Customer> selectAllCustomer() {
        return mapper.selectAllCustomer();
    }

    public List<Administrators> selectAllAdministrators() {
        return mapper.selectAllAdministrators();
    }

    public List<Customer> selectAllCustomerAndRoom() {
        return  mapper.selectAllCustomerAndRoom();
    }

    public Customer selectCustomerAndRoomByCid(int cid) {
        return mapper.selectCustomerAndRoomByCid(cid);
    }

    public List<Relationship> selectAllRelationship() {
        return  mapper.selectAllRelationship();
    }

    public List<Relationship> selectAllRelationshipByAid(int aid) {
        return  mapper.selectAllRelationshipByAid(aid);
    }

    public List<Relationship> selectAllRelationshipMoreAndMore() {
        return mapper.selectAllRelationshipMoreAndMore();
    }

    public int updateRoomByrid(Room room) {
        int result= mapper.updateRoomByrid(room);
        session.commit();
        return  result;
    }

    public int updateRoomTypeBytid(RoomType roomType) {
        int result= mapper.updateRoomTypeBytid(roomType);
         session.commit();
         return  result;
    }

    public List<Room> selectRoomBynameOrBypriceOrByrid(String rname, double rprice, int rid) {
        return  mapper.selectRoomBynameOrBypriceOrByrid(rname,rprice,rid);
    }

    public List<Room> selectAllRoomWithTrim(String rname) {
        return mapper.selectAllRoomWithTrim(rname);
    }

    public int activeInsertRoom(Room room) {
        int result= mapper.activeInsertRoom(room);
        session.commit();
        return  result;
    }
}
