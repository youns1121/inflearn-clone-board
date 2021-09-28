package com.ysmin.inflearncloneboard.repository;

import com.ysmin.inflearncloneboard.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
