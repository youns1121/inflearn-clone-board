package com.ysmin.inflearncloneboard.entity;


import com.ysmin.inflearncloneboard.enums.EntityEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "community_asnwer")
@Entity
public class CommunityAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_asnwer_id")
    private Long communityAnswerId;

    @Column(name = "commubity_asnwer_content")
    private String communityAnswerContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_id")
    private Community community;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_seq")
    private Member member;

    @OneToMany(mappedBy = "communityAnswer")
    private List<Likes> likes = new ArrayList<>();






}
