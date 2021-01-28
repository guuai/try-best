package com.guuai.trybest.admin.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基本页面映射
 *
 * @author jiangzhenyu
 * @date 2021/1/28
 **/
@Controller
@RequestMapping("/api")
public class AdminController {

    @GetMapping("/console")
//    @ApiOperation(value = "后台首页")
    public String console(){
        return "console/console1";
    }

    @GetMapping("/form/build")
//    @ApiOperation(value = "后台首页")
    public String formBuild(){
        return "system/form/index";
    }

    @GetMapping("/403")
//    @ApiOperation(value = "403页面")
    public String error403(){
        return "error/403";
    }

    @GetMapping("/404")
//    @ApiOperation(value = "404页面")
    public String error404(){
        return "error/404";
    }

    @GetMapping("/500")
//    @ApiOperation(value = "500页面")
    public String error500(){
        return "error/500";
    }

}
