package com.ysmin.inflearncloneboard.service;

import com.ysmin.inflearncloneboard.dto.LectureAfterDto;
import com.ysmin.inflearncloneboard.entity.CourseRegistration;
import com.ysmin.inflearncloneboard.entity.LectureAfter;
import com.ysmin.inflearncloneboard.repository.CourseRegistrationRepository;
import com.ysmin.inflearncloneboard.repository.LectureAfterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LectureAfterMgmtService {

    private final LectureAfterRepository lectureAfterRepository;
    private final CourseRegistrationRepository courseRegistrationRepository;


    @Transactional
    public Long createLectureAfter(LectureAfterDto lectureAfterDto){

        CourseRegistration courseRegistration = courseRegistrationRepository.findById(lectureAfterDto.getCourseRegiId()).orElse(null);
        lectureAfterDto.setCourseRegistration(courseRegistration);

        LectureAfter lectureAfter = new LectureAfter();
        lectureAfter.createLectureAfter(lectureAfterDto);

        return lectureAfterRepository.save(lectureAfter).getLectureAfterId();
    }
}
