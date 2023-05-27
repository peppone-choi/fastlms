package com.zerobase.fastlms.history.service.impl;

import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.admin.mapper.LoginMapper;
import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.history.dto.LoginHistoryDto;
import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import com.zerobase.fastlms.history.model.LoginHistory;
import com.zerobase.fastlms.history.repository.LoginHistoryRepository;
import com.zerobase.fastlms.history.service.LoginHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LoginHistoryServiceImpl implements LoginHistoryService {

    private final LoginHistoryRepository loginHistoryRepository;

    private final LoginMapper loginMapper;

    @Override
    public void saveLoginHistory(LoginHistoryEntity loginHistory) {
        loginHistoryRepository.save(loginHistory);
    }

    @Override
    public List<LoginHistoryDto> list(MemberParam parameter) {

        long totalCount = loginMapper.selectListCount(parameter);

        List<LoginHistoryDto> list = loginMapper.selectList(parameter);
        if (!CollectionUtils.isEmpty(list)) {
            int i = 0;
            for(LoginHistoryDto x : list) {
                x.setTotalCount(totalCount);
                x.setSeq(totalCount - parameter.getPageStart() - i);
                i++;
            }
        }
        return list;
    }

}