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
@Table(name = "lecture_bef_qna")
@Entity
public class LectureBefQna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_bef_id")
    private Long lectureBefId;

    @Column(name = "lecture_content")
    private String lectureQnaContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_seq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    @OneToMany(mappedBy = "lectureBefQna")
    private List<LectureBefQnaAnswer> lectureBefQnaAnswerList = new ArrayList<>();



}
