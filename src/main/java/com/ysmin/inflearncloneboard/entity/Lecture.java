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
@Table(name = "lecture")
@Entity
public class Lecture {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_id")
    private Long lectureId;

    @Column(name = "lecture_name")
    private String lectureName;

    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty_type")
    private EntityEnums.DifficultyType difficultyType;

    @Enumerated(EnumType.STRING)
    @Column(name = "amount_type")
    private EntityEnums.AmountType amountType;

    @Enumerated(EnumType.STRING)
    @Column(name = "lecture_type")
    private EntityEnums.LectureType lectureType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_seq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "lecture")
    private List<CourseRegistration> courseRegistrationList = new ArrayList<>();

}
