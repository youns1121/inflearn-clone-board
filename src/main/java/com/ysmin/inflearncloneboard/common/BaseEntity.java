package com.ysmin.inflearncloneboard.common;


import lombok.Getter;
import org.hibernate.envers.NotAudited;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity extends BaseDateEntity {

    @NotAudited
    @NotNull
    @Column(name = "del_yn")
    private String delYn = "N";


}
