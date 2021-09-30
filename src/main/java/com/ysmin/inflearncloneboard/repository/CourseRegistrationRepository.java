package com.ysmin.inflearncloneboard.repository;

import com.ysmin.inflearncloneboard.entity.CourseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {
}
