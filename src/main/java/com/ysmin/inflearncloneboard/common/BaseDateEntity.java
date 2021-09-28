package com.ysmin.inflearncloneboard.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseDateEntity {

    /**
     * insertable=false는 insert 시점에 막는 것이고, updatable는 update 시점에 막는 기능
     */

    @CreatedDate
    @Column(name = "create_time", updatable = false)
    private LocalDateTime createTime; // 생성시간

    @LastModifiedDate
    @Column(name = "update_time", updatable = false)
    private LocalDateTime updateTime; // 수정시간
}
