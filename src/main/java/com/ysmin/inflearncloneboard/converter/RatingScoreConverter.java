package com.ysmin.inflearncloneboard.converter;

import com.ysmin.inflearncloneboard.enums.EntityEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RatingScoreConverter implements AttributeConverter<EntityEnums.RatingScore, String> {
    @Override // Enum -> db데이터
    public String convertToDatabaseColumn(EntityEnums.RatingScore attribute) {
        return attribute.getStatusCode();
    }

    @Override // db데이터 -> Enum
    public EntityEnums.RatingScore convertToEntityAttribute(String dbData) {
        return EntityEnums.RatingScore.ofStatusCode(dbData);
    }
}
