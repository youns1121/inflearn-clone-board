package com.ysmin.inflearncloneboard.converter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.util.EnumSet;


/**
 * {@link EnumCommonType} enum 을 String 과 상호 변환하는 유틸리티 클래스
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EntityEnumsValueConvertUtils {
    public static <T extends  Enum<T> & EnumCommonType> T ofStatusCode(Class<T> enumClass,
                                                                   String statusCode){
        if (StringUtils.hasText(statusCode)){
            return null;
        }

        return EnumSet.allOf(enumClass).stream()
                .filter(v -> v.getStatusCode().equals(statusCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("enum=[%s], statusCode=[%s]가 존재하지 않습니다.", enumClass.getName(), statusCode)));
    }




}
