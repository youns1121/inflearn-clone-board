package com.ysmin.inflearncloneboard.entity;


import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "community")
@Entity
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_id")
    private Long communityId;

    @Column(name = "community_content")
    private String communityContent;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "community_type")
    private EntityEnums.CommunityType communityType;

    @Column(name = "solution_yn")
    private String solutionYn = "N";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_seq")
    private Member member;

    @Nullable
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    @OneToMany(mappedBy = "community")
    private List<Likes> likesList = new ArrayList<>();

    @OneToMany(mappedBy = "community")
    private List<CommunityAnswer> communityAnswerList = new ArrayList<>();


}
