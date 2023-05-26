package com.zerobase.fastlms.history.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "login_history")
public class LoginHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userId;
    private LocalDateTime LoginTime;
    private String LoginIp;
    private String LoginAgent;
}
