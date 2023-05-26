package com.zerobase.fastlms.history.service;

import com.zerobase.fastlms.history.entity.LoginHistoryEntity;

public interface LoginHistoryService {
    void saveLoginHistory(LoginHistoryEntity loginHistory);
}