package com.ysmin.inflearncloneboard.service;

import com.ysmin.inflearncloneboard.dto.LectureDto;
import com.ysmin.inflearncloneboard.entity.Lecture;
import com.ysmin.inflearncloneboard.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class LectureMgmtService {

    private final LectureRepository lectureRepository;


    @Transactional
    public Long createLecture(LectureDto lectureDto){

        Lecture lecture = new Lecture();

        lecture.createLecture(lectureDto);

        return lectureRepository.save(lecture).getLectureId();



    }

}
