package com.gin.dao;

import com.gin.domain.Items;

import java.util.List;

/**
 * @author gin
 * @date 2019/9/21 11:36
 */
public interface ItemsDao {
    List<Items> findAll();
}
