package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.common.BaseEntity;
import com.ysmin.inflearncloneboard.dto.CategoryDto;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "category")
@Entity
public class Category extends BaseEntity { //카테고리


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_memo")
    private String categoryMemo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "category_type")
    private EntityEnums.CategoryType categoryType;

    @Column(name = "category_number")
    private String categoryNumber;

    @Column(name = "category_parent_type")
    private String categoryParentType;

    @OneToMany(mappedBy = "category")
    private List<Lecture> lectureList = new ArrayList<>();

    @Builder
    public void createCategory(CategoryDto categoryDto){
        this.categoryName = categoryDto.getCategoryName();
        this.categoryMemo = categoryDto.getCategoryMemo();
        this.categoryType = categoryDto.getCategoryType();
        this.categoryNumber = categoryDto.getCategoryNumber();
        this.categoryParentType = categoryDto.getCategoryParentType();

    }




}
