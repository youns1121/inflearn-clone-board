package com.ysmin.inflearncloneboard.controller;

import com.ysmin.inflearncloneboard.dto.LectureDto;
import com.ysmin.inflearncloneboard.service.LectureMgmtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "강의 관리 API", tags = "강의 관리 API")
@RequestMapping(value ="/v2/api")
@RequiredArgsConstructor
@RestController
public class LectureController {

    private final LectureMgmtService lectureMgmtService;


    @ApiOperation(value = "강의 생성", notes = "강의를 생성 합니다.")
    @PostMapping("/createlecture")
    public ResponseEntity<Long> createLecture(@RequestBody LectureDto lectureDto){



        return ResponseEntity.ok(lectureMgmtService.createLecture(lectureDto));


    }
}
