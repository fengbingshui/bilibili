package com.zhu.api;

import com.zhu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhutao
 * @Classname DemoController
 * @Description 测试代码
 * @Date 2022/5/25 16:39
 * @Version V1.0
 */
@RestController
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/query")
    public String query(Long id){
        return demoService.query(id);
    }
}
