package com.zhu.service;

import com.zhu.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhutao
 * @Classname DemoService
 * @Description TODO 注解报错问题
 * @Date 2022/5/25 16:41
 * @Version V1.0
 */
@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public String query(Long id) {
        return demoDao.query(id);
    }
}
