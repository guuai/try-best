package com.guuai.trybest.admin.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试项目成功运行
 *
 * @author jiangzhenyu
 * @date 2021/1/28
 **/
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/sayhello")
    public String sayhello(){
        return "hello";
    }


}
