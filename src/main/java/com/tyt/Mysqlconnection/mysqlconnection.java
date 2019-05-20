/**
 * @author:Administrator
 * @date: 2019/5/20
 * @description:
 */
import java.sql.*;
public class mysqlconnection {
    public static void main(String[] args) {
    Connection connection = null;
    PreparedStatement state = null;
    ResultSet rest = null;
    String url = "jdbc:mysql://localhost:3306/mytest?serverTimezone=GMT";
    String user = "root";
    String password = "";
    try{
        connection = DriverManager.getConnection(url, user, password);
        //查找
//        String sql01 = "select name,id from student where name like \"黄%\";";
//        state = connection.prepareStatement(sql01);
//        rest = state.executeQuery(sql01);
//        while (rest.next()) {
//            System.out.print("name:" + rest.getString("name") + "  id:" + rest.getInt("id"));
//        }
        //增加,会有nullpointexception(41行）,插入成功
//        String sql02 = "insert into student(name,class_num) values(?,?)";
//        state = connection.prepareStatement(sql02);
//        state.setString(1,"黄哑巴");
//        state.setInt(2,1903);
//        state.executeUpdate();
        //删除和更改,会有nullpointexception(41行）
//        String sql03 = "delete from student where name='黄哑巴';";
        String sql04 = "update student set name='黄黄黄',class_num=1905 where id=60;";
        state=connection.prepareStatement(sql04);
        state.executeUpdate();
    }
    catch(SQLException s){
        s.printStackTrace();
    }
    catch(Exception e){
            e.printStackTrace();
    }
    finally {
        //关闭资源
        try {
            rest.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
}
