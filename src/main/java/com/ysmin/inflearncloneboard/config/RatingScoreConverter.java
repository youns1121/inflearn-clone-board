package com.ysmin.inflearncloneboard.config;

import com.ysmin.inflearncloneboard.enums.EntityEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RatingScoreConverter implements AttributeConverter<EntityEnums.RatingScore, Integer> {
    @Override // Enum -> db데이터
    public Integer convertToDatabaseColumn(EntityEnums.RatingScore attribute) {
        return attribute.getStatusCode();
    }

    @Override // db데이터 -> Enum
    public EntityEnums.RatingScore convertToEntityAttribute(Integer dbData) {
        return EntityEnums.RatingScore.fromCode(dbData);
    }
}
