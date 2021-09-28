package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "member")
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_seq")
    private Long memberSeq;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pw")
    private String memberPw;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_birthdate")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_Type")
    private EntityEnums.MemberType memberType;

    @OneToMany(mappedBy = "member")
    private List<Likes> likes = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Lecture> lectures = new ArrayList<>();



}
