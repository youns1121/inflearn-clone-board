package com.ysmin.inflearncloneboard.dto;

import com.ysmin.inflearncloneboard.enums.EntityEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class LectureDto { //

    @ApiModelProperty(value = "강의명")
    private String lectureName;

    @ApiModelProperty(value = "강의 난의도")
    private EntityEnums.DifficultyType difficultyType;

    @ApiModelProperty(value = "강의 타입")
    private EntityEnums.LectureType lectureType;

    @ApiModelProperty(value = "금액 타입")
    private EntityEnums.AmountType amountType;


}
