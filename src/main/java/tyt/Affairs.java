package tyt;

import java.sql.*;

/**
 * @author:Administrator
 * @date: 2019/5/20
 * @description:
 */
public class Affairs {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement state = null;
        String url = "jdbc:mysql://localhost:3306/mytest?serverTimezone=GMT";
        String user = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, user, password);
            //开始事务,DML使用事务，对查询没有意义
            connection.setAutoCommit(false);
//            String sql = "create table `car` (`id` INT not null auto_increment, `brand` Varchar(10), " +
//                    "`price` Int not null default 100,Primary key(`id`)) engine=innodb default charset=utf8;";

//            String sql01="SELECT client,a.id,brand,day,price FROM car AS a  JOIN order_car AS b ON a.id=b.rentcar AND client='小白';";
            String sql01="insert into car(brand,price) values ('001',1000);";
            state=connection.prepareStatement(sql01);
            state.executeUpdate();
//            ResultSet rest = state.executeQuery();
//            while (rest.next()){
//                System.out.println(rest.getString("client")+rest.getInt("id")+rest.getString("brand")+rest.getInt("day"));
//            }
            String sql = "insert into car(brand,price) values ('广汽传祺',1000,20);";
            state = connection.prepareStatement(sql);
            state.executeUpdate();
            connection.commit(); //提交
        }
        catch (Exception e){
            e.printStackTrace();
            try {
                connection.rollback(); //回滚
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {
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
