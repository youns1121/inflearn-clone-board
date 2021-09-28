package com.ysmin.inflearncloneboard.dto;

import com.ysmin.inflearncloneboard.enums.EntityEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class CategoryDto { //

    @ApiModelProperty(value = "카테고리 이름")
    @Column(name = "category_name")
    private String categoryName;

    @ApiModelProperty(value = "카테고리 메모")
    @Column(name = "category_memo")
    private String categoryMemo;

    @ApiModelProperty(value = "카테고리 분류")
    @Column(name = "category_type")
    private EntityEnums.CategoryType categoryType;

    @ApiModelProperty(value = "카테고리 번호")
    @Column(name = "category_number")
    private String categoryNumber;

    @ApiModelProperty(value = "부모 카테고리")
    @Column(name = "category_parent_type")
    private String categoryParentType;

}
