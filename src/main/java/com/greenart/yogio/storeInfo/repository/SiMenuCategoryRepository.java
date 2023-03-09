package com.greenart.yogio.storeInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenart.yogio.storeInfo.entity.SiMenuCategoryEntity;

@Repository
public interface SiMenuCategoryRepository  extends JpaRepository<SiMenuCategoryEntity , Long>{
    
}
