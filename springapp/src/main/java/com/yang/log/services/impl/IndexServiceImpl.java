package com.yang.log.services.impl;

import com.yang.log.services.IndexService;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/15 11:40
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public void index() {
        System.out.println("IndexService index");
    }
}
