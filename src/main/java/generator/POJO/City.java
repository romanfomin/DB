package generator.POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;

public class City implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenCity
    private String name;

    @Override
    public Integer getId() {
        return id;
    }
}
