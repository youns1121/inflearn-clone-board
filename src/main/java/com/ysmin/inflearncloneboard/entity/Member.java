package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.common.BaseEntity;
import com.ysmin.inflearncloneboard.dto.MemberDto;
import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "member")
@Entity
public class Member extends BaseEntity {

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

    @Column(name = "member_birthdate", columnDefinition = "varchar(8) comment '생년월일'")
    private String memberBirthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_type")
    private EntityEnums.MemberType memberType;

    @OneToMany(mappedBy = "member")
    private List<Likes> likes = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<CourseRegistration> courseRegistrationList = new ArrayList<>();

    @Builder
    public void createMember(MemberDto memberDto){
        this.memberId = memberDto.getMemberId();
        this.memberPw = memberDto.getMemberPw();
        this.memberName = memberDto.getMemberName();
        this.memberBirthDate = memberDto.getMemberBirthDate();
        this.memberType = memberDto.getMemberType();
    }



}
