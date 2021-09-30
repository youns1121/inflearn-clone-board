package com.ysmin.inflearncloneboard.controller;

import com.ysmin.inflearncloneboard.dto.LectureAfterDto;
import com.ysmin.inflearncloneboard.service.LectureAfterMgmtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "수강후기 관리 API", tags = "수강후기 관리 API")
@RequestMapping(value ="/v2/api")
@RestController
@RequiredArgsConstructor
public class LectureAfterMgmtController {

    private final LectureAfterMgmtService lectureAfterMgmtService;


    @ApiOperation(value = "수강후기 생성", notes = "수강후기를 생성 합니다.")
    @PostMapping("/createlectureafter")
    private ResponseEntity<Long> createLectureAfter(@RequestBody LectureAfterDto lectureAfterDto){

        return ResponseEntity.ok(lectureAfterMgmtService.createLectureAfter(lectureAfterDto));
    }
}
