package com.zerobase.fastlms.history.service.impl;

import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import com.zerobase.fastlms.history.repository.LoginHistoryRepository;
import com.zerobase.fastlms.history.service.LoginHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginHistoryServiceImpl implements LoginHistoryService {

    private final LoginHistoryRepository loginHistoryRepository;



    @Override
    public void saveLoginHistory(LoginHistoryEntity loginHistory) {
        loginHistoryRepository.save(loginHistory);
    }
}