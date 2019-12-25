package com.gin.service;

import com.gin.domain.Items;

/**
 * @author gin
 * @date 2019/9/21 18:24
 */
public interface ItemsService {
    Items findById(Integer id);
}
