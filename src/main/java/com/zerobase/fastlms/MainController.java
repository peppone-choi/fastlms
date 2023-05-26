package com.zerobase.fastlms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {

        return "index";
    }
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>hello</p>" +
                "<p>fastlmswebsite!</p>" +
                "<p>안녕하시오!</p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();
    }
}
