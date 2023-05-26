package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;


@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;


    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {
        
        return "error/denied";
    }
}
