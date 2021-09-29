package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.common.BaseEntity;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "course_regi")
@Entity
public class CourseRegistration extends BaseEntity { //수강신청

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_regi_id")
    private Long CourseRegiId;

    @Enumerated(EnumType.STRING)
    @Column(name = "registration_stus")
    private EntityEnums.RegistrationStatus registrationStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_seq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
