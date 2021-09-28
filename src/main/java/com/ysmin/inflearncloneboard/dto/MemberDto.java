package com.ysmin.inflearncloneboard.dto;

import com.ysmin.inflearncloneboard.enums.EntityEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class MemberDto {

    @ApiModelProperty(value = "회원 아이디")
    private String memberId;

    @ApiModelProperty(value = "회원 패스워드")
    private String memberPw;

    @ApiModelProperty(value = "회원 이름")
    private String memberName;

    @ApiModelProperty(value = "회원 생년월일")
    private String memberBirthDate;

    @ApiModelProperty(value = "회원 타입")
    private EntityEnums.MemberType memberType;


    @ApiModelProperty(hidden = true)
    private Long memberSeq;




}
