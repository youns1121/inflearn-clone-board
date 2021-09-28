package com.ysmin.inflearncloneboard.repository;

import com.ysmin.inflearncloneboard.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
