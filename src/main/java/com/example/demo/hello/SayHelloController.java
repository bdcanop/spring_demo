package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Worlds";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String helloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello Worlds</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello Worlds from HTML</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
