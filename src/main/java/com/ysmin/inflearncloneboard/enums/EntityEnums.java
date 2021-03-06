package com.ysmin.inflearncloneboard.enums;

import com.ysmin.inflearncloneboard.converter.EnumCommonType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;



public enum EntityEnums {
    ;

    @Getter
    @AllArgsConstructor
    public enum DifficultyType{
        HIGHT(1, "상"),
        MIDDLE(2, "중"),
        LOWER(3, "하")
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum AmountType{
        FREE(1, "무료"),
        PAY(2, "유료"),
        DISCOUNT(3, "할인")
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum LectureType{
        Online(1, "온라인"),
        Offline(2, "오프라인")
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum CategoryType{
        LARGE("대분류"),
        MEDIUM("중분류"),
        SMALL("소분류")
        ;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum MemberType{
        STUDENT(1, "학생"),
        INSTRUCTOR(2, "강사"),
        ADMIN(0, "관리자"),
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RegistrationStatus{
        WAITING(1, "대기중"),
        ONGOING(2, "진행중"),
        COMPLETION(3, "완료")
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RatingScore implements EnumCommonType{
        ONE("1","1점"),
        TWO("2","2점"),
        THREE("3","3점"),
        FOUR("4","4점"),
        FIVE("5","5점"),
        ;
        private String statusCode;
        private String statusName;

        public static RatingScore ofStatusCode(String statusCode){
            return Arrays.stream(RatingScore.values())
                    .filter(v -> v.getStatusCode().equals(statusCode))
                    .findAny()
                    .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 statusCode=[%s]가 존재하지 않습니다.", statusCode)));
        }


        // 이렇게 작성하면 중복 코드가 많아지면서 지저분해진다다
       /*private static final Map<String, RatingScore> codeToEnum =
                Stream.of(values()).collect(toMap(RatingScore::getStatusCode, e -> e));

        public static RatingScore ofStatusCode(String statusCode){

            RatingScore ratingScore = codeToEnum.get(statusCode);
            if(Objects.isNull(ratingScore)){
                throw new IllegalArgumentException("잘못된 RatingScore 타입입니다.");
            }
            return ratingScore;
        }*/

    }

    @Getter
    @AllArgsConstructor
    public enum CommunityType{
        QNA(1, "질문답변"),
        TOPIC(2, "자유주제"),
        STUDY(3, "스터디"),
        ;
        private Integer statusCode;
        private String statusTitle;
    }

    @Getter
    @AllArgsConstructor
    public enum RecruitmentStatus implements EnumCommonType {
        RECURITMENT_ING("1", "모집중"),
        RECURITMENT_COMPLETION("2", "모집완료"),
        ;
        private String statusCode;
        private String statusName;



    }






}
