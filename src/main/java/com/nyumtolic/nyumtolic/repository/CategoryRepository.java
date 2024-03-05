package com.nyumtolic.nyumtolic.repository;

import com.nyumtolic.nyumtolic.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    // 메인 카테고리인 카테고리 목록을 조회하는 메서드
    List<Category> findByIsMainCategoryTrue();

    // 메인 카테고리가 아닌 카테고리 목록을 조회하는 메서드
    List<Category> findByIsMainCategoryFalse();
}
