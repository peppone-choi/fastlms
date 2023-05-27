package com.zerobase.fastlms.history.dto;

import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginHistoryDto {
    private int id;
    private String userId;
    private LocalDateTime loginTime;
    private String loginIp;
    private String loginAgent;

    long totalCount;
    long seq;


    public static LoginHistoryDto of(LoginHistoryEntity entity) {
        return builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .loginTime(entity.getLoginTime())
                .loginIp(entity.getLoginIp())
                .loginAgent(entity.getLoginAgent())
                .build();
    }

    public static List<LoginHistoryDto> of(List<LoginHistoryEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<LoginHistoryDto> loginHistoryList = new ArrayList<>();
        for (LoginHistoryEntity entity : entities) {
            loginHistoryList.add(LoginHistoryDto.of(entity));
        }
        return loginHistoryList;
    }
}