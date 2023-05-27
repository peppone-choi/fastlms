package com.zerobase.fastlms.history.service;

import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.history.dto.LoginHistoryDto;
import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import com.zerobase.fastlms.history.model.LoginHistory;

import java.util.List;

public interface LoginHistoryService {
    void saveLoginHistory(LoginHistoryEntity loginHistory);
    List<LoginHistoryDto> list(MemberParam parameter);
}