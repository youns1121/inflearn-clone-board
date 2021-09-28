package com.ysmin.inflearncloneboard.entity;

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
@Table(name = "lecture_after_answer")
@Entity
public class LectureAfterAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_after_answer_id")
    private Long LectureAfterAnswerId;

    @Column(name = "after_answer_content")
    private String AfterAnswerContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_seq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_after_id")
    private LectureAfter lectureAfter;



}
