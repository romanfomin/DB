package generator.POJO.column;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAmount;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class UsagePerMonth implements DBObject {

    @GenEnumerate(from = 1)
    private Integer userId;

    @GenAmount
    private Integer internetAmount;

    @GenAmount
    private Integer minutesAmount;

    @GenAmount
    private Integer smsAmount;

    @GenTimestamp
    private Date date;

    @Override
    public Integer getId() {
        return userId;
    }
}
