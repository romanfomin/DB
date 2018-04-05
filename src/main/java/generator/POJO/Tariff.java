package generator.POJO;

import io.dummymaker.annotation.special.GenEnumerate;

public class Tariff {

    @GenEnumerate(from = 1)
    private Integer id;

    private String name;

    private Integer internetAmount;

    private Integer minutesAmount;

    private Integer smsAmount;

    private Integer price;
}
