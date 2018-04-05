package generator.POJO;

import io.dummymaker.annotation.special.GenEnumerate;

public class Option implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    private String name;

    private Integer price;

    @Override
    public Integer getId() {
        return id;
    }
}
