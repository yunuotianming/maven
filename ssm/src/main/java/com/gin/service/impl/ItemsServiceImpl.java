package com.gin.service.impl;

import com.gin.dao.ItemsDao;
import com.gin.domain.Items;
import com.gin.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gin
 * @date 2019/9/21 18:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
