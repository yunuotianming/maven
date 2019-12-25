package com.gin.dao;

import com.gin.domain.Items;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gin
 * @date 2019/9/21 11:36
 */
public interface ItemsDao {
    @Select("select * from items")
    List<Items> findAll();

    @Select("select * from items where id = #{id}")
    Items findById(Integer id);
}
