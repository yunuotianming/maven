package com.gin.test;

import com.gin.dao.ItemsDao;
import com.gin.dao.impl.ItemsDaoImpl;
import com.gin.domain.Items;
import org.junit.Test;

import java.util.List;

/**
 * @author gin
 * @date 2019/9/21 12:39
 */

public class ItemsTest {

    @Test
    public void testFindAll(){
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> itemsList = itemsDao.findAll();
        itemsList.forEach(e -> {
            System.out.println(e.getName());
        });
    }
}
