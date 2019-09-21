package com.gin.dao.impl;

import com.gin.dao.ItemsDao;
import com.gin.domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gin
 * @date 2019/9/21 11:37
 *
 * 要想从数据库中取出数据
 * 必须要有四个属性:数据库驱动,连接数据库的地址,数据库用户名称,数据库密码
 */
public class ItemsDaoImpl implements ItemsDao {

    @Override
    public List<Items> findAll() {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            //先加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //再获取数据库连接connection
            connection = DriverManager.getConnection("jdbc:mysql://192.168.25.161:3306/learn", "root", "123456");
            //获取真正操作数据库的对象,设置查询语句
            pst = connection.prepareCall("select * from items");
            //执行查询语句并返回查询结果
            rs = pst.executeQuery();
            //把数据库结果集转换成java list
            List<Items> itemsList = new ArrayList();
            while (rs.next()) {
                Items item = new Items();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                itemsList.add(item);
            }
            return itemsList;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //按顺序释放资源
                if (connection != null) {
                    connection.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return null;
    }
}
