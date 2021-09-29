package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.dto.LectureDto;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
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
    @JoinColumn(name = "instructor_req")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_first_id")
    private Tag tagFrist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_second_id")
    private Tag tagSecond;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_third_id")
    private Tag tagThird;

    @OneToMany(mappedBy = "lecture")
    private List<CourseRegistration> courseRegistrationList = new ArrayList<>();

    @Builder
    public void createLecture(LectureDto lectureDto){
        this.lectureName = lectureDto.getLectureName();
        this.difficultyType = lectureDto.getDifficultyType();
        this.amountType = lectureDto.getAmountType();
        this.lectureType = lectureDto.getLectureType();
    }





}
