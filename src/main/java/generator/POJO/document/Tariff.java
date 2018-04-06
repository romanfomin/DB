package generator.POJO.document;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAmount;
import generator.customAnnotation.annotations.GenPrice;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenNoun;

public class Tariff implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenNoun
    private String name;

    @GenAmount
    private Integer internetAmount;

    @GenAmount
    private Integer minutesAmount;

    @GenAmount
    private Integer smsAmount;

    @GenPrice
    private Integer price;

    @Override
    public Integer getId() {
        return id;
    }
}
