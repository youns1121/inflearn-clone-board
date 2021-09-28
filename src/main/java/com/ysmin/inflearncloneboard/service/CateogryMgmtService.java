package com.ysmin.inflearncloneboard.service;

import com.ysmin.inflearncloneboard.dto.CategoryDto;
import com.ysmin.inflearncloneboard.entity.Category;
import com.ysmin.inflearncloneboard.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CateogryMgmtService {

    private final CategoryRepository categoryRepository;


    @Transactional
    public Long createCategory(CategoryDto categoryDto){

        Category category = new Category();

        category.createCategory(categoryDto);

        return categoryRepository.save(category).getCategoryId();
    }
}
