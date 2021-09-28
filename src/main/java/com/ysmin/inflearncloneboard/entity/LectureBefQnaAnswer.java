package com.ysmin.inflearncloneboard.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "lecture_bef_qna_asnwer")
@Entity
public class LectureBefQnaAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_bef_answer_id")
    private Long lectureBefAnswerId;

    @Column(name = "lecture_bef_answer_content")
    private String lectureBefAnswerContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_seq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_bef_id")
    private LectureBefQna lectureBefQna;


}
