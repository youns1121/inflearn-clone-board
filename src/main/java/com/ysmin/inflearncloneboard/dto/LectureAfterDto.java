package com.ysmin.inflearncloneboard.dto;

import com.ysmin.inflearncloneboard.config.RatingScoreConverter;
import com.ysmin.inflearncloneboard.entity.CourseRegistration;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class LectureAfterDto {

    @ApiModelProperty(value = "수강후기 내용")
    private String lectureAfterContent;

    @ApiModelProperty(value = "수강후기 평점")
    private EntityEnums.RatingScore ratingScore;

    @ApiModelProperty(value = "수강후기 아이디")
    private Long courseRegiId;

    @ApiModelProperty(hidden = true)
    private CourseRegistration courseRegistration;

    public void setCourseRegistration(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;
    }
}
