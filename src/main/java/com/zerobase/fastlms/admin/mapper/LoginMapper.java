package com.zerobase.fastlms.admin.mapper;


import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.history.dto.LoginHistoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    long selectListCount(MemberParam parameter);
    List<LoginHistoryDto> selectList(MemberParam parameter);

}