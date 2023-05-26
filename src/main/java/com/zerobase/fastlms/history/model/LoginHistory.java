package com.zerobase.fastlms.history.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class LoginHistory {
    private int id;
    private String userId;
    private LocalDateTime LoginTime;
    private String LoginIp;
    private String LoginAgent;
}
