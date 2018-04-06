package generator.POJO.document;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenPrice;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenNoun;

public class Option implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenNoun
    private String name;

    @GenPrice
    private Integer price;

    @Override
    public Integer getId() {
        return id;
    }
}
