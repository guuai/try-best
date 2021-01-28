package com.guuai.trybest.admin.controler;

import com.wf.captcha.GifCaptcha;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

/**
 * @author codermy
 * @createTime 2020/7/19
 */
@Controller
//@Api(tags = "系统：验证码")
public class CaptchaController {

    @RequestMapping("/captcha")
//    @ApiOperation(value = "验证码")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 设置请求头为输出图片类型
        response.setContentType("image/gif");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        // 三个参数分别为宽、高、位数
        // 静图
//        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
        // 动图
        GifCaptcha specCaptcha = new GifCaptcha(130, 48, 5);
        // 设置字体
        specCaptcha.setFont(new Font("Verdana", Font.PLAIN, 32));  // 有默认字体，可以不用设置
        // 设置类型，纯数字、纯字母、字母数字混合
        specCaptcha.setCharType(Captcha.TYPE_ONLY_NUMBER);

        // 生成的验证码，可以将这个存入库中
        String captcha = specCaptcha.text().toLowerCase();

        // 验证码存入session
        request.getSession().setAttribute("captcha", captcha);

        // 输出图片流
        specCaptcha.out(response.getOutputStream());

        // 以上代码可以使用下面的 方式
/*        CaptchaUtil.out(120, 45, 4, request, response);
        String captcha = request.getSession().getAttribute("captcha").toString();
        */


    }

}
