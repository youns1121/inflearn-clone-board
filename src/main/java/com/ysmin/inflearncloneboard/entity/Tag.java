package com.ysmin.inflearncloneboard.entity;

import com.ysmin.inflearncloneboard.common.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "tag")
@Entity
public class Tag extends BaseEntity {
    /**
     * 태그는 강의를 등록할 수 있는 강사(회원)만 등록 할 수 있음
     * 일반회원은 등록된 태그를 사용할 수 있음
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_seq")
    private Member member;



}
