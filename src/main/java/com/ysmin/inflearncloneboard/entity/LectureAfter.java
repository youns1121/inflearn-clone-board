package com.ysmin.inflearncloneboard.entity;


import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "lecture_after")
@Entity
public class LectureAfter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_after_id")
    private Long lectureAfterId;

    @Column(name = "lecture_after_name")
    private String lectureAfterContent;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "rating_score")
    private EntityEnums.RatingScore ratingScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_regi_id")
    private CourseRegistration courseRegistration;

    @OneToMany(mappedBy = "lectureAfter")
    private List<LectureAfterAnswer> lectureAfterAnswerList = new ArrayList<>();




}
