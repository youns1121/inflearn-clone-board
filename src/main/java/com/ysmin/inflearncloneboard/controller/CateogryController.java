package com.ysmin.inflearncloneboard.controller;

import com.ysmin.inflearncloneboard.dto.CategoryDto;
import com.ysmin.inflearncloneboard.service.CateogryMgmtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "카테고리 관리 API", tags = "카테고리 관리 API")
@RequestMapping(value ="/v2/api")
@RequiredArgsConstructor
@RestController
public class CateogryController {

    private final CateogryMgmtService cateogryMgmtService;

    @ApiOperation(value = "카테고리 생성", notes = "카테고리를 생성 합니다.")
    @PostMapping("/createcategory")
    public ResponseEntity<Long> createCategory(@RequestBody CategoryDto categoryDto){

        return ResponseEntity.ok(cateogryMgmtService.createCategory(categoryDto));
    }

}
