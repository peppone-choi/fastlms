package com.zerobase.fastlms.history.controller;

import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
public class LoginHistoryController {

    public LoginHistoryEntity loginUserDataFind(HttpServletRequest request) {

        return LoginHistoryEntity.builder()
                .userId(request.getUserPrincipal().getName())
                .LoginIp(request.getRemoteAddr())
                .LoginTime(LocalDateTime.now())
                .LoginAgent(request.getHeader("user-agent"))
                        .build();
    }
}
