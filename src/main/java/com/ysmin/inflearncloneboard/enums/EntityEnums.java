package com.ysmin.inflearncloneboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


public enum EntityEnums {
    ;

    @Getter
    @AllArgsConstructor
    public enum DifficultyType{
        HIGHT(1, "상"),
        MIDDLE(2, "중"),
        LOWER(3, "하")
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum AmountType{
        FREE(1, "무료"),
        PAY(2, "유료"),
        DISCOUNT(3, "할인")
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum LectureType{
        Online(1, "온라인"),
        Offline(2, "오프라인")
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum CategoryType{
        LARGE(1, "대분류"),
        MEDIUM(2, "중분류"),
        SMALL(3, "소분류")
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum MemberType{
        STUDENT(1, "학생"),
        INSTRUCTOR(2, "강사"),
        ADMIN(0, "관리자"),
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RegistrationStatus{
        WAITING(1, "대기중"),
        ONGOING(2, "진행중"),
        COMPLETION(3, "완료")
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RatingScore{
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        ;
        private int statusCode;
    }

    @Getter
    @AllArgsConstructor
    public enum CommunityType{
        QNA(1, "질문답변"),
        FREE_TOPIC(2, "자유주제"),
        STUDY(3, "스터디"),
        ;
        private int statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RecruitmentStatus{
        RECURITMENT_ING(1, "모집중"),
        RECURITMENT_COMPLETION(2, "모집완료"),
        ;
        private int statusCode;
        private String statusTitle;
    }






}
