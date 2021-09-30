package com.ysmin.inflearncloneboard.entity;


import com.ysmin.inflearncloneboard.common.BaseEntity;
import com.ysmin.inflearncloneboard.config.RatingScoreConverter;
import com.ysmin.inflearncloneboard.dto.LectureAfterDto;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor/*(access = AccessLevel.PROTECTED)*/
@AllArgsConstructor
@Getter
@Table(name = "lecture_after")
@Entity
public class LectureAfter extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_after_id")
    private Long lectureAfterId;

    @Column(name = "lecture_after_content")
    private String lectureAfterContent;

    @Convert(converter = RatingScoreConverter.class)
    @Column(name = "rating_score")
    private EntityEnums.RatingScore ratingScore;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_regi_id")
    private CourseRegistration courseRegistration;

    @OneToMany(mappedBy = "lectureAfter")
    private List<LectureAfterAnswer> lectureAfterAnswerList = new ArrayList<>();



    @Builder
    public void createLectureAfter(LectureAfterDto lectureAfterDto){
        this.lectureAfterContent = lectureAfterDto.getLectureAfterContent();
        this.ratingScore = lectureAfterDto.getRatingScore();
        this.courseRegistration = lectureAfterDto.getCourseRegistration();
    }



}
