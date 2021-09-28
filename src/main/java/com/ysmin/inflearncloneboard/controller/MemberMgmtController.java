package com.ysmin.inflearncloneboard.controller;

import com.ysmin.inflearncloneboard.dto.MemberDto;
import com.ysmin.inflearncloneboard.service.MemberMgmtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "멤버 관리 API", tags = "멤버 관리 API")
@RequestMapping(value ="/v2/api")
@RestController
@RequiredArgsConstructor
public class MemberMgmtController {

    private final MemberMgmtService memberMgmtService;


    @ApiOperation(value = "회원가입", notes = "회원가입 합니다.")
    @PostMapping("/singup")
    public ResponseEntity<Long> createMember(@RequestBody MemberDto memberDto){

        return  ResponseEntity.ok(memberMgmtService.createMember(memberDto));

    }
}
