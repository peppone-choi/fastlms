package com.zerobase.fastlms.history.repository;

import com.zerobase.fastlms.history.entity.LoginHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginHistoryRepository extends JpaRepository<LoginHistoryEntity, Integer> {
}