package com.gin.test;

import com.gin.dao.ItemsDao;
import com.gin.domain.Items;
import com.gin.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author gin
 * @date 2019/9/21 12:39
 */

public class ItemsTest {

    @Test
    public void testFindById() {
        //得到spring容器 dao代码测试
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中获取到所需dao接口的代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items item = itemsDao.findById(1);
        System.out.println(item);
    }

    @Test
    public void testFindByIdService() {
        //得到spring容器 service代码测试
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中获取到所需dao接口的代理对象
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items item = itemsService.findById(1);
        System.out.println(item);
    }
}
